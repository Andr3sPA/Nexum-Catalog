package co.edu.udea.nexum.catalog.innovation_process_type.application.handler.impl;

import co.edu.udea.nexum.catalog.common.application.handler.impl.BaseCrudHandlerImpl;
import co.edu.udea.nexum.catalog.common.application.mapper.BaseRequestMapper;
import co.edu.udea.nexum.catalog.common.application.mapper.BaseResponseMapper;
import co.edu.udea.nexum.catalog.common.domain.api.BaseCrudServicePort;
import co.edu.udea.nexum.catalog.innovation_process_type.application.dto.request.InnovationProcessTypeRequest;
import co.edu.udea.nexum.catalog.innovation_process_type.application.dto.response.InnovationProcessTypeResponse;
import co.edu.udea.nexum.catalog.innovation_process_type.application.handler.InnovationProcessTypeHandler;
import co.edu.udea.nexum.catalog.innovation_process_type.application.mapper.request.InnovationProcessTypeRequestMapper;
import co.edu.udea.nexum.catalog.innovation_process_type.application.mapper.response.InnovationProcessTypeResponseMapper;
import co.edu.udea.nexum.catalog.innovation_process_type.domain.api.InnovationProcessTypeServicePort;
import co.edu.udea.nexum.catalog.innovation_process_type.domain.model.InnovationProcessType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InnovationProcessTypeHandlerImpl
        extends BaseCrudHandlerImpl<Long, InnovationProcessType, InnovationProcessTypeResponse, InnovationProcessTypeRequest>
        implements InnovationProcessTypeHandler {

    private final InnovationProcessTypeServicePort innovationProcessTypeServicePort;
    private final InnovationProcessTypeRequestMapper requestMapper;
    private final InnovationProcessTypeResponseMapper responseMapper;

    @Override
    protected BaseCrudServicePort<Long, InnovationProcessType> getServicePort() {
        return innovationProcessTypeServicePort;
    }

    @Override
    protected BaseRequestMapper<InnovationProcessType, InnovationProcessTypeRequest> getRequestMapper() {
        return requestMapper;
    }

    @Override
    protected BaseResponseMapper<InnovationProcessType, InnovationProcessTypeResponse> getResponseMapper() {
        return responseMapper;
    }

    @Override
    public List<InnovationProcessTypeResponse> findAllByEnabled(boolean enabled) {
        return responseMapper.toResponses(innovationProcessTypeServicePort.findAllByEnabled(enabled));
    }

    @Override
    public List<InnovationProcessTypeResponse> findByIds(List<Long> ids) {
        return responseMapper.toResponses(innovationProcessTypeServicePort.findAllByIds(ids));
    }
}
