package co.edu.udea.nexum.catalog.job_delay.infrastructure.output.jpa.repository;

import co.edu.udea.nexum.catalog.job_delay.infrastructure.output.jpa.entity.JobDelayEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobDelayRepository extends JpaRepository<JobDelayEntity, Long> {
    List<JobDelayEntity> findAllByOrderByOrderAsc();
}
