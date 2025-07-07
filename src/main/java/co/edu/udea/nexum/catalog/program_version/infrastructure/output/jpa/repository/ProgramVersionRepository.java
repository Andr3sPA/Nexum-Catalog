package co.edu.udea.nexum.catalog.program_version.infrastructure.output.jpa.repository;

import co.edu.udea.nexum.catalog.program_version.infrastructure.output.jpa.entity.ProgramVersionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProgramVersionRepository extends JpaRepository<ProgramVersionEntity, Long> {
    boolean existsByProgram_IdAndVersion(Long programId, Short version);

    Optional<ProgramVersionEntity> findByVersionAndProgram_Id(Short version, Long programId);
}
