package co.edu.udea.nexum.catalog.program.application.handler;

import co.edu.udea.nexum.catalog.common.application.handler.BaseCrudHandler;
import co.edu.udea.nexum.catalog.program.application.dto.request.ProgramRequest;
import co.edu.udea.nexum.catalog.program.application.dto.response.ProgramResponse;

public interface ProgramHandler extends BaseCrudHandler<Long, ProgramResponse, ProgramRequest> {
}
