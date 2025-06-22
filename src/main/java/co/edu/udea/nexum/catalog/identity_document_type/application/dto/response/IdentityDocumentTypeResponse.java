package co.edu.udea.nexum.catalog.identity_document_type.application.dto.response;

import co.edu.udea.nexum.catalog.common.application.dto.response.BaseResponse;
import co.edu.udea.nexum.catalog.identity_document_type.domain.utils.enums.DocumentType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IdentityDocumentTypeResponse implements BaseResponse {
    private Long id;
    private String name;
    private String abbreviation;
}
