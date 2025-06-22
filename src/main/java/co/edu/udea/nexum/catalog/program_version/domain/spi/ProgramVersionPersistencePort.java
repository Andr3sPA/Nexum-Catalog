package co.edu.udea.nexum.catalog.program_version.domain.spi;

import co.edu.udea.nexum.catalog.common.domain.spi.BaseCrudPersistencePort;
import co.edu.udea.nexum.catalog.program_version.domain.model.ProgramVersion;

public interface ProgramVersionPersistencePort extends BaseCrudPersistencePort<Long, ProgramVersion> {
    ProgramVersion findByProgramIdAndVersion(Long id, Short version);
}
