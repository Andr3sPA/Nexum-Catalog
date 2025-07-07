package co.edu.udea.nexum.catalog.job_area.infrastructure.output.jpa.adapter;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.adapter.impl.BaseCrudAdapterImpl;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.mapper.BaseEntityMapper;
import co.edu.udea.nexum.catalog.job_area.domain.model.JobArea;
import co.edu.udea.nexum.catalog.job_area.domain.spi.JobAreaPersistencePort;
import co.edu.udea.nexum.catalog.job_area.infrastructure.output.jpa.entity.JobAreaEntity;
import co.edu.udea.nexum.catalog.job_area.infrastructure.output.jpa.mapper.JobAreaEntityMapper;
import co.edu.udea.nexum.catalog.job_area.infrastructure.output.jpa.repository.JobAreaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Generated
@RequiredArgsConstructor
public class JobAreaJpaAdapter
        extends BaseCrudAdapterImpl<Long, JobArea, JobAreaEntity>
        implements JobAreaPersistencePort {

    private final JobAreaRepository jobAreaRepository;
    private final JobAreaEntityMapper jobAreaEntityMapper;

    @Override
    protected CrudRepository<JobAreaEntity, Long> getRepository() {
        return jobAreaRepository;
    }

    @Override
    protected BaseEntityMapper<JobArea, JobAreaEntity> getMapper() {
        return jobAreaEntityMapper;
    }

    @Override
    public List<JobArea> findAllByProgramId(Long programId) {
        return jobAreaEntityMapper.toDomains(jobAreaRepository.findAllByProgram_Id(programId));
    }

    @Override
    public JobArea findByProgramIdAndName(Long programId, String name) {
        return jobAreaRepository.findByProgram_IdAndName(programId, name)
                .map(jobAreaEntityMapper::toDomain)
                .orElse(null);
    }
}
