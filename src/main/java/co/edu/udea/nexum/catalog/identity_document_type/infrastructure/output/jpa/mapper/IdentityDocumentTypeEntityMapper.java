package co.edu.udea.nexum.catalog.identity_document_type.infrastructure.output.jpa.mapper;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.mapper.BaseEntityMapper;
import co.edu.udea.nexum.catalog.identity_document_type.domain.model.IdentityDocumentType;
import co.edu.udea.nexum.catalog.identity_document_type.infrastructure.output.jpa.entity.IdentityDocumentTypeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IdentityDocumentTypeEntityMapper
        extends BaseEntityMapper<IdentityDocumentType, IdentityDocumentTypeEntity> {
}
