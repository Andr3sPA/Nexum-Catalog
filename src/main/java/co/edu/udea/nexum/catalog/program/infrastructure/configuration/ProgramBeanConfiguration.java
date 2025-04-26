package co.edu.udea.nexum.catalog.program.infrastructure.configuration;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.program.domain.api.ProgramServicePort;
import co.edu.udea.nexum.catalog.program.domain.spi.ProgramPersistencePort;
import co.edu.udea.nexum.catalog.program.domain.usecase.ProgramUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Generated
@Configuration
public class ProgramBeanConfiguration {
    @Bean
    public ProgramServicePort programServicePort(ProgramPersistencePort programPersistencePort) {
        return new ProgramUseCase(programPersistencePort);
    }
}

