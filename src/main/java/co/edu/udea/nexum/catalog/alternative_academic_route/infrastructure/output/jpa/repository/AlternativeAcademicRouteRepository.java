package co.edu.udea.nexum.catalog.alternative_academic_route.infrastructure.output.jpa.repository;

import co.edu.udea.nexum.catalog.alternative_academic_route.infrastructure.output.jpa.entity.AlternativeAcademicRouteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlternativeAcademicRouteRepository extends JpaRepository<AlternativeAcademicRouteEntity, Long> {
    boolean existsByName(String name);
    List<AlternativeAcademicRouteEntity> findAllByEnabled(boolean enabled);
}
