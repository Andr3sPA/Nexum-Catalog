package co.edu.udea.nexum.catalog.program.application.handler.impl;

import co.edu.udea.nexum.catalog.program.application.dto.request.ProgramRequest;
import co.edu.udea.nexum.catalog.program.application.dto.response.ProgramResponse;
import co.edu.udea.nexum.catalog.program.application.mapper.ProgramRequestMapper;
import co.edu.udea.nexum.catalog.program.application.mapper.ProgramResponseMapper;
import co.edu.udea.nexum.catalog.program.domain.api.ProgramServicePort;
import co.edu.udea.nexum.catalog.program.domain.model.Program;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class ProgramHandlerImplTest {

    private static final Long ID = 1L;
    private static final String NAME = "Ingeniería de Sistemas";
    private static final String SNIES_CODE = "12345";

    @Mock
    private ProgramServicePort programServicePort;

    @Mock
    private ProgramResponseMapper programResponseMapper;

    @Mock
    private ProgramRequestMapper programRequestMapper;

    @InjectMocks
    private ProgramHandlerImpl programHandlerImpl;

    private Program program;
    private ProgramRequest programRequest;
    private ProgramResponse programResponse;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        program = Program.builder()
                .id(ID)
                .name(NAME)
                .code(SNIES_CODE)
                .build();

        programRequest = ProgramRequest.builder()
                .name(NAME)
                .code(SNIES_CODE)
                .build();

        programResponse = ProgramResponse.builder()
                .id(ID)
                .name(NAME)
                .code(SNIES_CODE)
                .build();
    }

    @Test
    void save_ShouldReturnSavedProgramResponse() {
        when(programRequestMapper.toDomain(programRequest)).thenReturn(program);
        when(programServicePort.save(program)).thenReturn(program);
        when(programResponseMapper.toResponse(program)).thenReturn(programResponse);

        ProgramResponse result = programHandlerImpl.save(programRequest);

        assertThat(result).isNotNull();
        assertThat(result.getId()).isEqualTo(ID);
        assertThat(result.getName()).isEqualTo(NAME);

        verify(programRequestMapper).toDomain(programRequest);
        verify(programServicePort).save(program);
        verify(programResponseMapper).toResponse(program);
    }

    @Test
    void findAll_ShouldReturnListOfProgramResponses() {
        when(programServicePort.findAll()).thenReturn(List.of(program));
        when(programResponseMapper.toResponses(List.of(program))).thenReturn(List.of(programResponse));

        List<ProgramResponse> result = programHandlerImpl.findAll();

        assertThat(result).isNotEmpty();
        assertThat(result.getFirst().getId()).isEqualTo(ID);

        verify(programServicePort).findAll();
        verify(programResponseMapper).toResponses(List.of(program));
    }

    @Test
    void findById_ShouldReturnProgramResponse() {
        when(programServicePort.findById(ID)).thenReturn(program);
        when(programResponseMapper.toResponse(program)).thenReturn(programResponse);

        ProgramResponse result = programHandlerImpl.findById(ID);

        assertThat(result).isNotNull();
        assertThat(result.getId()).isEqualTo(ID);

        verify(programServicePort).findById(ID);
        verify(programResponseMapper).toResponse(program);
    }

    @Test
    void updateById_ShouldReturnUpdatedProgramResponse() {
        when(programRequestMapper.toDomain(programRequest)).thenReturn(program);
        when(programServicePort.updateById(ID, program)).thenReturn(program);
        when(programResponseMapper.toResponse(program)).thenReturn(programResponse);

        ProgramResponse result = programHandlerImpl.updateById(ID, programRequest);

        assertThat(result).isNotNull();
        assertThat(result.getId()).isEqualTo(ID);

        verify(programRequestMapper).toDomain(programRequest);
        verify(programServicePort).updateById(ID, program);
        verify(programResponseMapper).toResponse(program);
    }

    @Test
    void deleteById_ShouldReturnDeletedProgramResponse() {
        when(programServicePort.deleteById(ID)).thenReturn(program);
        when(programResponseMapper.toResponse(program)).thenReturn(programResponse);

        ProgramResponse result = programHandlerImpl.deleteById(ID);

        assertThat(result).isNotNull();
        assertThat(result.getId()).isEqualTo(ID);

        verify(programServicePort).deleteById(ID);
        verify(programResponseMapper).toResponse(program);
    }
}
