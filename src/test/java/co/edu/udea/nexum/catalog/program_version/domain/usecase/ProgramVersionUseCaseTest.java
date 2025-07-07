package co.edu.udea.nexum.catalog.program_version.domain.usecase;

import co.edu.udea.nexum.catalog.common.domain.exception.EntityNotFoundException;
import co.edu.udea.nexum.catalog.program.domain.model.Program;
import co.edu.udea.nexum.catalog.program.domain.spi.ProgramPersistencePort;
import co.edu.udea.nexum.catalog.program_version.domain.model.ProgramVersion;
import co.edu.udea.nexum.catalog.program_version.domain.spi.ProgramVersionPersistencePort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

class ProgramVersionUseCaseTest {

    private static final Long ID = 1L;
    private static final Long ID_2 = 2L;
    private static final Short VERSION = 1;
    private static final Short VERSION_2 = 2;
    private static final Integer START_YEAR = 2020;
    private static final Integer END_YEAR = 2024;
    private static final Integer START_YEAR_2 = 2025;
    private static final Integer END_YEAR_2 = 2029;
    public static final String PROGRAM1_SNIES_CODE = "dsfsdfsd";
    public static final String PROGRAM1_NAME = "Carrera #1";
    public static final String PROGRAM2_SNIES_CODE = "22323234";
    public static final String PROGRAM2_NAME = "Carrera #2";

    @Mock
    private ProgramVersionPersistencePort programVersionPersistencePort;
    @Mock
    private ProgramPersistencePort programPersistencePort;

    @InjectMocks
    private ProgramVersionUseCase programVersionUseCase;

    private final Program program = Program.builder()
            .id(ID)
            .code(PROGRAM1_SNIES_CODE)
            .name(PROGRAM1_NAME)
            .build();
    private final Program program2 = Program.builder()
            .id(ID_2)
            .code(PROGRAM2_SNIES_CODE)
            .name(PROGRAM2_NAME)
            .build();
    private final ProgramVersion programVersion = ProgramVersion.builder()
            .id(ID)
            .program(program)
            .version(VERSION)
            .startYear(START_YEAR)
            .endYear(END_YEAR)
            .build();
    private final ProgramVersion programVersion2 = ProgramVersion.builder()
            .id(ID_2)
            .program(program2)
            .version(VERSION_2)
            .startYear(START_YEAR_2)
            .endYear(END_YEAR_2)
            .build();

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void save_ShouldSaveAndReturnProgramVersion() {
        when(programVersionPersistencePort.save(programVersion)).thenReturn(programVersion);
        when(programPersistencePort.findById(any())).thenReturn(program);

        ProgramVersion result = programVersionUseCase.save(programVersion);

        assertThat(result).isNotNull();
        assertThat(result.getId()).isEqualTo(ID);

        verify(programVersionPersistencePort).save(programVersion);
    }

    @Test
    void findAll_ShouldReturnListOfProgramVersions() {
        when(programVersionPersistencePort.findAll()).thenReturn(List.of(programVersion, programVersion2));

        List<ProgramVersion> result = programVersionUseCase.findAll();

        assertThat(result).hasSize(2);
        assertThat(result).extracting(ProgramVersion::getId).containsExactlyInAnyOrder(ID, ID_2);

        verify(programVersionPersistencePort).findAll();
    }

    @Test
    void findById_ShouldReturnProgramVersion() {
        when(programVersionPersistencePort.findById(ID)).thenReturn(programVersion);

        ProgramVersion result = programVersionUseCase.findById(ID);

        assertThat(result).isNotNull();
        assertThat(result.getId()).isEqualTo(ID);

        verify(programVersionPersistencePort).findById(ID);
    }

    @Test
    void findById_ShouldThrowExceptionWhenNotFound() {
        when(programVersionPersistencePort.findById(ID)).thenReturn(null);

        assertThrows(EntityNotFoundException.class, () -> programVersionUseCase.findById(ID));

        verify(programVersionPersistencePort).findById(ID);
    }

    @Test
    void updateById_ShouldUpdateAndReturnProgramVersion() {
        when(programVersionPersistencePort.findById(ID)).thenReturn(programVersion);
        when(programVersionPersistencePort.update(programVersion)).thenReturn(programVersion);
        when(programPersistencePort.findById(any())).thenReturn(program);

        ProgramVersion result = programVersionUseCase.updateById(ID, programVersion);

        assertThat(result).isNotNull();
        assertThat(result.getId()).isEqualTo(ID);

        verify(programVersionPersistencePort).findById(ID);
        verify(programVersionPersistencePort).update(programVersion);
    }

    @Test
    void deleteById_ShouldDeleteAndReturnDeletedProgramVersion() {
        when(programVersionPersistencePort.findById(ID)).thenReturn(programVersion);

        ProgramVersion deletedProgramVersion = programVersionUseCase.deleteById(ID);

        assertThat(deletedProgramVersion).isNotNull();
        assertThat(deletedProgramVersion.getId()).isEqualTo(ID);

        verify(programVersionPersistencePort).findById(ID);
        verify(programVersionPersistencePort).deleteById(ID);
    }
}
