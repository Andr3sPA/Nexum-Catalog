package co.edu.udea.nexum.catalog.job_delay.infrastructure.output.jpa.adapter;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.adapter.impl.BaseCrudAdapterImpl;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.mapper.BaseEntityMapper;
import co.edu.udea.nexum.catalog.job_delay.domain.model.JobDelay;
import co.edu.udea.nexum.catalog.job_delay.domain.spi.JobDelayPersistencePort;
import co.edu.udea.nexum.catalog.job_delay.infrastructure.output.jpa.entity.JobDelayEntity;
import co.edu.udea.nexum.catalog.job_delay.infrastructure.output.jpa.mapper.JobDelayEntityMapper;
import co.edu.udea.nexum.catalog.job_delay.infrastructure.output.jpa.repository.JobDelayRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Generated
@RequiredArgsConstructor
public class JobDelayJpaAdapter
        extends BaseCrudAdapterImpl<Long, JobDelay, JobDelayEntity>
        implements JobDelayPersistencePort {

    private final JobDelayRepository jobDelayRepository;
    private final JobDelayEntityMapper jobDelayEntityMapper;

    @Override
    protected BaseEntityMapper<JobDelay, JobDelayEntity> getMapper() {
        return jobDelayEntityMapper;
    }

    @Override
    protected CrudRepository<JobDelayEntity, Long> getRepository() {
        return jobDelayRepository;
    }

    @Override
    public List<JobDelay> findAllByOrderByOrderAsc() {
        return jobDelayEntityMapper.toDomains(jobDelayRepository.findAllByOrderByOrderAsc());
    }
}
