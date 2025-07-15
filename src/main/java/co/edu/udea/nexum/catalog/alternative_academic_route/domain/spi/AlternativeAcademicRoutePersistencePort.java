package co.edu.udea.nexum.catalog.alternative_academic_route.domain.spi;

import co.edu.udea.nexum.catalog.common.domain.spi.BaseCrudPersistencePort;
import co.edu.udea.nexum.catalog.alternative_academic_route.domain.model.AlternativeAcademicRoute;

import java.util.List;

public interface AlternativeAcademicRoutePersistencePort extends BaseCrudPersistencePort<Long, AlternativeAcademicRoute> {
    List<AlternativeAcademicRoute> findAllByEnabled(boolean enabled);
    boolean existsByName(String name);
}
