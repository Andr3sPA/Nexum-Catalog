package co.edu.udea.nexum.catalog.program_version.domain.usecase;

import co.edu.udea.nexum.catalog.common.domain.exception.EntityAlreadyExistsException;
import co.edu.udea.nexum.catalog.common.domain.exception.EntityNotFoundException;
import co.edu.udea.nexum.catalog.common.domain.spi.BaseCrudPersistencePort;
import co.edu.udea.nexum.catalog.common.domain.usecase.BaseCrudUseCase;
import co.edu.udea.nexum.catalog.program.domain.model.Program;
import co.edu.udea.nexum.catalog.program.domain.spi.ProgramPersistencePort;
import co.edu.udea.nexum.catalog.program_version.domain.api.ProgramVersionServicePort;
import co.edu.udea.nexum.catalog.program_version.domain.model.ProgramVersion;
import co.edu.udea.nexum.catalog.program_version.domain.spi.ProgramVersionPersistencePort;

import static co.edu.udea.nexum.catalog.program_version.domain.utils.constants.ProgramVersionDomainConstants.PROGRAM_VERSION_ALREADY_EXISTS_MESSAGE_TEMPLATE;

public class ProgramVersionUseCase extends BaseCrudUseCase<Long, ProgramVersion> implements ProgramVersionServicePort {
    private final ProgramVersionPersistencePort programVersionPersistencePort;
    private final ProgramPersistencePort programPersistencePort;

    public ProgramVersionUseCase(
            ProgramVersionPersistencePort programVersionPersistencePort,
            ProgramPersistencePort programPersistencePort
    ) {
        this.programVersionPersistencePort = programVersionPersistencePort;
        this.programPersistencePort = programPersistencePort;
    }

    @Override
    protected BaseCrudPersistencePort<Long, ProgramVersion> getPersistencePort() {
        return programVersionPersistencePort;
    }

    @Override
    protected String getModelClassName() {
        return ProgramVersion.class.getSimpleName();
    }

    @Override
    protected void validateEntity(Long currentId, ProgramVersion model) {
        Program program = programPersistencePort.findById(model.getProgram().getId());
        if (program == null) {
            throw new EntityNotFoundException(Program.class.getSimpleName());
        }

        ProgramVersion existingVersion = programVersionPersistencePort
                .findByProgramIdAndVersion(model.getProgram().getId(), model.getVersion());

        if (existingVersion != null && !existingVersion.getId().equals(currentId)) {
            throw new EntityAlreadyExistsException(String.format(
                    PROGRAM_VERSION_ALREADY_EXISTS_MESSAGE_TEMPLATE,
                    program.getName(),
                    model.getVersion()
            ));
        }
    }

}
