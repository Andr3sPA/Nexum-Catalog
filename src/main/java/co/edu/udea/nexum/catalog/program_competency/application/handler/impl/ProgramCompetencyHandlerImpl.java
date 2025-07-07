package co.edu.udea.nexum.catalog.program_competency.application.handler.impl;

import co.edu.udea.nexum.catalog.common.application.handler.impl.BaseCrudHandlerImpl;
import co.edu.udea.nexum.catalog.common.application.mapper.BaseRequestMapper;
import co.edu.udea.nexum.catalog.common.application.mapper.BaseResponseMapper;
import co.edu.udea.nexum.catalog.common.domain.api.BaseCrudServicePort;
import co.edu.udea.nexum.catalog.program_competency.application.dto.request.ProgramCompetencyRequest;
import co.edu.udea.nexum.catalog.program_competency.application.dto.response.ProgramCompetencyResponse;
import co.edu.udea.nexum.catalog.program_competency.application.handler.ProgramCompetencyHandler;
import co.edu.udea.nexum.catalog.program_competency.application.mapper.request.ProgramCompetencyRequestMapper;
import co.edu.udea.nexum.catalog.program_competency.application.mapper.response.ProgramCompetencyResponseMapper;
import co.edu.udea.nexum.catalog.program_competency.domain.api.ProgramCompetencyServicePort;
import co.edu.udea.nexum.catalog.program_competency.domain.model.ProgramCompetency;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProgramCompetencyHandlerImpl
        extends BaseCrudHandlerImpl<Long, ProgramCompetency, ProgramCompetencyResponse, ProgramCompetencyRequest>
        implements ProgramCompetencyHandler {

    private final ProgramCompetencyServicePort programCompetencyServicePort;
    private final ProgramCompetencyRequestMapper programCompetencyRequestMapper;
    private final ProgramCompetencyResponseMapper programCompetencyResponseMapper;

    @Override
    protected BaseCrudServicePort<Long, ProgramCompetency> getServicePort() {
        return programCompetencyServicePort;
    }

    @Override
    protected BaseRequestMapper<ProgramCompetency, ProgramCompetencyRequest> getRequestMapper() {
        return programCompetencyRequestMapper;
    }

    @Override
    protected BaseResponseMapper<ProgramCompetency, ProgramCompetencyResponse> getResponseMapper() {
        return programCompetencyResponseMapper;
    }

    @Override
    public List<ProgramCompetencyResponse> findAllByProgramId(Long programId) {
        return programCompetencyResponseMapper.toResponses(programCompetencyServicePort.findAllByProgramId(programId));
    }
}
