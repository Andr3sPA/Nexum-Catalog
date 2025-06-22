package co.edu.udea.nexum.catalog.identity_document_type.application.dto.request;

import co.edu.udea.nexum.catalog.common.application.dto.request.BaseRequest;
import co.edu.udea.nexum.catalog.identity_document_type.domain.utils.enums.DocumentType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IdentityDocumentTypeRequest implements BaseRequest {
    private DocumentType documentType;
}
