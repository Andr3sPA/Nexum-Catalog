package co.edu.udea.nexum.catalog.program_version.application.handler.impl;

import co.edu.udea.nexum.catalog.common.application.handler.impl.BaseCrudHandlerImpl;
import co.edu.udea.nexum.catalog.common.application.mapper.BaseRequestMapper;
import co.edu.udea.nexum.catalog.common.application.mapper.BaseResponseMapper;
import co.edu.udea.nexum.catalog.common.domain.api.BaseCrudServicePort;
import co.edu.udea.nexum.catalog.program_version.application.dto.request.ProgramVersionRequest;
import co.edu.udea.nexum.catalog.program_version.application.dto.response.ProgramVersionResponse;
import co.edu.udea.nexum.catalog.program_version.application.handler.ProgramVersionHandler;
import co.edu.udea.nexum.catalog.program_version.application.mapper.ProgramVersionRequestMapper;
import co.edu.udea.nexum.catalog.program_version.application.mapper.ProgramVersionResponseMapper;
import co.edu.udea.nexum.catalog.program_version.domain.api.ProgramVersionServicePort;
import co.edu.udea.nexum.catalog.program_version.domain.model.ProgramVersion;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProgramVersionHandlerImpl
        extends BaseCrudHandlerImpl<Long, ProgramVersion, ProgramVersionResponse, ProgramVersionRequest>
        implements ProgramVersionHandler {
    private final ProgramVersionServicePort programVersionServicePort;
    private final ProgramVersionResponseMapper programVersionResponseMapper;
    private final ProgramVersionRequestMapper programVersionRequestMapper;

    @Override
    protected BaseCrudServicePort<Long, ProgramVersion> getServicePort() {
        return programVersionServicePort;
    }

    @Override
    protected BaseResponseMapper<ProgramVersion, ProgramVersionResponse> getResponseMapper() {
        return programVersionResponseMapper;
    }

    @Override
    protected BaseRequestMapper<ProgramVersion, ProgramVersionRequest> getRequestMapper() {
        return programVersionRequestMapper;
    }
}
