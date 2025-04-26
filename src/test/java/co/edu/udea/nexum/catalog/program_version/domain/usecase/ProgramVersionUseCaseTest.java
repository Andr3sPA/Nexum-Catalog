package co.edu.udea.nexum.catalog.program_version.domain.usecase;

import co.edu.udea.nexum.catalog.common.domain.exception.EntityNotFoundException;
import co.edu.udea.nexum.catalog.program_version.domain.model.ProgramVersion;
import co.edu.udea.nexum.catalog.program_version.domain.spi.ProgramVersionPersistencePort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProgramVersionUseCaseTest {

    private ProgramVersionPersistencePort persistencePort;
    private ProgramVersionUseCase programVersionUseCase;

    @BeforeEach
    void setUp() {
        persistencePort = mock(ProgramVersionPersistencePort.class);
        programVersionUseCase = new ProgramVersionUseCase(persistencePort);
    }

    @Test
    void shouldSaveProgramVersion() {
        ProgramVersion programVersion = ProgramVersion.Builder()
                .id(1L)
                .version((short) 1)
                .startYear(2020)
                .endYear(2024)
                .build();

        when(persistencePort.save(programVersion)).thenReturn(programVersion);

        ProgramVersion result = programVersionUseCase.save(programVersion);

        assertEquals(programVersion, result);
        verify(persistencePort).save(programVersion);
    }

    @Test
    void shouldFindAllProgramVersions() {
        List<ProgramVersion> programVersions = List.of(
                ProgramVersion.Builder().id(1L).version((short) 1).startYear(2020).endYear(2024).build(),
                ProgramVersion.Builder().id(2L).version((short) 2).startYear(2025).endYear(2029).build()
        );

        when(persistencePort.findAll()).thenReturn(programVersions);

        List<ProgramVersion> result = programVersionUseCase.findAll();

        assertEquals(programVersions, result);
        verify(persistencePort).findAll();
    }

    @Test
    void shouldFindProgramVersionById() {
        ProgramVersion programVersion = ProgramVersion.Builder()
                .id(1L)
                .version((short) 1)
                .startYear(2020)
                .endYear(2024)
                .build();

        when(persistencePort.findById(1L)).thenReturn(programVersion);

        ProgramVersion result = programVersionUseCase.findById(1L);

        assertEquals(programVersion, result);
        verify(persistencePort).findById(1L);
    }

    @Test
    void shouldThrowExceptionWhenProgramVersionNotFound() {
        when(persistencePort.findById(1L)).thenReturn(null);

        assertThrows(EntityNotFoundException.class, () -> programVersionUseCase.findById(1L));
        verify(persistencePort).findById(1L);
    }

    @Test
    void shouldUpdateProgramVersionById() {
        ProgramVersion programVersion = ProgramVersion.Builder()
                .id(1L)
                .version((short) 1)
                .startYear(2020)
                .endYear(2024)
                .build();

        when(persistencePort.findById(1L)).thenReturn(programVersion);
        when(persistencePort.update(programVersion)).thenReturn(programVersion);

        ProgramVersion result = programVersionUseCase.updateById(1L, programVersion);

        assertEquals(programVersion, result);
        verify(persistencePort).findById(1L);
        verify(persistencePort).update(programVersion);
    }

    @Test
    void shouldDeleteProgramVersionById() {
        ProgramVersion programVersion = ProgramVersion.Builder()
                .id(1L)
                .version((short) 1)
                .startYear(2020)
                .endYear(2024)
                .build();

        when(persistencePort.findById(1L)).thenReturn(programVersion);

        ProgramVersion deletedProgramVersion = programVersionUseCase.deleteById(1L);

        assertEquals(programVersion, deletedProgramVersion);
        verify(persistencePort).findById(1L);
        verify(persistencePort).deleteById(1L);
    }
}
