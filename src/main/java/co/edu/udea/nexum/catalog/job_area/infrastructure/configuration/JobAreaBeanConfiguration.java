package co.edu.udea.nexum.catalog.job_area.infrastructure.configuration;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.job_area.domain.api.JobAreaServicePort;
import co.edu.udea.nexum.catalog.job_area.domain.spi.JobAreaPersistencePort;
import co.edu.udea.nexum.catalog.job_area.domain.usecase.JobAreaUseCase;
import co.edu.udea.nexum.catalog.program.domain.spi.ProgramPersistencePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Generated
@Configuration
public class JobAreaBeanConfiguration {

    @Bean
    public JobAreaServicePort jobAreaServicePort(
            JobAreaPersistencePort jobAreaPersistencePort,
            ProgramPersistencePort programPersistencePort
    ) {
        return new JobAreaUseCase(jobAreaPersistencePort, programPersistencePort);
    }
}
