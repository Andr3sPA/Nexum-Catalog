package co.edu.udea.nexum.catalog.innovation_process_type.domain.usecase;

import co.edu.udea.nexum.catalog.common.domain.exception.EntityAlreadyExistsException;
import co.edu.udea.nexum.catalog.common.domain.spi.BaseCrudPersistencePort;
import co.edu.udea.nexum.catalog.common.domain.usecase.BaseCrudUseCase;
import co.edu.udea.nexum.catalog.innovation_process_type.domain.api.InnovationProcessTypeServicePort;
import co.edu.udea.nexum.catalog.innovation_process_type.domain.model.InnovationProcessType;
import co.edu.udea.nexum.catalog.innovation_process_type.domain.spi.InnovationProcessTypePersistencePort;

import java.util.List;

import static co.edu.udea.nexum.catalog.innovation_process_type.domain.utils.constants.InnovationProcessTypeConstants.*;

public class InnovationProcessTypeUseCase extends BaseCrudUseCase<Long, InnovationProcessType>
        implements InnovationProcessTypeServicePort {

    private final InnovationProcessTypePersistencePort persistencePort;

    public InnovationProcessTypeUseCase(InnovationProcessTypePersistencePort persistencePort) {
        this.persistencePort = persistencePort;
    }

    @Override
    public List<InnovationProcessType> findAll() {
        return persistencePort.findAllByEnabled(ENABLED);
    }

    @Override
    protected BaseCrudPersistencePort<Long, InnovationProcessType> getPersistencePort() {
        return persistencePort;
    }

    @Override
    protected String getModelClassName() {
        return InnovationProcessType.class.getSimpleName();
    }

    @Override
    protected InnovationProcessType patch(InnovationProcessType original, InnovationProcessType patch) {
        if (patch.getName() != null) original.setName(patch.getName());
        if (patch.getDescription() != null) original.setDescription(patch.getDescription());
        if (patch.getEnabled() != null) original.setEnabled(patch.getEnabled());
        return original;
    }

    @Override
    protected void validateEntity(Long currentId, InnovationProcessType model) {
        if (persistencePort.existsByName(model.getName())) {
            throw new EntityAlreadyExistsException(getModelClassName(), NAME, model.getName());
        }
    }

    @Override
    public List<InnovationProcessType> findAllByEnabled(boolean enabled) {
        return persistencePort.findAllByEnabled(enabled);
    }

    @Override
    public List<InnovationProcessType> findAllByIds(List<Long> ids) {
        return persistencePort.findAllByIds(ids);
    }
}
