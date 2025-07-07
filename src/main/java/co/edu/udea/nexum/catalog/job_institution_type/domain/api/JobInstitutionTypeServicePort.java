package co.edu.udea.nexum.catalog.job_institution_type.domain.api;

import co.edu.udea.nexum.catalog.common.domain.api.BaseCrudServicePort;
import co.edu.udea.nexum.catalog.job_institution_type.domain.model.JobInstitutionType;

import java.util.List;

public interface JobInstitutionTypeServicePort extends BaseCrudServicePort<Long, JobInstitutionType> {
    List<JobInstitutionType> findAllByProgramId(Long programId);
}
