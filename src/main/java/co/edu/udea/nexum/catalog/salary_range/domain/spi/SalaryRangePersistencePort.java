package co.edu.udea.nexum.catalog.salary_range.domain.spi;

import co.edu.udea.nexum.catalog.common.domain.spi.BaseCrudPersistencePort;
import co.edu.udea.nexum.catalog.salary_range.domain.model.SalaryRange;

import java.util.List;

public interface SalaryRangePersistencePort extends BaseCrudPersistencePort<Long, SalaryRange> {
    List<SalaryRange> findAllByOrderByOrderAsc();
}
