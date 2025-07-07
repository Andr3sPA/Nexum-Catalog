package co.edu.udea.nexum.catalog.identity_document_type.domain.usecase;

import co.edu.udea.nexum.catalog.common.domain.exception.EntityAlreadyExistsException;
import co.edu.udea.nexum.catalog.common.domain.spi.BaseCrudPersistencePort;
import co.edu.udea.nexum.catalog.common.domain.usecase.BaseCrudUseCase;
import co.edu.udea.nexum.catalog.identity_document_type.domain.api.IdentityDocumentTypeServicePort;
import co.edu.udea.nexum.catalog.identity_document_type.domain.model.IdentityDocumentType;
import co.edu.udea.nexum.catalog.identity_document_type.domain.spi.IdentityDocumentTypePersistencePort;

import static co.edu.udea.nexum.catalog.identity_document_type.domain.utils.constants.IdDocumentTypeConstants.DOCUMENT_TYPE;

public class IdentityDocumentTypeUseCase extends BaseCrudUseCase<Long, IdentityDocumentType> implements IdentityDocumentTypeServicePort {
    private final IdentityDocumentTypePersistencePort identityDocumentTypePersistencePort;

    public IdentityDocumentTypeUseCase(IdentityDocumentTypePersistencePort identityDocumentTypePersistencePort) {
        this.identityDocumentTypePersistencePort = identityDocumentTypePersistencePort;
    }

    @Override
    protected BaseCrudPersistencePort<Long, IdentityDocumentType> getPersistencePort() {
        return identityDocumentTypePersistencePort;
    }

    @Override
    protected String getModelClassName() {
        return IdentityDocumentType.class.getSimpleName();
    }

    @Override
    protected IdentityDocumentType patch(IdentityDocumentType original, IdentityDocumentType patch) {
        if(patch.getDocumentType() != null) original.setDocumentType(patch.getDocumentType());
        return original;
    }

    @Override
    protected void validateEntity(Long currentId, IdentityDocumentType model) {
        IdentityDocumentType existing = identityDocumentTypePersistencePort.findByType(model.getDocumentType());
        if (existing != null && !existing.getId().equals(currentId)) {
            throw new EntityAlreadyExistsException(
                    IdentityDocumentType.class.getSimpleName(),
                    DOCUMENT_TYPE,
                    model.getDocumentType().getName()
            );
        }
    }

}
