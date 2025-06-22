package co.edu.udea.nexum.catalog.security.domain.usecase;

import co.edu.udea.nexum.catalog.security.domain.api.security.AuthServicePort;
import co.edu.udea.nexum.catalog.security.domain.model.AuthenticatedUser;
import co.edu.udea.nexum.catalog.security.domain.spi.security.AuthPersistencePort;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;

@Generated
public class AuthUseCase implements AuthServicePort {
    private final AuthPersistencePort authPersistencePort;

    public AuthUseCase(AuthPersistencePort authPersistencePort) {
        this.authPersistencePort = authPersistencePort;
    }

    @Override
    public AuthenticatedUser validateToken(String token) {
        return authPersistencePort.validateToken(token);
    }
}
