package co.edu.udea.nexum.catalog.security.domain.spi.security;

import co.edu.udea.nexum.catalog.security.domain.model.AuthenticatedUser;

public interface AuthPersistencePort {
    AuthenticatedUser validateToken(String token);
}
