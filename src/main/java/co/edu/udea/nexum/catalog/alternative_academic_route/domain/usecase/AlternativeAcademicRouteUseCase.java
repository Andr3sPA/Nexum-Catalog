package co.edu.udea.nexum.catalog.alternative_academic_route.domain.usecase;

import co.edu.udea.nexum.catalog.common.domain.exception.EntityAlreadyExistsException;
import co.edu.udea.nexum.catalog.common.domain.spi.BaseCrudPersistencePort;
import co.edu.udea.nexum.catalog.common.domain.usecase.BaseCrudUseCase;
import co.edu.udea.nexum.catalog.alternative_academic_route.domain.api.AlternativeAcademicRouteServicePort;
import co.edu.udea.nexum.catalog.alternative_academic_route.domain.model.AlternativeAcademicRoute;
import co.edu.udea.nexum.catalog.alternative_academic_route.domain.spi.AlternativeAcademicRoutePersistencePort;

import java.util.List;

import static co.edu.udea.nexum.catalog.alternative_academic_route.domain.utils.constants.AlternativeAcademicRouteConstants.*;

public class AlternativeAcademicRouteUseCase extends BaseCrudUseCase<Long, AlternativeAcademicRoute>
        implements AlternativeAcademicRouteServicePort {

    private final AlternativeAcademicRoutePersistencePort alternativeAcademicRoutePersistencePort;

    public AlternativeAcademicRouteUseCase(
            AlternativeAcademicRoutePersistencePort alternativeAcademicRoutePersistencePort
    ) {
        this.alternativeAcademicRoutePersistencePort = alternativeAcademicRoutePersistencePort;
    }

    @Override
    public List<AlternativeAcademicRoute> findAll() {
        return alternativeAcademicRoutePersistencePort.findAllByEnabled(ENABLED);
    }

    @Override
    protected BaseCrudPersistencePort<Long, AlternativeAcademicRoute> getPersistencePort() {
        return alternativeAcademicRoutePersistencePort;
    }

    @Override
    protected String getModelClassName() {
        return AlternativeAcademicRoute.class.getSimpleName();
    }

    @Override
    protected AlternativeAcademicRoute patch(AlternativeAcademicRoute original, AlternativeAcademicRoute patch) {
        if (patch.getName() != null) original.setName(patch.getName());
        if (patch.getDescription() != null) original.setDescription(patch.getDescription());
        if (patch.getEnabled() != null) original.setEnabled(patch.getEnabled());
        return original;
    }

    @Override
    protected void validateEntity(Long currentId, AlternativeAcademicRoute model) {
        if (alternativeAcademicRoutePersistencePort.existsByName(model.getName())) throw new EntityAlreadyExistsException(getModelClassName(), NAME, model.getName());
    }

    @Override
    public List<AlternativeAcademicRoute> findAllByEnabled(boolean enabled) {
        return alternativeAcademicRoutePersistencePort.findAllByEnabled(enabled);
    }
}
