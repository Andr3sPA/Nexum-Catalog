package co.edu.udea.nexum.catalog.identity_document_type.infrastructure.output.jpa.adapter;

import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.adapter.impl.BaseCrudAdapterImpl;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.mapper.BaseEntityMapper;
import co.edu.udea.nexum.catalog.identity_document_type.domain.model.IdentityDocumentType;
import co.edu.udea.nexum.catalog.identity_document_type.domain.spi.IdentityDocumentTypePersistencePort;
import co.edu.udea.nexum.catalog.identity_document_type.domain.utils.enums.DocumentType;
import co.edu.udea.nexum.catalog.identity_document_type.infrastructure.output.jpa.entity.IdentityDocumentTypeEntity;
import co.edu.udea.nexum.catalog.identity_document_type.infrastructure.output.jpa.mapper.IdentityDocumentTypeEntityMapper;
import co.edu.udea.nexum.catalog.identity_document_type.infrastructure.output.jpa.repository.IdentityDocumentTypeRepository;
import lombok.Generated;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
@Generated
@RequiredArgsConstructor
public class IdentityDocumentTypeJpaAdapter
        extends BaseCrudAdapterImpl<Long, IdentityDocumentType, IdentityDocumentTypeEntity>
        implements IdentityDocumentTypePersistencePort {
    private final IdentityDocumentTypeRepository identityDocumentTypeRepository;
    private final IdentityDocumentTypeEntityMapper identityDocumentTypeEntityMapper;

    @Override
    protected BaseEntityMapper<IdentityDocumentType, IdentityDocumentTypeEntity> getMapper() {
        return identityDocumentTypeEntityMapper;
    }

    @Override
    protected CrudRepository<IdentityDocumentTypeEntity, Long> getRepository() {
        return identityDocumentTypeRepository;
    }

    @Override
    public IdentityDocumentType findByType(DocumentType type) {
        return identityDocumentTypeEntityMapper.toDomain(
                identityDocumentTypeRepository.findByDocumentType(type)
        );
    }
}
