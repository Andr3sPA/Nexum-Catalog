package co.edu.udea.nexum.catalog.program.domain.usecase;

import co.edu.udea.nexum.catalog.common.domain.exception.EntityNotFoundException;
import co.edu.udea.nexum.catalog.program.domain.model.Program;
import co.edu.udea.nexum.catalog.program.domain.spi.ProgramPersistencePort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProgramUseCaseTest {

    private ProgramPersistencePort persistencePort;
    private ProgramUseCase programUseCase;

    @BeforeEach
    void setUp() {
        persistencePort = mock(ProgramPersistencePort.class);
        programUseCase = new ProgramUseCase(persistencePort);
    }

    @Test
    void shouldSaveProgram() {
        Program program = Program.builder()
                .id(1L)
                .name("Program Name")
                .sniesCode("Description")
                .build();

        when(persistencePort.save(program)).thenReturn(program);

        Program result = programUseCase.save(program);

        assertEquals(program, result);
        verify(persistencePort).save(program);
    }

    @Test
    void shouldFindAllPrograms() {
        List<Program> programs = List.of(
                Program.builder().id(1L).name("Program 1").sniesCode("Desc 1").build(),
                Program.builder().id(2L).name("Program 2").sniesCode("Desc 2").build()
        );
        when(persistencePort.findAll()).thenReturn(programs);

        List<Program> result = programUseCase.findAll();

        assertEquals(programs, result);
        verify(persistencePort).findAll();
    }

    @Test
    void shouldFindProgramById() {
        Program program = Program.builder()
                .id(1L)
                .name("Program 1")
                .sniesCode("Desc 1")
                .build();

        when(persistencePort.findById(1L)).thenReturn(program);

        Program result = programUseCase.findById(1L);

        assertEquals(program, result);
        verify(persistencePort).findById(1L);
    }

    @Test
    void shouldThrowExceptionWhenProgramNotFound() {
        when(persistencePort.findById(1L)).thenReturn(null);

        assertThrows(EntityNotFoundException.class, () -> programUseCase.findById(1L));
        verify(persistencePort).findById(1L);
    }

    @Test
    void shouldUpdateProgramById() {
        Program program = Program.builder()
                .id(1L)
                .name("Program 1")
                .sniesCode("Desc 1")
                .build();

        when(persistencePort.findById(1L)).thenReturn(program);
        when(persistencePort.update(program)).thenReturn(program);

        Program result = programUseCase.updateById(1L, program);

        assertEquals(program, result);
        verify(persistencePort).findById(1L);
        verify(persistencePort).update(program);
    }

    @Test
    void shouldDeleteProgramById() {
        Program program = Program.builder()
                .id(1L)
                .name("Program 1")
                .sniesCode("Desc 1")
                .build();

        when(persistencePort.findById(1L)).thenReturn(program);

        Program deletedProgram = programUseCase.deleteById(1L);

        assertEquals(program, deletedProgram);
        verify(persistencePort).findById(1L);
        verify(persistencePort).deleteById(1L);
    }
}
