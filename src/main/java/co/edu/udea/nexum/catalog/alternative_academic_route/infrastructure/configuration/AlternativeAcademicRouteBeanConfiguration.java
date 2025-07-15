package co.edu.udea.nexum.catalog.alternative_academic_route.infrastructure.configuration;

import co.edu.udea.nexum.catalog.alternative_academic_route.domain.api.AlternativeAcademicRouteServicePort;
import co.edu.udea.nexum.catalog.alternative_academic_route.domain.spi.AlternativeAcademicRoutePersistencePort;
import co.edu.udea.nexum.catalog.alternative_academic_route.domain.usecase.AlternativeAcademicRouteUseCase;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Generated
@Configuration
public class AlternativeAcademicRouteBeanConfiguration {
    @Bean
    public AlternativeAcademicRouteServicePort alternativeAcademicRouteServicePort(
            AlternativeAcademicRoutePersistencePort alternativeAcademicRoutePersistencePort
    ) {
        return new AlternativeAcademicRouteUseCase(alternativeAcademicRoutePersistencePort);
    }
}
