package co.edu.udea.nexum.catalog.program_version.application.handler.impl;

import co.edu.udea.nexum.catalog.program_version.application.dto.request.ProgramVersionRequest;
import co.edu.udea.nexum.catalog.program_version.application.dto.response.ProgramVersionResponse;
import co.edu.udea.nexum.catalog.program_version.application.mapper.ProgramVersionRequestMapper;
import co.edu.udea.nexum.catalog.program_version.application.mapper.ProgramVersionResponseMapper;
import co.edu.udea.nexum.catalog.program_version.domain.api.ProgramVersionServicePort;
import co.edu.udea.nexum.catalog.program_version.domain.model.ProgramVersion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class ProgramVersionHandlerImplTest {

    private static final Long ID = 1L;
    private static final Short VERSION = 1;
    private static final Integer START_YEAR = 2020;
    private static final Integer END_YEAR = 2024;

    private ProgramVersionServicePort servicePort;
    private ProgramVersionResponseMapper responseMapper;
    private ProgramVersionRequestMapper requestMapper;

    private ProgramVersionHandlerImpl handler;

    private ProgramVersion programVersion;
    private ProgramVersionRequest programVersionRequest;
    private ProgramVersionResponse programVersionResponse;

    @BeforeEach
    void setUp() {
        servicePort = mock(ProgramVersionServicePort.class);
        responseMapper = mock(ProgramVersionResponseMapper.class);
        requestMapper = mock(ProgramVersionRequestMapper.class);

        handler = new ProgramVersionHandlerImpl(servicePort, responseMapper, requestMapper);

        programVersion = ProgramVersion.builder()
                .id(ID)
                .version(VERSION)
                .startYear(START_YEAR)
                .endYear(END_YEAR)
                .build();

        programVersionRequest = ProgramVersionRequest.builder().build();
        // Aquí podrías setear fields de ser necesario

        programVersionResponse = ProgramVersionResponse.builder()
                .id(ID)
                .version(VERSION)
                .startYear(START_YEAR)
                .endYear(END_YEAR)
                .build();
    }

    @Test
    void save_ShouldSaveAndReturnProgramVersionResponse() {
        when(requestMapper.toDomain(programVersionRequest)).thenReturn(programVersion);
        when(servicePort.save(programVersion)).thenReturn(programVersion);
        when(responseMapper.toResponse(programVersion)).thenReturn(programVersionResponse);

        ProgramVersionResponse result = handler.save(programVersionRequest);

        assertThat(result).isNotNull();
        assertThat(result.getId()).isEqualTo(ID);

        verify(requestMapper).toDomain(programVersionRequest);
        verify(servicePort).save(programVersion);
        verify(responseMapper).toResponse(programVersion);
    }

    @Test
    void findAll_ShouldReturnListOfProgramVersionResponses() {
        when(servicePort.findAll()).thenReturn(List.of(programVersion));
        when(responseMapper.toResponses(List.of(programVersion))).thenReturn(List.of(programVersionResponse));

        List<ProgramVersionResponse> result = handler.findAll();

        assertThat(result).hasSize(1);
        assertThat(result.getFirst().getId()).isEqualTo(ID);

        verify(servicePort).findAll();
        verify(responseMapper).toResponses(List.of(programVersion));
    }

    @Test
    void findById_ShouldReturnProgramVersionResponse() {
        when(servicePort.findById(ID)).thenReturn(programVersion);
        when(responseMapper.toResponse(programVersion)).thenReturn(programVersionResponse);

        ProgramVersionResponse result = handler.findById(ID);

        assertThat(result).isNotNull();
        assertThat(result.getId()).isEqualTo(ID);

        verify(servicePort).findById(ID);
        verify(responseMapper).toResponse(programVersion);
    }

    @Test
    void updateById_ShouldUpdateAndReturnProgramVersionResponse() {
        when(requestMapper.toDomain(programVersionRequest)).thenReturn(programVersion);
        when(servicePort.updateById(ID, programVersion)).thenReturn(programVersion);
        when(responseMapper.toResponse(programVersion)).thenReturn(programVersionResponse);

        ProgramVersionResponse result = handler.updateById(ID, programVersionRequest);

        assertThat(result).isNotNull();
        assertThat(result.getId()).isEqualTo(ID);

        verify(requestMapper).toDomain(programVersionRequest);
        verify(servicePort).updateById(ID, programVersion);
        verify(responseMapper).toResponse(programVersion);
    }

    @Test
    void deleteById_ShouldDeleteAndReturnProgramVersionResponse() {
        when(servicePort.deleteById(ID)).thenReturn(programVersion);
        when(responseMapper.toResponse(programVersion)).thenReturn(programVersionResponse);

        ProgramVersionResponse result = handler.deleteById(ID);

        assertThat(result).isNotNull();
        assertThat(result.getId()).isEqualTo(ID);

        verify(servicePort).deleteById(ID);
        verify(responseMapper).toResponse(programVersion);
    }
}
