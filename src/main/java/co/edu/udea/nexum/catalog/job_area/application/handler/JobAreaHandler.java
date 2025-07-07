package co.edu.udea.nexum.catalog.job_area.application.handler;

import co.edu.udea.nexum.catalog.common.application.handler.BaseCrudHandler;
import co.edu.udea.nexum.catalog.job_area.application.dto.request.JobAreaRequest;
import co.edu.udea.nexum.catalog.job_area.application.dto.response.JobAreaResponse;

import java.util.List;

public interface JobAreaHandler extends BaseCrudHandler<Long, JobAreaResponse, JobAreaRequest> {
    List<JobAreaResponse> findAllByProgramId(Long programId);
}
