package co.edu.udea.nexum.catalog.job_institution_type.infrastructure.output.jpa.adapter;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.adapter.impl.BaseCrudAdapterImpl;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.mapper.BaseEntityMapper;
import co.edu.udea.nexum.catalog.job_institution_type.domain.model.JobInstitutionType;
import co.edu.udea.nexum.catalog.job_institution_type.domain.spi.JobInstitutionTypePersistencePort;
import co.edu.udea.nexum.catalog.job_institution_type.infrastructure.output.jpa.entity.JobInstitutionTypeEntity;
import co.edu.udea.nexum.catalog.job_institution_type.infrastructure.output.jpa.mapper.JobInstitutionTypeEntityMapper;
import co.edu.udea.nexum.catalog.job_institution_type.infrastructure.output.jpa.repository.JobInstitutionTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Generated
@RequiredArgsConstructor
public class JobInstitutionTypeJpaAdapter
        extends BaseCrudAdapterImpl<Long, JobInstitutionType, JobInstitutionTypeEntity>
        implements JobInstitutionTypePersistencePort {

    private final JobInstitutionTypeRepository repository;
    private final JobInstitutionTypeEntityMapper mapper;

    @Override
    protected CrudRepository<JobInstitutionTypeEntity, Long> getRepository() {
        return repository;
    }

    @Override
    protected BaseEntityMapper<JobInstitutionType, JobInstitutionTypeEntity> getMapper() {
        return mapper;
    }

    @Override
    public List<JobInstitutionType> findAllByProgramId(Long programId) {
        return mapper.toDomains(repository.findAllByProgram_Id(programId));
    }

    @Override
    public JobInstitutionType findByProgramIdAndName(Long programId, String name) {
        return repository.findByProgram_IdAndName(programId, name)
                .map(mapper::toDomain)
                .orElse(null);
    }
}
