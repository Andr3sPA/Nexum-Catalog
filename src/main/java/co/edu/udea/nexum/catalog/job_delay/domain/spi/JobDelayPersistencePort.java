package co.edu.udea.nexum.catalog.job_delay.domain.spi;

import co.edu.udea.nexum.catalog.common.domain.spi.BaseCrudPersistencePort;
import co.edu.udea.nexum.catalog.job_delay.domain.model.JobDelay;

import java.util.List;

public interface JobDelayPersistencePort extends BaseCrudPersistencePort<Long, JobDelay> {
    List<JobDelay> findAllByOrderByOrderAsc();
}
