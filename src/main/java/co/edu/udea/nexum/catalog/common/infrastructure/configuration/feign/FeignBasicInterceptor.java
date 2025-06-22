package co.edu.udea.nexum.catalog.common.infrastructure.configuration.feign;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.utils.constants.ConfigurationConstants;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import static co.edu.udea.nexum.catalog.common.infrastructure.utils.constants.ConfigurationConstants.*;

@Generated
public class FeignBasicInterceptor {
    @Bean
    public RequestInterceptor feignInterceptor() {
        return requestTemplate -> {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            if (authentication != null && authentication.isAuthenticated()) {
                requestTemplate.header(
                        AUTHORIZATION_HEADER,
                        TOKEN_PREFIX + authentication.getCredentials().toString()
                );
            }
        };
    }
}
