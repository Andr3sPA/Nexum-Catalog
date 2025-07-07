package co.edu.udea.nexum.catalog.job_area.domain.api;

import co.edu.udea.nexum.catalog.common.domain.api.BaseCrudServicePort;
import co.edu.udea.nexum.catalog.job_area.domain.model.JobArea;

import java.util.List;

public interface JobAreaServicePort extends BaseCrudServicePort<Long, JobArea> {
    List<JobArea> findAllByProgramId(Long programId);
}
