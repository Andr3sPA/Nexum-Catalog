package co.edu.udea.nexum.catalog.security.infrastructure.output.feign.mapper;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.output.feign.mapper.FeignResponseMapper;
import co.edu.udea.nexum.catalog.security.domain.model.AuthenticatedUser;
import co.edu.udea.nexum.catalog.security.infrastructure.output.feign.dto.response.AuthenticatedUserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AuthenticationResponseFeignMapper extends FeignResponseMapper<AuthenticatedUser, AuthenticatedUserResponse> {
}
