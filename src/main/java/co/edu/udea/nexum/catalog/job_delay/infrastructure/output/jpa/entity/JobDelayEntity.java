package co.edu.udea.nexum.catalog.job_delay.infrastructure.output.jpa.entity;

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
        name = "job_delay",
        indexes = {
                @Index(name = "idx_job_delay_order", columnList = "`order`")
        }
)
public class JobDelayEntity implements NexumEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_delay_id")
    private Long id;

    @Column(name = "label", nullable = false)
    private String label;

    @Column(name = "`order`", nullable = false)
    private Integer order;

    @Column(name = "active", nullable = false)
    private Boolean active;

    @Column(name = "creation_date", nullable = false, updatable = false)
    private LocalDateTime creationDate;

    @Column(name = "last_update", nullable = false)
    private LocalDateTime lastUpdate;
}
