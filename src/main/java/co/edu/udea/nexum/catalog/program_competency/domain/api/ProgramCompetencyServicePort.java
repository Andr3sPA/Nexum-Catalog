package co.edu.udea.nexum.catalog.program_competency.domain.api;

import co.edu.udea.nexum.catalog.common.domain.api.BaseCrudServicePort;
import co.edu.udea.nexum.catalog.program_competency.domain.model.ProgramCompetency;

import java.util.List;

public interface ProgramCompetencyServicePort extends BaseCrudServicePort<Long, ProgramCompetency> {
    List<ProgramCompetency> findAllByProgramId(Long programId);
}
