package co.edu.udea.nexum.catalog.identity_document_type.application.mapper;

import co.edu.udea.nexum.catalog.common.application.mapper.BaseResponseMapper;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.identity_document_type.application.dto.response.IdentityDocumentTypeResponse;
import co.edu.udea.nexum.catalog.identity_document_type.domain.model.IdentityDocumentType;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IdentityDocumentTypeResponseMapper extends BaseResponseMapper<IdentityDocumentType, IdentityDocumentTypeResponse> {
    @Override
    default IdentityDocumentTypeResponse toResponse(IdentityDocumentType identityDocumentType) {
        return IdentityDocumentTypeResponse.builder()
                .id(identityDocumentType.getId())
                .name(identityDocumentType.getDocumentType().getName())
                .abbreviation(identityDocumentType.getDocumentType().getAbbreviation())
                .build();
    }
}
