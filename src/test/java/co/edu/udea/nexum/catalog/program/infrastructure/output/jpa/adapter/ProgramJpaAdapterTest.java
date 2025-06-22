package co.edu.udea.nexum.catalog.program.infrastructure.output.jpa.adapter;

import co.edu.udea.nexum.catalog.program.domain.model.Program;
import co.edu.udea.nexum.catalog.program.infrastructure.output.jpa.entity.ProgramEntity;
import co.edu.udea.nexum.catalog.program.infrastructure.output.jpa.mapper.ProgramEntityMapper;
import co.edu.udea.nexum.catalog.program.infrastructure.output.jpa.repository.ProgramRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class ProgramJpaAdapterTest {

    private static final Long ID = 1L;
    private static final String NAME = "Ingeniería de Software";
    private static final String SNIES_CODE = "54321";

    @Mock
    private ProgramRepository programRepository;

    @Mock
    private ProgramEntityMapper programEntityMapper;

    @InjectMocks
    private ProgramJpaAdapter programJpaAdapter;

    private Program program;
    private ProgramEntity programEntity;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        program = Program.builder()
                .id(ID)
                .name(NAME)
                .sniesCode(SNIES_CODE)
                .build();

        programEntity = ProgramEntity.builder()
                .id(ID)
                .name(NAME)
                .sniesCode(SNIES_CODE)
                .build();
    }

    @Test
    void save_ShouldSaveAndReturnProgram() {
        when(programEntityMapper.toEntity(program)).thenReturn(programEntity);
        when(programRepository.save(programEntity)).thenReturn(programEntity);
        when(programEntityMapper.toDomain(programEntity)).thenReturn(program);

        Program result = programJpaAdapter.save(program);

        assertThat(result).isNotNull();
        assertThat(result.getId()).isEqualTo(ID);
        assertThat(result.getName()).isEqualTo(NAME);

        verify(programEntityMapper).toEntity(program);
        verify(programRepository).save(programEntity);
        verify(programEntityMapper).toDomain(programEntity);
    }

    @Test
    void findAll_ShouldReturnListOfPrograms() {
        when(programRepository.findAll()).thenReturn(List.of(programEntity));
        when(programEntityMapper.toDomains(List.of(programEntity))).thenReturn(List.of(program));

        List<Program> result = programJpaAdapter.findAll();

        assertThat(result).isNotEmpty();
        assertThat(result.getFirst().getId()).isEqualTo(ID);

        verify(programRepository).findAll();
        verify(programEntityMapper).toDomains(List.of(programEntity));
    }

    @Test
    void findById_ShouldReturnProgram() {
        when(programRepository.findById(ID)).thenReturn(Optional.of(programEntity));
        when(programEntityMapper.toDomain(programEntity)).thenReturn(program);

        Program result = programJpaAdapter.findById(ID);

        assertThat(result).isNotNull();
        assertThat(result.getId()).isEqualTo(ID);

        verify(programRepository).findById(ID);
        verify(programEntityMapper).toDomain(programEntity);
    }

    @Test
    void update_ShouldUpdateAndReturnProgram() {
        when(programEntityMapper.toEntity(program)).thenReturn(programEntity);
        when(programRepository.save(programEntity)).thenReturn(programEntity);
        when(programEntityMapper.toDomain(programEntity)).thenReturn(program);

        Program result = programJpaAdapter.update(program);

        assertThat(result).isNotNull();
        assertThat(result.getId()).isEqualTo(ID);

        verify(programEntityMapper).toEntity(program);
        verify(programRepository).save(programEntity);
        verify(programEntityMapper).toDomain(programEntity);
    }

    @Test
    void deleteById_ShouldDeleteProgramById() {
        doNothing().when(programRepository).deleteById(ID);

        programJpaAdapter.deleteById(ID);

        verify(programRepository).deleteById(ID);
    }
}
