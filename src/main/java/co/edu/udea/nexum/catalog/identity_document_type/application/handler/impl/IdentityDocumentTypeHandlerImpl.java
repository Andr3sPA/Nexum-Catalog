package co.edu.udea.nexum.catalog.identity_document_type.application.handler.impl;

import co.edu.udea.nexum.catalog.common.application.handler.impl.BaseCrudHandlerImpl;
import co.edu.udea.nexum.catalog.common.application.mapper.BaseRequestMapper;
import co.edu.udea.nexum.catalog.common.application.mapper.BaseResponseMapper;
import co.edu.udea.nexum.catalog.common.domain.api.BaseCrudServicePort;
import co.edu.udea.nexum.catalog.identity_document_type.application.dto.request.IdentityDocumentTypeRequest;
import co.edu.udea.nexum.catalog.identity_document_type.application.dto.response.IdentityDocumentTypeResponse;
import co.edu.udea.nexum.catalog.identity_document_type.application.handler.IdentityDocumentTypeHandler;
import co.edu.udea.nexum.catalog.identity_document_type.application.mapper.IdentityDocumentTypeRequestMapper;
import co.edu.udea.nexum.catalog.identity_document_type.application.mapper.IdentityDocumentTypeResponseMapper;
import co.edu.udea.nexum.catalog.identity_document_type.domain.api.IdentityDocumentTypeServicePort;
import co.edu.udea.nexum.catalog.identity_document_type.domain.model.IdentityDocumentType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IdentityDocumentTypeHandlerImpl
        extends BaseCrudHandlerImpl<Long, IdentityDocumentType, IdentityDocumentTypeResponse, IdentityDocumentTypeRequest>
        implements IdentityDocumentTypeHandler {
    private final IdentityDocumentTypeServicePort identityDocumentTypeServicePort;
    private final IdentityDocumentTypeResponseMapper identityDocumentTypeResponseMapper;
    private final IdentityDocumentTypeRequestMapper identityDocumentTypeRequestMapper;

    @Override
    protected BaseCrudServicePort<Long, IdentityDocumentType> getServicePort() {
        return identityDocumentTypeServicePort;
    }

    @Override
    protected BaseResponseMapper<IdentityDocumentType, IdentityDocumentTypeResponse> getResponseMapper() {
        return identityDocumentTypeResponseMapper;
    }

    @Override
    protected BaseRequestMapper<IdentityDocumentType, IdentityDocumentTypeRequest> getRequestMapper() {
        return identityDocumentTypeRequestMapper;
    }
}
