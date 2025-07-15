package co.edu.udea.nexum.catalog.innovation_process_type.domain.spi;

import co.edu.udea.nexum.catalog.common.domain.spi.BaseCrudPersistencePort;
import co.edu.udea.nexum.catalog.innovation_process_type.domain.model.InnovationProcessType;

import java.util.List;

public interface InnovationProcessTypePersistencePort extends BaseCrudPersistencePort<Long, InnovationProcessType> {
    List<InnovationProcessType> findAllByEnabled(boolean enabled);
    boolean existsByName(String name);
    List<InnovationProcessType> findAllByIds(List<Long> ids);
}
