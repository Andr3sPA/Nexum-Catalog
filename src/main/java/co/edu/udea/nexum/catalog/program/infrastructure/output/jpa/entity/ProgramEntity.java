package co.edu.udea.nexum.catalog.program.infrastructure.output.jpa.entity;


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
        name = "program",
        indexes = {
                @Index(name = "idx_program_name_id", columnList = "name")
        }
)
public class ProgramEntity implements NexumEntity<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "program_id")
    Long id;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "code", nullable = false)
    String code;
}
