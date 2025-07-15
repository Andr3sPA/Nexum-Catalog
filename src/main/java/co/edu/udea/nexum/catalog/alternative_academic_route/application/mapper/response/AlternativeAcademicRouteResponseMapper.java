package co.edu.udea.nexum.catalog.alternative_academic_route.application.mapper.response;

import co.edu.udea.nexum.catalog.common.application.mapper.BaseResponseMapper;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.alternative_academic_route.application.dto.response.AlternativeAcademicRouteResponse;
import co.edu.udea.nexum.catalog.alternative_academic_route.domain.model.AlternativeAcademicRoute;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(
    componentModel = "spring",
    unmappedSourcePolicy = ReportingPolicy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface AlternativeAcademicRouteResponseMapper extends BaseResponseMapper<AlternativeAcademicRoute, AlternativeAcademicRouteResponse> {
}
