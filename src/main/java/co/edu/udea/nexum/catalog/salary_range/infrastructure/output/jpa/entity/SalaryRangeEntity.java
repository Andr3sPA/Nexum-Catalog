package co.edu.udea.nexum.catalog.salary_range.infrastructure.output.jpa.entity;

import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.entity.NexumEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(
        name = "salary_range",
        indexes = {
                @Index(name = "idx_salary_range_order", columnList = "`order`")
        }
)
public class SalaryRangeEntity implements NexumEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "salary_range_id")
    private Long id;

    @Column(name = "salary", nullable = false)
    private String salary;

    @Column(name = "`order`", nullable = false)
    private Integer order;

    @Column(name = "active", nullable = false)
    private Boolean active;

    @Column(name = "creation_date", nullable = false, updatable = false)
    private LocalDateTime creationDate;

    @Column(name = "last_update", nullable = false)
    private LocalDateTime lastUpdate;
}
