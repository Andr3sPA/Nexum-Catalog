package co.edu.udea.nexum.catalog.identity_document_type.application.handler.impl;

import co.edu.udea.nexum.catalog.identity_document_type.application.dto.request.IdentityDocumentTypeRequest;
import co.edu.udea.nexum.catalog.identity_document_type.application.dto.response.IdentityDocumentTypeResponse;
import co.edu.udea.nexum.catalog.identity_document_type.application.mapper.IdentityDocumentTypeRequestMapper;
import co.edu.udea.nexum.catalog.identity_document_type.application.mapper.IdentityDocumentTypeResponseMapper;
import co.edu.udea.nexum.catalog.identity_document_type.domain.api.IdentityDocumentTypeServicePort;
import co.edu.udea.nexum.catalog.identity_document_type.domain.model.IdentityDocumentType;
import co.edu.udea.nexum.catalog.identity_document_type.domain.utils.enums.DocumentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class IdentityDocumentTypeHandlerImplTest {

    private static final Long VALID_ID = 1L;
    private static final Long INVALID_ID = 999L;
    private static final DocumentType VALID_DOCUMENT_TYPE = DocumentType.CC;

    private static final String VALID_NAME = "Cédula de Ciudadanía";
    private static final String VALID_ABBREVIATION = "CC";

    @Mock
    private IdentityDocumentTypeServicePort identityDocumentTypeServicePort;

    @Mock
    private IdentityDocumentTypeResponseMapper identityDocumentTypeResponseMapper;

    @Mock
    private IdentityDocumentTypeRequestMapper identityDocumentTypeRequestMapper;

    @InjectMocks
    private IdentityDocumentTypeHandlerImpl identityDocumentTypeHandlerImpl;

    private IdentityDocumentTypeRequest identityDocumentTypeRequest;
    private IdentityDocumentTypeResponse identityDocumentTypeResponse;
    private IdentityDocumentType identityDocumentType;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        identityDocumentTypeRequest = IdentityDocumentTypeRequest.builder()
                .documentType(VALID_DOCUMENT_TYPE)
                .build();

        identityDocumentTypeResponse = IdentityDocumentTypeResponse.builder()
                .id(VALID_ID)
                .name(VALID_NAME)
                .abbreviation(VALID_ABBREVIATION)
                .build();

        identityDocumentType = new IdentityDocumentType.IdentityDocumentTypeBuilder()
                .id(VALID_ID)
                .documentType(VALID_DOCUMENT_TYPE)
                .build();
    }

    @Test
    public void testSave() {
        when(identityDocumentTypeRequestMapper.toDomain(identityDocumentTypeRequest)).thenReturn(identityDocumentType);
        when(identityDocumentTypeServicePort.save(identityDocumentType)).thenReturn(identityDocumentType);
        when(identityDocumentTypeResponseMapper.toResponse(identityDocumentType)).thenReturn(identityDocumentTypeResponse);

        IdentityDocumentTypeResponse savedResponse = identityDocumentTypeHandlerImpl.save(identityDocumentTypeRequest);

        assertNotNull(savedResponse);
        assertEquals(VALID_ID, savedResponse.getId());
        assertEquals(VALID_NAME, savedResponse.getName());
        assertEquals(VALID_ABBREVIATION, savedResponse.getAbbreviation());

        verify(identityDocumentTypeRequestMapper, times(1)).toDomain(identityDocumentTypeRequest);
        verify(identityDocumentTypeServicePort, times(1)).save(identityDocumentType);
        verify(identityDocumentTypeResponseMapper, times(1)).toResponse(identityDocumentType);
    }

    @Test
    public void testFindByIdSuccess() {
        when(identityDocumentTypeServicePort.findById(VALID_ID)).thenReturn(identityDocumentType);
        when(identityDocumentTypeResponseMapper.toResponse(identityDocumentType)).thenReturn(identityDocumentTypeResponse);

        IdentityDocumentTypeResponse foundResponse = identityDocumentTypeHandlerImpl.findById(VALID_ID);

        assertNotNull(foundResponse);
        assertEquals(VALID_ID, foundResponse.getId());
        assertEquals(VALID_NAME, foundResponse.getName());
        assertEquals(VALID_ABBREVIATION, foundResponse.getAbbreviation());

        verify(identityDocumentTypeServicePort, times(1)).findById(VALID_ID);
        verify(identityDocumentTypeResponseMapper, times(1)).toResponse(identityDocumentType);
    }

    @Test
    public void testUpdateById() {
        when(identityDocumentTypeServicePort.findById(VALID_ID)).thenReturn(identityDocumentType);
        when(identityDocumentTypeRequestMapper.toDomain(identityDocumentTypeRequest)).thenReturn(identityDocumentType);
        when(identityDocumentTypeServicePort.updateById(VALID_ID, identityDocumentType)).thenReturn(identityDocumentType);
        when(identityDocumentTypeResponseMapper.toResponse(identityDocumentType)).thenReturn(identityDocumentTypeResponse);

        IdentityDocumentTypeResponse updatedResponse = identityDocumentTypeHandlerImpl.updateById(VALID_ID, identityDocumentTypeRequest);

        assertNotNull(updatedResponse);
        assertEquals(VALID_ID, updatedResponse.getId());
        assertEquals(VALID_NAME, updatedResponse.getName());
        assertEquals(VALID_ABBREVIATION, updatedResponse.getAbbreviation());

        verify(identityDocumentTypeRequestMapper, times(1)).toDomain(identityDocumentTypeRequest);
        verify(identityDocumentTypeServicePort, times(1)).updateById(VALID_ID, identityDocumentType);
        verify(identityDocumentTypeResponseMapper, times(1)).toResponse(identityDocumentType);
    }

    @Test
    public void testDeleteById() {
        when(identityDocumentTypeServicePort.findById(VALID_ID)).thenReturn(identityDocumentType);
        when(identityDocumentTypeServicePort.deleteById(VALID_ID)).thenReturn(identityDocumentType);
        when(identityDocumentTypeResponseMapper.toResponse(identityDocumentType)).thenReturn(identityDocumentTypeResponse);

        IdentityDocumentTypeResponse deletedResponse = identityDocumentTypeHandlerImpl.deleteById(VALID_ID);

        assertNotNull(deletedResponse);
        assertEquals(VALID_ID, deletedResponse.getId());
        assertEquals(VALID_NAME, deletedResponse.getName());
        assertEquals(VALID_ABBREVIATION, deletedResponse.getAbbreviation());

        verify(identityDocumentTypeServicePort, times(1)).deleteById(VALID_ID);
        verify(identityDocumentTypeResponseMapper, times(1)).toResponse(identityDocumentType);
    }
}
