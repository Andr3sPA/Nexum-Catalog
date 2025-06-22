package co.edu.udea.nexum.catalog.program_version.application.handler;

import co.edu.udea.nexum.catalog.common.application.handler.BaseCrudHandler;
import co.edu.udea.nexum.catalog.program_version.application.dto.request.ProgramVersionRequest;
import co.edu.udea.nexum.catalog.program_version.application.dto.response.ProgramVersionResponse;

public interface ProgramVersionHandler extends BaseCrudHandler<Long, ProgramVersionResponse, ProgramVersionRequest> {
}
