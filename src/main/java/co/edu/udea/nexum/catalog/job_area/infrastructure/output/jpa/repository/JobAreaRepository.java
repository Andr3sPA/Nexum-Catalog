package co.edu.udea.nexum.catalog.job_area.infrastructure.output.jpa.repository;

import co.edu.udea.nexum.catalog.job_area.infrastructure.output.jpa.entity.JobAreaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JobAreaRepository extends JpaRepository<JobAreaEntity, Long> {
    
    List<JobAreaEntity> findAllByProgram_Id(Long programId);

    Optional<JobAreaEntity> findByProgram_IdAndName(Long programId, String name);
}
