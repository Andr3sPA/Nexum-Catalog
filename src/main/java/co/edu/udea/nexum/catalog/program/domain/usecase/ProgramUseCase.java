package co.edu.udea.nexum.catalog.program.domain.usecase;

import co.edu.udea.nexum.catalog.common.domain.exception.EntityAlreadyExistsException;
import co.edu.udea.nexum.catalog.common.domain.spi.BaseCrudPersistencePort;
import co.edu.udea.nexum.catalog.common.domain.usecase.BaseCrudUseCase;
import co.edu.udea.nexum.catalog.program.domain.api.ProgramServicePort;
import co.edu.udea.nexum.catalog.program.domain.model.Program;
import co.edu.udea.nexum.catalog.program.domain.spi.ProgramPersistencePort;

import static co.edu.udea.nexum.catalog.program.domain.utils.constants.ProgramDomainConstants.*;

public class ProgramUseCase extends BaseCrudUseCase<Long, Program> implements ProgramServicePort {
    private final ProgramPersistencePort programPersistencePort;

    public ProgramUseCase(ProgramPersistencePort programPersistencePort) {
        this.programPersistencePort = programPersistencePort;
    }

    @Override
    protected BaseCrudPersistencePort<Long, Program> getPersistencePort() {
        return programPersistencePort;
    }

    @Override
    protected String getModelClassName() {
        return Program.class.getSimpleName();
    }

    protected void validateEntity(Long currentId, Program program) {
        Program foundProgram = programPersistencePort.findBySniesCode(program.getSniesCode());
        if (foundProgram != null && !foundProgram.getId().equals(currentId)) {
            throw new EntityAlreadyExistsException(
                    Program.class.getSimpleName(),
                    SNIES_CODE_FIELD,
                    program.getSniesCode()
            );
        }
    }
}
