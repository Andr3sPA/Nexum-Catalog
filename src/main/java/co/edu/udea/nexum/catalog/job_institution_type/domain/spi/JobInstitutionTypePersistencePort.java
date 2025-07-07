package co.edu.udea.nexum.catalog.job_institution_type.domain.spi;

import co.edu.udea.nexum.catalog.common.domain.spi.BaseCrudPersistencePort;
import co.edu.udea.nexum.catalog.job_institution_type.domain.model.JobInstitutionType;

import java.util.List;

public interface JobInstitutionTypePersistencePort extends BaseCrudPersistencePort<Long, JobInstitutionType> {
    List<JobInstitutionType> findAllByProgramId(Long programId);
    JobInstitutionType findByProgramIdAndName(Long programId, String name);
}
