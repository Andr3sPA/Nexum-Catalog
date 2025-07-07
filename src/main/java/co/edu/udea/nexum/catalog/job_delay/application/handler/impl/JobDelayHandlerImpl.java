package co.edu.udea.nexum.catalog.job_delay.application.handler.impl;

import co.edu.udea.nexum.catalog.common.application.handler.impl.BaseCrudHandlerImpl;
import co.edu.udea.nexum.catalog.common.application.mapper.BaseRequestMapper;
import co.edu.udea.nexum.catalog.common.application.mapper.BaseResponseMapper;
import co.edu.udea.nexum.catalog.common.domain.api.BaseCrudServicePort;
import co.edu.udea.nexum.catalog.job_delay.application.dto.request.JobDelayRequest;
import co.edu.udea.nexum.catalog.job_delay.application.dto.response.JobDelayResponse;
import co.edu.udea.nexum.catalog.job_delay.application.handler.JobDelayHandler;
import co.edu.udea.nexum.catalog.job_delay.application.mapper.request.JobDelayRequestMapper;
import co.edu.udea.nexum.catalog.job_delay.application.mapper.response.JobDelayResponseMapper;
import co.edu.udea.nexum.catalog.job_delay.domain.api.JobDelayServicePort;
import co.edu.udea.nexum.catalog.job_delay.domain.model.JobDelay;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JobDelayHandlerImpl
        extends BaseCrudHandlerImpl<Long, JobDelay, JobDelayResponse, JobDelayRequest>
        implements JobDelayHandler {

    private final JobDelayServicePort jobDelayServicePort;
    private final JobDelayResponseMapper jobDelayResponseMapper;
    private final JobDelayRequestMapper jobDelayRequestMapper;

    @Override
    protected BaseCrudServicePort<Long, JobDelay> getServicePort() {
        return jobDelayServicePort;
    }

    @Override
    protected BaseResponseMapper<JobDelay, JobDelayResponse> getResponseMapper() {
        return jobDelayResponseMapper;
    }

    @Override
    protected BaseRequestMapper<JobDelay, JobDelayRequest> getRequestMapper() {
        return jobDelayRequestMapper;
    }
}
