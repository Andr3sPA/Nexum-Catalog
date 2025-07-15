package co.edu.udea.nexum.catalog.innovation_process_type.infrastructure.configuration;

import co.edu.udea.nexum.catalog.innovation_process_type.domain.api.InnovationProcessTypeServicePort;
import co.edu.udea.nexum.catalog.innovation_process_type.domain.spi.InnovationProcessTypePersistencePort;
import co.edu.udea.nexum.catalog.innovation_process_type.domain.usecase.InnovationProcessTypeUseCase;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Generated
@Configuration
public class InnovationProcessTypeBeanConfiguration {
    @Bean
    public InnovationProcessTypeServicePort innovationProcessTypeServicePort(
            InnovationProcessTypePersistencePort persistencePort
    ) {
        return new InnovationProcessTypeUseCase(persistencePort);
    }
}
