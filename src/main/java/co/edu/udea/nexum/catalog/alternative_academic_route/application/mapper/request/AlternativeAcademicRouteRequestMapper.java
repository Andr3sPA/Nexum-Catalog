package co.edu.udea.nexum.catalog.alternative_academic_route.application.mapper.request;

import co.edu.udea.nexum.catalog.common.application.mapper.BaseRequestMapper;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.alternative_academic_route.application.dto.request.AlternativeAcademicRouteRequest;
import co.edu.udea.nexum.catalog.alternative_academic_route.domain.model.AlternativeAcademicRoute;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(
    componentModel = "spring",
    unmappedSourcePolicy = ReportingPolicy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface AlternativeAcademicRouteRequestMapper extends BaseRequestMapper<AlternativeAcademicRoute, AlternativeAcademicRouteRequest> {
}
