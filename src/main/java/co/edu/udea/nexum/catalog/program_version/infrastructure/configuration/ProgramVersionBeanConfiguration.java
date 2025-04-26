package co.edu.udea.nexum.catalog.program_version.infrastructure.configuration;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.program_version.domain.api.ProgramVersionServicePort;
import co.edu.udea.nexum.catalog.program_version.domain.spi.ProgramVersionPersistencePort;
import co.edu.udea.nexum.catalog.program_version.domain.usecase.ProgramVersionUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Generated
@Configuration
public class ProgramVersionBeanConfiguration {
    @Bean
    public ProgramVersionServicePort programVersionServicePort(
            ProgramVersionPersistencePort programVersionPersistencePort
    ) {
        return new ProgramVersionUseCase(programVersionPersistencePort);
    }
}
