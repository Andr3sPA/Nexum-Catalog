package co.edu.udea.nexum.catalog.alternative_academic_route.infrastructure.output.jpa.mapper;

import co.edu.udea.nexum.catalog.alternative_academic_route.domain.model.AlternativeAcademicRoute;
import co.edu.udea.nexum.catalog.alternative_academic_route.infrastructure.output.jpa.entity.AlternativeAcademicRouteEntity;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.mapper.BaseEntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(
    componentModel = "spring",
    unmappedSourcePolicy = ReportingPolicy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface AlternativeAcademicRouteEntityMapper extends BaseEntityMapper<AlternativeAcademicRoute, AlternativeAcademicRouteEntity> {
}
