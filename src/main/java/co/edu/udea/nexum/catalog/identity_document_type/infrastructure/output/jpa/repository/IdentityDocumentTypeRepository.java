package co.edu.udea.nexum.catalog.identity_document_type.infrastructure.output.jpa.repository;

import co.edu.udea.nexum.catalog.identity_document_type.domain.utils.enums.DocumentType;
import co.edu.udea.nexum.catalog.identity_document_type.infrastructure.output.jpa.entity.IdentityDocumentTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdentityDocumentTypeRepository extends JpaRepository<IdentityDocumentTypeEntity, Long> {
    IdentityDocumentTypeEntity findByDocumentType(DocumentType type);
}
