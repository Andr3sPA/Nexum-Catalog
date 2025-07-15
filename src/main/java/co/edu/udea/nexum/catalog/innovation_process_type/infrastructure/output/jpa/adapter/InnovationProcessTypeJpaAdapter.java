package co.edu.udea.nexum.catalog.innovation_process_type.infrastructure.output.jpa.adapter;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.adapter.impl.BaseCrudAdapterImpl;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.mapper.BaseEntityMapper;
import co.edu.udea.nexum.catalog.innovation_process_type.domain.model.InnovationProcessType;
import co.edu.udea.nexum.catalog.innovation_process_type.domain.spi.InnovationProcessTypePersistencePort;
import co.edu.udea.nexum.catalog.innovation_process_type.infrastructure.output.jpa.entity.InnovationProcessTypeEntity;
import co.edu.udea.nexum.catalog.innovation_process_type.infrastructure.output.jpa.mapper.InnovationProcessTypeEntityMapper;
import co.edu.udea.nexum.catalog.innovation_process_type.infrastructure.output.jpa.repository.InnovationProcessTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Generated
@RequiredArgsConstructor
public class InnovationProcessTypeJpaAdapter
        extends BaseCrudAdapterImpl<Long, InnovationProcessType, InnovationProcessTypeEntity>
        implements InnovationProcessTypePersistencePort {

    private final InnovationProcessTypeRepository repository;
    private final InnovationProcessTypeEntityMapper mapper;

    @Override
    protected CrudRepository<InnovationProcessTypeEntity, Long> getRepository() {
        return repository;
    }

    @Override
    protected BaseEntityMapper<InnovationProcessType, InnovationProcessTypeEntity> getMapper() {
        return mapper;
    }

    @Override
    public List<InnovationProcessType> findAllByEnabled(boolean enabled) {
        return mapper.toDomains(repository.findAllByEnabled(enabled));
    }

    @Override
    public boolean existsByName(String name) {
        return repository.existsByName(name);
    }

    @Override
    public List<InnovationProcessType> findAllByIds(List<Long> ids) {
        return mapper.toDomains( repository.findAllById(ids) );
    }
}
