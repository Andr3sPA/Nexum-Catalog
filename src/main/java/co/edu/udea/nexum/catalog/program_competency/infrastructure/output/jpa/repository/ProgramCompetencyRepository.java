package co.edu.udea.nexum.catalog.program_competency.infrastructure.output.jpa.repository;

import co.edu.udea.nexum.catalog.program_competency.infrastructure.output.jpa.entity.ProgramCompetencyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProgramCompetencyRepository extends JpaRepository<ProgramCompetencyEntity, Long> {

    List<ProgramCompetencyEntity> findAllByProgram_Id(Long programId);

    Optional<ProgramCompetencyEntity> findByProgram_IdAndName(Long programId, String name);
}
