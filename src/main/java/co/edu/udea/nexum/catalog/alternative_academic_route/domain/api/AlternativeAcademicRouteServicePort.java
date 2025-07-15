package co.edu.udea.nexum.catalog.alternative_academic_route.domain.api;

import co.edu.udea.nexum.catalog.common.domain.api.BaseCrudServicePort;
import co.edu.udea.nexum.catalog.alternative_academic_route.domain.model.AlternativeAcademicRoute;

import java.util.List;

public interface AlternativeAcademicRouteServicePort extends BaseCrudServicePort<Long, AlternativeAcademicRoute> {
    List<AlternativeAcademicRoute> findAllByEnabled(boolean enabled);
}
