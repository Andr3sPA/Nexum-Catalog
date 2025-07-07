package co.edu.udea.nexum.catalog.job_area.application.handler.impl;

import co.edu.udea.nexum.catalog.common.application.handler.impl.BaseCrudHandlerImpl;
import co.edu.udea.nexum.catalog.common.application.mapper.BaseRequestMapper;
import co.edu.udea.nexum.catalog.common.application.mapper.BaseResponseMapper;
import co.edu.udea.nexum.catalog.common.domain.api.BaseCrudServicePort;
import co.edu.udea.nexum.catalog.job_area.application.dto.request.JobAreaRequest;
import co.edu.udea.nexum.catalog.job_area.application.dto.response.JobAreaResponse;
import co.edu.udea.nexum.catalog.job_area.application.handler.JobAreaHandler;
import co.edu.udea.nexum.catalog.job_area.application.mapper.request.JobAreaRequestMapper;
import co.edu.udea.nexum.catalog.job_area.application.mapper.response.JobAreaResponseMapper;
import co.edu.udea.nexum.catalog.job_area.domain.api.JobAreaServicePort;
import co.edu.udea.nexum.catalog.job_area.domain.model.JobArea;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JobAreaHandlerImpl
        extends BaseCrudHandlerImpl<Long, JobArea, JobAreaResponse, JobAreaRequest>
        implements JobAreaHandler {

    private final JobAreaServicePort jobAreaServicePort;
    private final JobAreaRequestMapper jobAreaRequestMapper;
    private final JobAreaResponseMapper jobAreaResponseMapper;

    @Override
    protected BaseCrudServicePort<Long, JobArea> getServicePort() {
        return jobAreaServicePort;
    }

    @Override
    protected BaseRequestMapper<JobArea, JobAreaRequest> getRequestMapper() {
        return jobAreaRequestMapper;
    }

    @Override
    protected BaseResponseMapper<JobArea, JobAreaResponse> getResponseMapper() {
        return jobAreaResponseMapper;
    }

    @Override
    public List<JobAreaResponse> findAllByProgramId(Long programId) {
        return jobAreaResponseMapper.toResponses(jobAreaServicePort.findAllByProgramId(programId));
    }
}
