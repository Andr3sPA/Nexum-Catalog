package co.edu.udea.nexum.catalog.job_institution_type.application.handler.impl;

import co.edu.udea.nexum.catalog.common.application.handler.impl.BaseCrudHandlerImpl;
import co.edu.udea.nexum.catalog.common.application.mapper.BaseRequestMapper;
import co.edu.udea.nexum.catalog.common.application.mapper.BaseResponseMapper;
import co.edu.udea.nexum.catalog.common.domain.api.BaseCrudServicePort;
import co.edu.udea.nexum.catalog.job_institution_type.application.dto.request.JobInstitutionTypeRequest;
import co.edu.udea.nexum.catalog.job_institution_type.application.dto.response.JobInstitutionTypeResponse;
import co.edu.udea.nexum.catalog.job_institution_type.application.handler.JobInstitutionTypeHandler;
import co.edu.udea.nexum.catalog.job_institution_type.application.mapper.request.JobInstitutionTypeRequestMapper;
import co.edu.udea.nexum.catalog.job_institution_type.application.mapper.response.JobInstitutionTypeResponseMapper;
import co.edu.udea.nexum.catalog.job_institution_type.domain.api.JobInstitutionTypeServicePort;
import co.edu.udea.nexum.catalog.job_institution_type.domain.model.JobInstitutionType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JobInstitutionTypeHandlerImpl
        extends BaseCrudHandlerImpl<Long, JobInstitutionType, JobInstitutionTypeResponse, JobInstitutionTypeRequest>
        implements JobInstitutionTypeHandler {

    private final JobInstitutionTypeServicePort jobInstitutionTypeServicePort;
    private final JobInstitutionTypeRequestMapper jobInstitutionTypeRequestMapper;
    private final JobInstitutionTypeResponseMapper jobInstitutionTypeResponseMapper;

    @Override
    protected BaseCrudServicePort<Long, JobInstitutionType> getServicePort() {
        return jobInstitutionTypeServicePort;
    }

    @Override
    protected BaseRequestMapper<JobInstitutionType, JobInstitutionTypeRequest> getRequestMapper() {
        return jobInstitutionTypeRequestMapper;
    }

    @Override
    protected BaseResponseMapper<JobInstitutionType, JobInstitutionTypeResponse> getResponseMapper() {
        return jobInstitutionTypeResponseMapper;
    }

    @Override
    public List<JobInstitutionTypeResponse> findAllByProgramId(Long programId) {
        return jobInstitutionTypeResponseMapper.toResponses(
                jobInstitutionTypeServicePort.findAllByProgramId(programId)
        );
    }
}
