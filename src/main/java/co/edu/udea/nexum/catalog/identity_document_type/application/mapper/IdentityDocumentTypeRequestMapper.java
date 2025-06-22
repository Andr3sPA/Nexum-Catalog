package co.edu.udea.nexum.catalog.identity_document_type.application.mapper;

import co.edu.udea.nexum.catalog.common.application.mapper.BaseRequestMapper;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.identity_document_type.application.dto.request.IdentityDocumentTypeRequest;
import co.edu.udea.nexum.catalog.identity_document_type.domain.model.IdentityDocumentType;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IdentityDocumentTypeRequestMapper extends BaseRequestMapper<IdentityDocumentType, IdentityDocumentTypeRequest> {
}
