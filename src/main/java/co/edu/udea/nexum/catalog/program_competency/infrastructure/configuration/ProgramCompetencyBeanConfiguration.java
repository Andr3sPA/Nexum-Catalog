package co.edu.udea.nexum.catalog.program_competency.infrastructure.configuration;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.program_competency.domain.api.ProgramCompetencyServicePort;
import co.edu.udea.nexum.catalog.program_competency.domain.spi.ProgramCompetencyPersistencePort;
import co.edu.udea.nexum.catalog.program_competency.domain.usecase.ProgramCompetencyUseCase;
import co.edu.udea.nexum.catalog.program.domain.spi.ProgramPersistencePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Generated
@Configuration
public class ProgramCompetencyBeanConfiguration {

    @Bean
    public ProgramCompetencyServicePort programCompetencyServicePort(
            ProgramCompetencyPersistencePort programCompetencyPersistencePort,
            ProgramPersistencePort programPersistencePort
    ) {
        return new ProgramCompetencyUseCase(programCompetencyPersistencePort, programPersistencePort);
    }
}
