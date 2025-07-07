package co.edu.udea.nexum.catalog.job_institution_type.infrastructure.output.jpa.repository;

import co.edu.udea.nexum.catalog.job_institution_type.infrastructure.output.jpa.entity.JobInstitutionTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JobInstitutionTypeRepository extends JpaRepository<JobInstitutionTypeEntity, Long> {

    List<JobInstitutionTypeEntity> findAllByProgram_Id(Long programId);

    Optional<JobInstitutionTypeEntity> findByProgram_IdAndName(Long programId, String name);
}
