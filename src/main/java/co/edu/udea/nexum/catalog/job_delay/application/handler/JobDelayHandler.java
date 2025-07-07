package co.edu.udea.nexum.catalog.job_delay.application.handler;

import co.edu.udea.nexum.catalog.common.application.handler.BaseCrudHandler;
import co.edu.udea.nexum.catalog.job_delay.application.dto.request.JobDelayRequest;
import co.edu.udea.nexum.catalog.job_delay.application.dto.response.JobDelayResponse;

public interface JobDelayHandler extends BaseCrudHandler<Long, JobDelayResponse, JobDelayRequest> {
}
