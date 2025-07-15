package co.edu.udea.nexum.catalog.program_version.domain.api;

import co.edu.udea.nexum.catalog.common.domain.api.BaseCrudServicePort;
import co.edu.udea.nexum.catalog.program_version.domain.model.ProgramVersion;

import java.util.List;

public interface ProgramVersionServicePort extends BaseCrudServicePort<Long, ProgramVersion> {
    List<ProgramVersion> findAllByProgramId(Long programId);
}
