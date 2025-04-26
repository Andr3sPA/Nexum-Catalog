package co.edu.udea.nexum.catalog.program_version.domain.usecase;

import co.edu.udea.nexum.catalog.common.domain.spi.BaseCrudPersistencePort;
import co.edu.udea.nexum.catalog.common.domain.usecase.BaseCrudUseCase;
import co.edu.udea.nexum.catalog.program_version.domain.api.ProgramVersionServicePort;
import co.edu.udea.nexum.catalog.program_version.domain.model.ProgramVersion;
import co.edu.udea.nexum.catalog.program_version.domain.spi.ProgramVersionPersistencePort;

public class ProgramVersionUseCase extends BaseCrudUseCase<Long, ProgramVersion> implements ProgramVersionServicePort {
    private final ProgramVersionPersistencePort programVersionPersistencePort;

    public ProgramVersionUseCase(ProgramVersionPersistencePort programVersionPersistencePort) {
        this.programVersionPersistencePort = programVersionPersistencePort;
    }

    @Override
    protected BaseCrudPersistencePort<Long, ProgramVersion> getPersistencePort() {
        return programVersionPersistencePort;
    }

    @Override
    protected String getModelClassName() {
        return ProgramVersion.class.getSimpleName();
    }
}
