package co.edu.udea.nexum.catalog.program_competency.domain.usecase;

import co.edu.udea.nexum.catalog.common.domain.exception.EntityAlreadyExistsException;
import co.edu.udea.nexum.catalog.common.domain.exception.EntityNotFoundException;
import co.edu.udea.nexum.catalog.common.domain.spi.BaseCrudPersistencePort;
import co.edu.udea.nexum.catalog.common.domain.usecase.BaseCrudUseCase;
import co.edu.udea.nexum.catalog.common.domain.utils.validation.ProgramRelatedModelValidator;
import co.edu.udea.nexum.catalog.program.domain.model.Program;
import co.edu.udea.nexum.catalog.program.domain.spi.ProgramPersistencePort;
import co.edu.udea.nexum.catalog.program_competency.domain.api.ProgramCompetencyServicePort;
import co.edu.udea.nexum.catalog.program_competency.domain.model.ProgramCompetency;
import co.edu.udea.nexum.catalog.program_competency.domain.spi.ProgramCompetencyPersistencePort;

import java.util.List;

import static co.edu.udea.nexum.catalog.program_competency.domain.utils.constants.ProgramCompetencyConstants.*;

public class ProgramCompetencyUseCase extends BaseCrudUseCase<Long, ProgramCompetency>
        implements ProgramCompetencyServicePort {

    private final ProgramCompetencyPersistencePort programCompetencyPersistencePort;
    private final ProgramPersistencePort programPersistencePort;

    public ProgramCompetencyUseCase(
            ProgramCompetencyPersistencePort programCompetencyPersistencePort,
            ProgramPersistencePort programPersistencePort
    ) {
        this.programCompetencyPersistencePort = programCompetencyPersistencePort;
        this.programPersistencePort = programPersistencePort;
    }

    @Override
    protected BaseCrudPersistencePort<Long, ProgramCompetency> getPersistencePort() {
        return programCompetencyPersistencePort;
    }

    @Override
    protected String getModelClassName() {
        return ProgramCompetency.class.getSimpleName();
    }

    @Override
    protected ProgramCompetency patch(ProgramCompetency original, ProgramCompetency patch) {
        if (patch.getName() != null) original.setName(patch.getName());
        if (patch.getDescription() != null) original.setDescription(patch.getDescription());
        if (patch.getProgram() != null) original.setProgram(patch.getProgram());
        return original;
    }

    @Override
    protected void validateEntity(Long currentId, ProgramCompetency model) {
        ProgramRelatedModelValidator.validate(
                currentId,
                model,
                programPersistencePort,
                programCompetencyPersistencePort::findByProgramIdAndName,
                PROGRAM_ID,
                PROGRAM_COMPETENCY_NAME
        );
    }

    @Override
    public List<ProgramCompetency> findAllByProgramId(Long programId) {
        return programCompetencyPersistencePort.findAllByProgramId(programId);
    }
}
