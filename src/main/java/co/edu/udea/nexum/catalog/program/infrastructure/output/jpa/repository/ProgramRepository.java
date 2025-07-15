package co.edu.udea.nexum.catalog.program.infrastructure.output.jpa.repository;

import co.edu.udea.nexum.catalog.program.infrastructure.output.jpa.entity.ProgramEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProgramRepository extends JpaRepository<ProgramEntity, Long> {
    Optional<ProgramEntity> findByCode(String code);
}
