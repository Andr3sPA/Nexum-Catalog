package co.edu.udea.nexum.catalog.job_area.domain.usecase;

import co.edu.udea.nexum.catalog.common.domain.spi.BaseCrudPersistencePort;
import co.edu.udea.nexum.catalog.common.domain.usecase.BaseCrudUseCase;
import co.edu.udea.nexum.catalog.common.domain.utils.validation.ProgramRelatedModelValidator;
import co.edu.udea.nexum.catalog.job_area.domain.api.JobAreaServicePort;
import co.edu.udea.nexum.catalog.job_area.domain.model.JobArea;
import co.edu.udea.nexum.catalog.job_area.domain.spi.JobAreaPersistencePort;
import co.edu.udea.nexum.catalog.program.domain.spi.ProgramPersistencePort;

import java.util.List;

import static co.edu.udea.nexum.catalog.job_area.domain.utils.constants.JobAreaConstants.*;

public class JobAreaUseCase extends BaseCrudUseCase<Long, JobArea> implements JobAreaServicePort {

    private final JobAreaPersistencePort jobAreaPersistencePort;
    private final ProgramPersistencePort programPersistencePort;

    public JobAreaUseCase(
            JobAreaPersistencePort jobAreaPersistencePort,
            ProgramPersistencePort programPersistencePort
    ) {
        this.jobAreaPersistencePort = jobAreaPersistencePort;
        this.programPersistencePort = programPersistencePort;
    }

    @Override
    protected BaseCrudPersistencePort<Long, JobArea> getPersistencePort() {
        return jobAreaPersistencePort;
    }

    @Override
    protected String getModelClassName() {
        return JobArea.class.getSimpleName();
    }

    @Override
    protected JobArea patch(JobArea original, JobArea patch) {
        if (patch.getName() != null) original.setName(patch.getName());
        if (patch.getProgram() != null) original.setProgram(patch.getProgram());
        return original;
    }

    @Override
    protected void validateEntity(Long currentId, JobArea model) {
        ProgramRelatedModelValidator.validate(
                currentId,
                model,
                programPersistencePort,
                jobAreaPersistencePort::findByProgramIdAndName,
                PROGRAM_ID,
                JOB_AREA_NAME
        );
    }


    @Override
    public List<JobArea> findAllByProgramId(Long programId) {
        return jobAreaPersistencePort.findAllByProgramId(programId);
    }
}
