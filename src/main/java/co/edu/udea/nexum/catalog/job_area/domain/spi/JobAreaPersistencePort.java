package co.edu.udea.nexum.catalog.job_area.domain.spi;

import co.edu.udea.nexum.catalog.common.domain.spi.BaseCrudPersistencePort;
import co.edu.udea.nexum.catalog.job_area.domain.model.JobArea;

import java.util.List;

public interface JobAreaPersistencePort extends BaseCrudPersistencePort<Long, JobArea> {
    List<JobArea> findAllByProgramId(Long programId);
    JobArea findByProgramIdAndName(Long programId, String name);
}
