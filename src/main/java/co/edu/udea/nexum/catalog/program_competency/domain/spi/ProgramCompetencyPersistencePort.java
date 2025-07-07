package co.edu.udea.nexum.catalog.program_competency.domain.spi;

import co.edu.udea.nexum.catalog.common.domain.spi.BaseCrudPersistencePort;
import co.edu.udea.nexum.catalog.program_competency.domain.model.ProgramCompetency;

import java.util.List;

public interface ProgramCompetencyPersistencePort extends BaseCrudPersistencePort<Long, ProgramCompetency> {
    List<ProgramCompetency> findAllByProgramId(Long programId);
    ProgramCompetency findByProgramIdAndName(Long programId, String name);
}
