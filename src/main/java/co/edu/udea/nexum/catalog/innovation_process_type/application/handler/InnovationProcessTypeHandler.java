package co.edu.udea.nexum.catalog.innovation_process_type.application.handler;

import co.edu.udea.nexum.catalog.common.application.handler.BaseCrudHandler;
import co.edu.udea.nexum.catalog.innovation_process_type.application.dto.request.InnovationProcessTypeRequest;
import co.edu.udea.nexum.catalog.innovation_process_type.application.dto.response.InnovationProcessTypeResponse;

import java.util.List;

public interface InnovationProcessTypeHandler extends BaseCrudHandler<Long, InnovationProcessTypeResponse, InnovationProcessTypeRequest> {
    List<InnovationProcessTypeResponse> findAllByEnabled(boolean enabled);
    List<InnovationProcessTypeResponse> findByIds(List<Long> ids);
}
