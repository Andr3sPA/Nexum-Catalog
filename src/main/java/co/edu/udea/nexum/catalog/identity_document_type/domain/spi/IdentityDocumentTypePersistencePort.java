package co.edu.udea.nexum.catalog.identity_document_type.domain.spi;

import co.edu.udea.nexum.catalog.common.domain.spi.BaseCrudPersistencePort;
import co.edu.udea.nexum.catalog.identity_document_type.domain.model.IdentityDocumentType;
import co.edu.udea.nexum.catalog.identity_document_type.domain.utils.enums.DocumentType;

public interface IdentityDocumentTypePersistencePort extends BaseCrudPersistencePort<Long, IdentityDocumentType> {
    IdentityDocumentType findByType(DocumentType type);
}
