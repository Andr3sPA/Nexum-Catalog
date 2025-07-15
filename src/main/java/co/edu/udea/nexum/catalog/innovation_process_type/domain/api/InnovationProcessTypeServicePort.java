package co.edu.udea.nexum.catalog.innovation_process_type.domain.api;

import co.edu.udea.nexum.catalog.common.domain.api.BaseCrudServicePort;
import co.edu.udea.nexum.catalog.innovation_process_type.domain.model.InnovationProcessType;

import java.util.List;

public interface InnovationProcessTypeServicePort extends BaseCrudServicePort<Long, InnovationProcessType> {
    List<InnovationProcessType> findAllByEnabled(boolean enabled);
    List<InnovationProcessType> findAllByIds(List<Long> ids);
}
