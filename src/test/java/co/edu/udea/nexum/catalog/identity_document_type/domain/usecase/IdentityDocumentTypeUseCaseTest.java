package co.edu.udea.nexum.catalog.identity_document_type.domain.usecase;

import co.edu.udea.nexum.catalog.common.domain.exception.EntityNotFoundException;
import co.edu.udea.nexum.catalog.identity_document_type.domain.model.IdentityDocumentType;
import co.edu.udea.nexum.catalog.identity_document_type.domain.utils.enums.DocumentType;
import co.edu.udea.nexum.catalog.identity_document_type.domain.spi.IdentityDocumentTypePersistencePort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class IdentityDocumentTypeUseCaseTest {
    private static final Long VALID_ID = 1L;
    private static final Long INVALID_ID = 999L;
    private static final DocumentType VALID_DOCUMENT_TYPE = DocumentType.CC;

    @Mock
    private IdentityDocumentTypePersistencePort identityDocumentTypePersistencePort;

    @InjectMocks
    private IdentityDocumentTypeUseCase identityDocumentTypeUseCase;

    private IdentityDocumentType identityDocumentType;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        identityDocumentType = new IdentityDocumentType.IdentityDocumentTypeBuilder()
                .id(VALID_ID)
                .documentType(VALID_DOCUMENT_TYPE)
                .build();
    }

    @Test
    public void testSave() {
        when(identityDocumentTypePersistencePort.save(any(IdentityDocumentType.class)))
                .thenReturn(identityDocumentType);

        IdentityDocumentType saved = identityDocumentTypeUseCase.save(identityDocumentType);

        assertNotNull(saved);
        assertEquals(VALID_ID, saved.getId());
        assertEquals(VALID_DOCUMENT_TYPE, saved.getDocumentType());
        verify(identityDocumentTypePersistencePort, times(1)).save(any(IdentityDocumentType.class));
    }

    @Test
    public void testFindByIdSuccess() {
        when(identityDocumentTypePersistencePort.findById(VALID_ID)).thenReturn(identityDocumentType);

        IdentityDocumentType found = identityDocumentTypeUseCase.findById(VALID_ID);

        assertNotNull(found);
        assertEquals(VALID_ID, found.getId());
        assertEquals(VALID_DOCUMENT_TYPE, found.getDocumentType());
        verify(identityDocumentTypePersistencePort, times(1)).findById(VALID_ID);
    }

    @Test
    public void testFindByIdNotFound() {
        when(identityDocumentTypePersistencePort.findById(INVALID_ID)).thenReturn(null);

        assertThrows(EntityNotFoundException.class, () -> identityDocumentTypeUseCase.findById(INVALID_ID));

        verify(identityDocumentTypePersistencePort, times(1)).findById(INVALID_ID);
    }

    @Test
    public void testUpdateById() {
        when(identityDocumentTypePersistencePort.findById(VALID_ID)).thenReturn(identityDocumentType);
        when(identityDocumentTypePersistencePort.update(any(IdentityDocumentType.class)))
                .thenReturn(identityDocumentType);

        IdentityDocumentType updated = identityDocumentTypeUseCase.updateById(VALID_ID, identityDocumentType);

        assertNotNull(updated);
        assertEquals(VALID_ID, updated.getId());
        assertEquals(VALID_DOCUMENT_TYPE, updated.getDocumentType());
        verify(identityDocumentTypePersistencePort, times(1)).update(any(IdentityDocumentType.class));
    }

    @Test
    public void testDeleteById() {
        when(identityDocumentTypePersistencePort.findById(VALID_ID)).thenReturn(identityDocumentType);

        IdentityDocumentType deleted = identityDocumentTypeUseCase.deleteById(VALID_ID);

        assertNotNull(deleted);
        assertEquals(VALID_ID, deleted.getId());
        assertEquals(VALID_DOCUMENT_TYPE, deleted.getDocumentType());
        verify(identityDocumentTypePersistencePort, times(1)).deleteById(VALID_ID);
    }
}
