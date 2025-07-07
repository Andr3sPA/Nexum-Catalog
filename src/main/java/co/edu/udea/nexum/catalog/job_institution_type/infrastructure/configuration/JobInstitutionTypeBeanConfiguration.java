package co.edu.udea.nexum.catalog.job_institution_type.infrastructure.configuration;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.job_institution_type.domain.api.JobInstitutionTypeServicePort;
import co.edu.udea.nexum.catalog.job_institution_type.domain.spi.JobInstitutionTypePersistencePort;
import co.edu.udea.nexum.catalog.job_institution_type.domain.usecase.JobInstitutionTypeUseCase;
import co.edu.udea.nexum.catalog.program.domain.spi.ProgramPersistencePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Generated
@Configuration
public class JobInstitutionTypeBeanConfiguration {

    @Bean
    public JobInstitutionTypeServicePort jobInstitutionTypeServicePort(
            JobInstitutionTypePersistencePort jobInstitutionTypePersistencePort,
            ProgramPersistencePort programPersistencePort
    ) {
        return new JobInstitutionTypeUseCase(jobInstitutionTypePersistencePort, programPersistencePort);
    }
}
