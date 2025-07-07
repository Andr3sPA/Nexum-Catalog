package co.edu.udea.nexum.catalog.identity_document_type.application.handler;

import co.edu.udea.nexum.catalog.common.application.handler.BaseCrudHandler;
import co.edu.udea.nexum.catalog.identity_document_type.application.dto.request.IdentityDocumentTypeRequest;
import co.edu.udea.nexum.catalog.identity_document_type.application.dto.response.IdentityDocumentTypeResponse;

public interface IdentityDocumentTypeHandler extends BaseCrudHandler<Long, IdentityDocumentTypeResponse, IdentityDocumentTypeRequest> {
}
