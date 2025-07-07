package co.edu.udea.nexum.catalog.salary_range.infrastructure.output.jpa.adapter;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.adapter.impl.BaseCrudAdapterImpl;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.mapper.BaseEntityMapper;
import co.edu.udea.nexum.catalog.salary_range.domain.model.SalaryRange;
import co.edu.udea.nexum.catalog.salary_range.domain.spi.SalaryRangePersistencePort;
import co.edu.udea.nexum.catalog.salary_range.infrastructure.output.jpa.entity.SalaryRangeEntity;
import co.edu.udea.nexum.catalog.salary_range.infrastructure.output.jpa.mapper.SalaryRangeEntityMapper;
import co.edu.udea.nexum.catalog.salary_range.infrastructure.output.jpa.repository.SalaryRangeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Generated
@RequiredArgsConstructor
public class SalaryRangeJpaAdapter
        extends BaseCrudAdapterImpl<Long, SalaryRange, SalaryRangeEntity>
        implements SalaryRangePersistencePort {

    private final SalaryRangeRepository salaryRangeRepository;
    private final SalaryRangeEntityMapper salaryRangeEntityMapper;

    @Override
    protected BaseEntityMapper<SalaryRange, SalaryRangeEntity> getMapper() {
        return salaryRangeEntityMapper;
    }

    @Override
    protected CrudRepository<SalaryRangeEntity, Long> getRepository() {
        return salaryRangeRepository;
    }

    @Override
    public List<SalaryRange> findAllByOrderByOrderAsc() {
        return salaryRangeEntityMapper.toDomains(salaryRangeRepository.findAllByOrderByOrderAsc());
    }
}
