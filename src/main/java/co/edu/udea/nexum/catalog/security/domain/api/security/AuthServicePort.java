package co.edu.udea.nexum.catalog.security.domain.api.security;

import co.edu.udea.nexum.catalog.security.domain.model.AuthenticatedUser;

public interface AuthServicePort {
    AuthenticatedUser validateToken(String token);
}
