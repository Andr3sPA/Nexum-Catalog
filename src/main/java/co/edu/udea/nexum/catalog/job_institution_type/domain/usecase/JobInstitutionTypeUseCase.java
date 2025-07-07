package co.edu.udea.nexum.catalog.job_institution_type.domain.usecase;

import co.edu.udea.nexum.catalog.common.domain.spi.BaseCrudPersistencePort;
import co.edu.udea.nexum.catalog.common.domain.usecase.BaseCrudUseCase;
import co.edu.udea.nexum.catalog.common.domain.utils.validation.ProgramRelatedModelValidator;
import co.edu.udea.nexum.catalog.job_institution_type.domain.api.JobInstitutionTypeServicePort;
import co.edu.udea.nexum.catalog.job_institution_type.domain.model.JobInstitutionType;
import co.edu.udea.nexum.catalog.job_institution_type.domain.spi.JobInstitutionTypePersistencePort;
import co.edu.udea.nexum.catalog.program.domain.spi.ProgramPersistencePort;

import java.util.List;

import static co.edu.udea.nexum.catalog.job_institution_type.domain.utils.constants.JobInstitutionTypeConstants.*;

public class JobInstitutionTypeUseCase extends BaseCrudUseCase<Long, JobInstitutionType> implements JobInstitutionTypeServicePort {

    private final JobInstitutionTypePersistencePort jobInstitutionTypePersistencePort;
    private final ProgramPersistencePort programPersistencePort;

    public JobInstitutionTypeUseCase(
            JobInstitutionTypePersistencePort jobInstitutionTypePersistencePort,
            ProgramPersistencePort programPersistencePort
    ) {
        this.jobInstitutionTypePersistencePort = jobInstitutionTypePersistencePort;
        this.programPersistencePort = programPersistencePort;
    }

    @Override
    protected BaseCrudPersistencePort<Long, JobInstitutionType> getPersistencePort() {
        return jobInstitutionTypePersistencePort;
    }

    @Override
    protected String getModelClassName() {
        return JobInstitutionType.class.getSimpleName();
    }

    @Override
    protected JobInstitutionType patch(JobInstitutionType original, JobInstitutionType patch) {
        if (patch.getName() != null) original.setName(patch.getName());
        if (patch.getProgram() != null) original.setProgram(patch.getProgram());
        return original;
    }

    @Override
    protected void validateEntity(Long currentId, JobInstitutionType model) {
        ProgramRelatedModelValidator.validate(
                currentId,
                model,
                programPersistencePort,
                jobInstitutionTypePersistencePort::findByProgramIdAndName,
                PROGRAM_ID,
                JOB_INSTITUTION_TYPE_NAME
        );
    }

    @Override
    public List<JobInstitutionType> findAllByProgramId(Long programId) {
        return jobInstitutionTypePersistencePort.findAllByProgramId(programId);
    }
}
