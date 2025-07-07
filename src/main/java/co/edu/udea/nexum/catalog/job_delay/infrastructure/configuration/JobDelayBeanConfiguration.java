package co.edu.udea.nexum.catalog.job_delay.infrastructure.configuration;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.job_delay.domain.api.JobDelayServicePort;
import co.edu.udea.nexum.catalog.job_delay.domain.spi.JobDelayPersistencePort;
import co.edu.udea.nexum.catalog.job_delay.domain.usecase.JobDelayUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Generated
@Configuration
public class JobDelayBeanConfiguration {

    @Bean
    public JobDelayServicePort jobDelayServicePort(JobDelayPersistencePort jobDelayPersistencePort) {
        return new JobDelayUseCase(jobDelayPersistencePort);
    }
}
