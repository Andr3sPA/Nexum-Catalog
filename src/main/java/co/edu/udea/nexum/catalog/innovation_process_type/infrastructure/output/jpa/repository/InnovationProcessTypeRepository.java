package co.edu.udea.nexum.catalog.innovation_process_type.infrastructure.output.jpa.repository;

import co.edu.udea.nexum.catalog.innovation_process_type.infrastructure.output.jpa.entity.InnovationProcessTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InnovationProcessTypeRepository extends JpaRepository<InnovationProcessTypeEntity, Long> {
    boolean existsByName(String name);
    List<InnovationProcessTypeEntity> findAllByEnabled(boolean enabled);
}
