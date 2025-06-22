package co.edu.udea.nexum.catalog.common.infrastructure.configuration;

import co.edu.udea.nexum.catalog.security.domain.api.security.AuthServicePort;
import co.edu.udea.nexum.catalog.security.domain.spi.security.AuthPersistencePort;
import co.edu.udea.nexum.catalog.security.domain.usecase.AuthUseCase;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;

@Generated
@Configuration
public class CommonBeanConfiguration {
    @Bean
    public AuthServicePort authServicePort(AuthPersistencePort authPersistencePort) {
        return new AuthUseCase(authPersistencePort);
    }

    @Bean
    AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }

    @Bean
    AuthenticationProvider authenticationProvider(UserDetailsService userDetailsService) {
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setUserDetailsService(userDetailsService);
        return daoAuthenticationProvider;
    }
}
