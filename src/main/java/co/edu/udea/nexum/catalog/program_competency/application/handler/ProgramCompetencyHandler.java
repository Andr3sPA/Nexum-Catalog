package co.edu.udea.nexum.catalog.program_competency.application.handler;

import co.edu.udea.nexum.catalog.common.application.handler.BaseCrudHandler;
import co.edu.udea.nexum.catalog.program_competency.application.dto.request.ProgramCompetencyRequest;
import co.edu.udea.nexum.catalog.program_competency.application.dto.response.ProgramCompetencyResponse;

import java.util.List;

public interface ProgramCompetencyHandler extends BaseCrudHandler<Long, ProgramCompetencyResponse, ProgramCompetencyRequest> {
    List<ProgramCompetencyResponse> findAllByProgramId(Long programId);
}
