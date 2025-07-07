package co.edu.udea.nexum.catalog.job_area.infrastructure.output.jpa.entity;

import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.entity.NexumEntity;
import co.edu.udea.nexum.catalog.program.infrastructure.output.jpa.entity.ProgramEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(
        name = "job_area",
        indexes = {
                @Index(name = "idx_job_area_program_id", columnList = "program_id"),
                @Index(name = "idx_job_area_name", columnList = "name")
        }
)
public class JobAreaEntity implements NexumEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_area_id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "program_id", referencedColumnName = "program_id", nullable = false)
    private ProgramEntity program;
}
