package co.edu.udea.nexum.catalog.identity_document_type.infrastructure.output.jpa.entity;

import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.entity.NexumEntity;
import co.edu.udea.nexum.catalog.identity_document_type.domain.utils.enums.DocumentType;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "identity_document_type")
public class IdentityDocumentTypeEntity implements NexumEntity<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identity_document_type_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "document_type", nullable = false)
    private DocumentType documentType;
}
