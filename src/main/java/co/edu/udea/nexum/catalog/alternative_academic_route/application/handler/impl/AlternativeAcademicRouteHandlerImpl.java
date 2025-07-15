package co.edu.udea.nexum.catalog.alternative_academic_route.application.handler.impl;

import co.edu.udea.nexum.catalog.common.application.handler.impl.BaseCrudHandlerImpl;
import co.edu.udea.nexum.catalog.common.application.mapper.BaseRequestMapper;
import co.edu.udea.nexum.catalog.common.application.mapper.BaseResponseMapper;
import co.edu.udea.nexum.catalog.common.domain.api.BaseCrudServicePort;
import co.edu.udea.nexum.catalog.alternative_academic_route.application.dto.request.AlternativeAcademicRouteRequest;
import co.edu.udea.nexum.catalog.alternative_academic_route.application.dto.response.AlternativeAcademicRouteResponse;
import co.edu.udea.nexum.catalog.alternative_academic_route.application.handler.AlternativeAcademicRouteHandler;
import co.edu.udea.nexum.catalog.alternative_academic_route.application.mapper.request.AlternativeAcademicRouteRequestMapper;
import co.edu.udea.nexum.catalog.alternative_academic_route.application.mapper.response.AlternativeAcademicRouteResponseMapper;
import co.edu.udea.nexum.catalog.alternative_academic_route.domain.api.AlternativeAcademicRouteServicePort;
import co.edu.udea.nexum.catalog.alternative_academic_route.domain.model.AlternativeAcademicRoute;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlternativeAcademicRouteHandlerImpl
        extends BaseCrudHandlerImpl<Long, AlternativeAcademicRoute, AlternativeAcademicRouteResponse, AlternativeAcademicRouteRequest>
        implements AlternativeAcademicRouteHandler {

    private final AlternativeAcademicRouteServicePort alternativeAcademicRouteServicePort;
    private final AlternativeAcademicRouteRequestMapper requestMapper;
    private final AlternativeAcademicRouteResponseMapper responseMapper;

    @Override
    protected BaseCrudServicePort<Long, AlternativeAcademicRoute> getServicePort() {
        return alternativeAcademicRouteServicePort;
    }

    @Override
    protected BaseRequestMapper<AlternativeAcademicRoute, AlternativeAcademicRouteRequest> getRequestMapper() {
        return requestMapper;
    }

    @Override
    protected BaseResponseMapper<AlternativeAcademicRoute, AlternativeAcademicRouteResponse> getResponseMapper() {
        return responseMapper;
    }

    @Override
    public List<AlternativeAcademicRouteResponse> findAllByEnabled(boolean enabled) {
        return responseMapper.toResponses(alternativeAcademicRouteServicePort.findAllByEnabled(enabled));
    }
}
