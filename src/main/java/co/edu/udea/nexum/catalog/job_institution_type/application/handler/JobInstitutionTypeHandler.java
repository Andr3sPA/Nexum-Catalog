package co.edu.udea.nexum.catalog.job_institution_type.application.handler;

import co.edu.udea.nexum.catalog.common.application.handler.BaseCrudHandler;
import co.edu.udea.nexum.catalog.job_institution_type.application.dto.request.JobInstitutionTypeRequest;
import co.edu.udea.nexum.catalog.job_institution_type.application.dto.response.JobInstitutionTypeResponse;

import java.util.List;

public interface JobInstitutionTypeHandler extends BaseCrudHandler<Long, JobInstitutionTypeResponse, JobInstitutionTypeRequest> {
    List<JobInstitutionTypeResponse> findAllByProgramId(Long programId);
}
