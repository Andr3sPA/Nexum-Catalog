package co.edu.udea.nexum.catalog.program.infrastructure.output.jpa.repository;

import co.edu.udea.nexum.catalog.program.infrastructure.output.jpa.entity.ProgramEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramRepository extends JpaRepository<ProgramEntity, Long> {
    ProgramEntity findByCode(String sniesCode);
}
