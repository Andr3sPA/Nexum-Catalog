package co.edu.udea.nexum.catalog.alternative_academic_route.infrastructure.output.jpa.entity;

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
    name = "alternative_academic_route",
    indexes = {
        @Index(name = "idx_alternative_academic_route_name", columnList = "name"),
        @Index(name = "idx_alternative_academic_route_enabled", columnList = "enabled")
    }
)
public class AlternativeAcademicRouteEntity implements NexumEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alternative_academic_route_id")
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "description", length = 500)
    private String description;

    @Column(name = "enabled", nullable = false)
    private Boolean enabled;
}
