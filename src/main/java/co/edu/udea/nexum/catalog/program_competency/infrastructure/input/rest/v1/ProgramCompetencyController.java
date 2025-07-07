package co.edu.udea.nexum.catalog.program_competency.infrastructure.input.rest.v1;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.configuration.advisor.dto.ExceptionResponse;
import co.edu.udea.nexum.catalog.common.infrastructure.configuration.advisor.dto.ValidationExceptionResponse;
import co.edu.udea.nexum.catalog.common.infrastructure.input.rest.BaseCrudController;
import co.edu.udea.nexum.catalog.program_competency.application.dto.request.ProgramCompetencyRequest;
import co.edu.udea.nexum.catalog.program_competency.application.dto.response.ProgramCompetencyResponse;
import co.edu.udea.nexum.catalog.program_competency.application.handler.ProgramCompetencyHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static co.edu.udea.nexum.catalog.common.infrastructure.utils.constants.CommonRestConstants.*;
import static co.edu.udea.nexum.catalog.program_competency.infrastructure.utils.constants.ProgramCompetencyRestConstants.*;

@Generated
@RestController
@RequiredArgsConstructor
@RequestMapping(value = PROGRAM_COMPETENCY_CONTROLLER_PATH)
@Tag(name = PROGRAM_COMPETENCY_CONTROLLER_NAME, description = PROGRAM_COMPETENCY_CONTROLLER_DESCRIPTION)
public class ProgramCompetencyController implements BaseCrudController<Long, ProgramCompetencyResponse, ProgramCompetencyRequest> {

    private final ProgramCompetencyHandler handler;

    @Operation(summary = SWAGGER_SAVE_NEW_PROGRAM_COMPETENCY_SUMMARY)
    @ApiResponses({
            @ApiResponse(responseCode = SWAGGER_CODE_CREATED, description = SWAGGER_NEW_PROGRAM_COMPETENCY_SAVED_SUCCESSFULLY,
                    content = @Content(schema = @Schema(implementation = ProgramCompetencyResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_BAD_REQUEST, description = SWAGGER_ERROR_VALIDATIONS_DO_NOT_PASS,
                    content = @Content(schema = @Schema(implementation = ValidationExceptionResponse.class)))
    })
    @PostMapping
    @Override
    public ResponseEntity<ProgramCompetencyResponse> save(@RequestBody @Valid ProgramCompetencyRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(handler.save(request));
    }

    @Operation(summary = SWAGGER_FIND_PROGRAM_COMPETENCY_BY_ID_SUMMARY)
    @ApiResponses({
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_PROGRAM_COMPETENCY_FOUND,
                    content = @Content(schema = @Schema(implementation = ProgramCompetencyResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_NOT_FOUND, description = SWAGGER_PROGRAM_COMPETENCY_WITH_ID_NOT_FOUND,
                    content = @Content(schema = @Schema(implementation = ExceptionResponse.class)))
    })
    @GetMapping(COMMON_ID_PATH)
    @Override
    public ResponseEntity<ProgramCompetencyResponse> findById(@PathVariable Long id) {
        return ResponseEntity.ok(handler.findById(id));
    }

    @Operation(summary = SWAGGER_FIND_ALL_PROGRAM_COMPETENCIES_SUMMARY)
    @ApiResponses({
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_FIND_ALL_PROGRAM_COMPETENCIES_SUCCESSFULLY,
                    content = @Content(array = @ArraySchema(schema = @Schema(implementation = ProgramCompetencyResponse.class))))
    })
    @GetMapping
    @Override
    public ResponseEntity<List<ProgramCompetencyResponse>> findAll() {
        return ResponseEntity.ok(handler.findAll());
    }

    @Operation(summary = SWAGGER_UPDATE_PROGRAM_COMPETENCY_BY_ID_SUMMARY)
    @ApiResponses({
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_PROGRAM_COMPETENCY_UPDATED_SUCCESSFULLY,
                    content = @Content(schema = @Schema(implementation = ProgramCompetencyResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_NOT_FOUND, description = SWAGGER_PROGRAM_COMPETENCY_WITH_ID_NOT_FOUND,
                    content = @Content(schema = @Schema(implementation = ExceptionResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_BAD_REQUEST, description = SWAGGER_ERROR_VALIDATIONS_DO_NOT_PASS,
                    content = @Content(schema = @Schema(implementation = ValidationExceptionResponse.class)))
    })
    @PutMapping(COMMON_ID_PATH)
    @Override
    public ResponseEntity<ProgramCompetencyResponse> updateById(@PathVariable Long id, @RequestBody @Valid ProgramCompetencyRequest request) {
        return ResponseEntity.ok(handler.updateById(id, request));
    }

    @Operation(summary = SWAGGER_DELETE_PROGRAM_COMPETENCY_BY_ID_SUMMARY)
    @ApiResponses({
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_PROGRAM_COMPETENCY_DELETED_SUCCESSFULLY,
                    content = @Content(schema = @Schema(implementation = ProgramCompetencyResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_NOT_FOUND, description = SWAGGER_PROGRAM_COMPETENCY_WITH_ID_NOT_FOUND,
                    content = @Content(schema = @Schema(implementation = ExceptionResponse.class)))
    })
    @DeleteMapping(COMMON_ID_PATH)
    @Override
    public ResponseEntity<ProgramCompetencyResponse> deleteById(@PathVariable Long id) {
        return ResponseEntity.ok(handler.deleteById(id));
    }

    @Operation(summary = SWAGGER_FIND_ALL_BY_PROGRAM_ID_SUMMARY)
    @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_FIND_ALL_BY_PROGRAM_ID_SUCCESSFULLY,
            content = @Content(array = @ArraySchema(schema = @Schema(implementation = ProgramCompetencyResponse.class))))
    @GetMapping(PROGRAM_PROGRAM_ID)
    public ResponseEntity<List<ProgramCompetencyResponse>> findAllByProgramId(@PathVariable Long programId) {
        return ResponseEntity.ok(handler.findAllByProgramId(programId));
    }
}
