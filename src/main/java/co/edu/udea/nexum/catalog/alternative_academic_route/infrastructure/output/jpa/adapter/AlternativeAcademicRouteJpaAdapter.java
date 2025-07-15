package co.edu.udea.nexum.catalog.alternative_academic_route.infrastructure.output.jpa.adapter;

import co.edu.udea.nexum.catalog.alternative_academic_route.domain.model.AlternativeAcademicRoute;
import co.edu.udea.nexum.catalog.alternative_academic_route.domain.spi.AlternativeAcademicRoutePersistencePort;
import co.edu.udea.nexum.catalog.alternative_academic_route.infrastructure.output.jpa.entity.AlternativeAcademicRouteEntity;
import co.edu.udea.nexum.catalog.alternative_academic_route.infrastructure.output.jpa.mapper.AlternativeAcademicRouteEntityMapper;
import co.edu.udea.nexum.catalog.alternative_academic_route.infrastructure.output.jpa.repository.AlternativeAcademicRouteRepository;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.adapter.impl.BaseCrudAdapterImpl;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.mapper.BaseEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Generated
@RequiredArgsConstructor
public class AlternativeAcademicRouteJpaAdapter
        extends BaseCrudAdapterImpl<Long, AlternativeAcademicRoute, AlternativeAcademicRouteEntity>
        implements AlternativeAcademicRoutePersistencePort {

    private final AlternativeAcademicRouteRepository repository;
    private final AlternativeAcademicRouteEntityMapper mapper;

    @Override
    protected CrudRepository<AlternativeAcademicRouteEntity, Long> getRepository() {
        return repository;
    }

    @Override
    protected BaseEntityMapper<AlternativeAcademicRoute, AlternativeAcademicRouteEntity> getMapper() {
        return mapper;
    }

    @Override
    public List<AlternativeAcademicRoute> findAllByEnabled(boolean enabled) {
        return mapper.toDomains(repository.findAllByEnabled(enabled));
    }

    @Override
    public boolean existsByName(String name) {
        return repository.existsByName(name);
    }
}
