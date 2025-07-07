package co.edu.udea.nexum.catalog.salary_range.infrastructure.output.jpa.repository;

import co.edu.udea.nexum.catalog.salary_range.infrastructure.output.jpa.entity.SalaryRangeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalaryRangeRepository extends JpaRepository<SalaryRangeEntity, Long> {
    List<SalaryRangeEntity> findAllByOrderByOrderAsc();
}
