package co.edu.udea.nexum.catalog.program.domain.spi;

import co.edu.udea.nexum.catalog.common.domain.spi.BaseCrudPersistencePort;
import co.edu.udea.nexum.catalog.program.domain.model.Program;
import co.edu.udea.nexum.catalog.program_version.domain.model.ProgramVersion;

import java.util.List;

public interface ProgramPersistencePort extends BaseCrudPersistencePort<Long, Program> {
    Program findByCode(String sniesCode);
}

