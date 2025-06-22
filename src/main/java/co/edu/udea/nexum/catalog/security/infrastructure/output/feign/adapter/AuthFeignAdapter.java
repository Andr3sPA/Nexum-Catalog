package co.edu.udea.nexum.catalog.security.infrastructure.output.feign.adapter;

import co.edu.udea.nexum.catalog.security.domain.model.AuthenticatedUser;
import co.edu.udea.nexum.catalog.security.domain.spi.security.AuthPersistencePort;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.security.infrastructure.output.feign.client.AuthFeign;
import co.edu.udea.nexum.catalog.security.infrastructure.output.feign.mapper.AuthenticationResponseFeignMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Generated
@RequiredArgsConstructor
public class AuthFeignAdapter implements AuthPersistencePort {
    private final AuthFeign authFeign;
    private final AuthenticationResponseFeignMapper authenticationResponseFeignMapper;

    @Override
    public AuthenticatedUser validateToken(String token) {
        return authenticationResponseFeignMapper.toDomain(
                authFeign.validateToken(token)
        );
    }
}
