package co.edu.udea.nexum.catalog.alternative_academic_route.application.handler;

import co.edu.udea.nexum.catalog.common.application.handler.BaseCrudHandler;
import co.edu.udea.nexum.catalog.alternative_academic_route.application.dto.request.AlternativeAcademicRouteRequest;
import co.edu.udea.nexum.catalog.alternative_academic_route.application.dto.response.AlternativeAcademicRouteResponse;

import java.util.List;

public interface AlternativeAcademicRouteHandler extends BaseCrudHandler<Long, AlternativeAcademicRouteResponse, AlternativeAcademicRouteRequest> {
    List<AlternativeAcademicRouteResponse> findAllByEnabled(boolean enabled);
}
