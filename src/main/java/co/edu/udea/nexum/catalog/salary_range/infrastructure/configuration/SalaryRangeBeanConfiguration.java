package co.edu.udea.nexum.catalog.salary_range.infrastructure.configuration;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.salary_range.domain.api.SalaryRangeServicePort;
import co.edu.udea.nexum.catalog.salary_range.domain.spi.SalaryRangePersistencePort;
import co.edu.udea.nexum.catalog.salary_range.domain.usecase.SalaryRangeUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Generated
@Configuration
public class SalaryRangeBeanConfiguration {

    @Bean
    public SalaryRangeServicePort salaryRangeServicePort(SalaryRangePersistencePort salaryRangePersistencePort) {
        return new SalaryRangeUseCase(salaryRangePersistencePort);
    }
}
