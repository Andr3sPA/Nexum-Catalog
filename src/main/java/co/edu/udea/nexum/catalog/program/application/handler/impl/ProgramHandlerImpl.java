package co.edu.udea.nexum.catalog.program.application.handler.impl;

import co.edu.udea.nexum.catalog.common.application.handler.impl.BaseCrudHandlerImpl;
import co.edu.udea.nexum.catalog.common.application.mapper.BaseRequestMapper;
import co.edu.udea.nexum.catalog.common.application.mapper.BaseResponseMapper;
import co.edu.udea.nexum.catalog.common.domain.api.BaseCrudServicePort;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.program.application.dto.request.ProgramRequest;
import co.edu.udea.nexum.catalog.program.application.dto.response.ProgramResponse;
import co.edu.udea.nexum.catalog.program.application.handler.ProgramHandler;
import co.edu.udea.nexum.catalog.program.application.mapper.ProgramRequestMapper;
import co.edu.udea.nexum.catalog.program.application.mapper.ProgramResponseMapper;
import co.edu.udea.nexum.catalog.program.domain.api.ProgramServicePort;
import co.edu.udea.nexum.catalog.program.domain.model.Program;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Generated
@RequiredArgsConstructor
public class ProgramHandlerImpl extends BaseCrudHandlerImpl<Long, Program, ProgramResponse, ProgramRequest> implements ProgramHandler {
    private final ProgramServicePort programServicePort;
    private final ProgramResponseMapper programResponseMapper;
    private final ProgramRequestMapper programRequestMapper;

    @Override
    protected BaseCrudServicePort<Long, Program> getServicePort() {
        return programServicePort;
    }

    @Override
    protected BaseResponseMapper<Program, ProgramResponse> getResponseMapper() {
        return programResponseMapper;
    }

    @Override
    protected BaseRequestMapper<Program, ProgramRequest> getRequestMapper() {
        return programRequestMapper;
    }
}
