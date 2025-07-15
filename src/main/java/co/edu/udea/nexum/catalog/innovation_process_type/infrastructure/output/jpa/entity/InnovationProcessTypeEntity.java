package co.edu.udea.nexum.catalog.innovation_process_type.infrastructure.output.jpa.entity;

import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.entity.NexumEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(
    name = "innovation_process_type",
    indexes = {
        @Index(name = "idx_innovation_process_type_name", columnList = "name"),
        @Index(name = "idx_innovation_process_type_enabled", columnList = "enabled")
    }
)
public class InnovationProcessTypeEntity implements NexumEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "innovation_process_type_id")
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "description", length = 500)
    private String description;

    @Column(name = "enabled", nullable = false)
    private Boolean enabled;
}
