package co.edu.udea.nexum.catalog.program.infrastructure.input.rest.v1;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.configuration.advisor.dto.ExceptionResponse;
import co.edu.udea.nexum.catalog.common.infrastructure.configuration.advisor.dto.ValidationExceptionResponse;
import co.edu.udea.nexum.catalog.common.infrastructure.input.rest.BaseCrudController;
import co.edu.udea.nexum.catalog.program.application.dto.request.ProgramRequest;
import co.edu.udea.nexum.catalog.program.application.dto.response.ProgramResponse;
import co.edu.udea.nexum.catalog.program.application.handler.ProgramHandler;
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
import static co.edu.udea.nexum.catalog.program.infrastructure.utils.constants.ProgramRestConstants.*;

@Generated
@RestController
@RequiredArgsConstructor
@RequestMapping(value = PROGRAM_CONTROLLER_PATH)
@Tag(name = PROGRAM_CONTROLLER_NAME, description = PROGRAM_CONTROLLER_DESCRIPTION)
public class ProgramController implements BaseCrudController<Long, ProgramResponse, ProgramRequest> {
    private final ProgramHandler programHandler;

    @Operation(summary = SWAGGER_SAVE_NEW_PROGRAM_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = SWAGGER_CODE_CREATED,
                    description = SWAGGER_NEW_PROGRAM_SAVED_SUCCESSFULLY,
                    content = @Content(schema = @Schema(implementation = ProgramResponse.class))
            ),
            @ApiResponse(
                    responseCode = SWAGGER_CODE_BAD_REQUEST,
                    description = SWAGGER_ERROR_VALIDATIONS_DO_NOT_PASS,
                    content = @Content(schema = @Schema(implementation = ValidationExceptionResponse.class))
            ),
    })
    @Override
    @PostMapping
    public ResponseEntity<ProgramResponse> save(@Valid ProgramRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(programHandler.save(request));
    }

    @Operation(summary = SWAGGER_FIND_PROGRAM_BY_ID_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = SWAGGER_CODE_OK,
                    description = SWAGGER_PROGRAM_FOUND,
                    content = @Content(schema = @Schema(implementation = ProgramResponse.class))
            ),
            @ApiResponse(
                    responseCode = SWAGGER_CODE_NOT_FOUND,
                    description = SWAGGER_PROGRAM_WITH_ID_NOT_FOUND,
                    content = @Content(schema = @Schema(implementation = ExceptionResponse.class))
            ),
    })
    @Override
    @GetMapping(COMMON_ID_PATH)
    public ResponseEntity<ProgramResponse> findById(@PathVariable Long id) {
        return ResponseEntity.ok(programHandler.findById(id));
    }

    @Operation(summary = SWAGGER_FIND_ALL_PROGRAMS_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = SWAGGER_CODE_OK,
                    description = SWAGGER_FIND_ALL_PROGRAMS_SUCCESSFULLY,
                    content = @Content(array = @ArraySchema(schema = @Schema(implementation = ProgramResponse.class)))
            ),
    })
    @Override
    @GetMapping
    public ResponseEntity<List<ProgramResponse>> findAll() {
        return ResponseEntity.ok(programHandler.findAll());
    }

    @Operation(summary = SWAGGER_UPDATE_PROGRAM_BY_ID_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = SWAGGER_CODE_OK,
                    description = SWAGGER_PROGRAM_UDPATED_SUCCESSFULLY,
                    content = @Content(schema = @Schema(implementation = ProgramResponse.class))
            ),
            @ApiResponse(
                    responseCode = SWAGGER_CODE_NOT_FOUND,
                    description = SWAGGER_PROGRAM_WITH_ID_NOT_FOUND,
                    content = @Content(schema = @Schema(implementation = ExceptionResponse.class))
            ),
            @ApiResponse(
                    responseCode = SWAGGER_CODE_BAD_REQUEST,
                    description = SWAGGER_ERROR_VALIDATIONS_DO_NOT_PASS,
                    content = @Content(schema = @Schema(implementation = ValidationExceptionResponse.class))
            ),
    })
    @Override
    @PutMapping(COMMON_ID_PATH)
    public ResponseEntity<ProgramResponse> updateById(@PathVariable Long id, ProgramRequest request) {
        return ResponseEntity.ok(programHandler.updateById(id, request));
    }

    @Operation(summary = SWAGGER_DELETE_PROGRAM_BY_ID_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = SWAGGER_CODE_OK,
                    description = SWAGGER_PROGRAM_DELETED_SUCCESSFULLY,
                    content = @Content(schema = @Schema(implementation = ProgramResponse.class))
            ),
            @ApiResponse(
                    responseCode = SWAGGER_CODE_NOT_FOUND,
                    description = SWAGGER_PROGRAM_WITH_ID_NOT_FOUND,
                    content = @Content(schema = @Schema(implementation = ExceptionResponse.class))
            ),
    })
    @Override
    @DeleteMapping(COMMON_ID_PATH)
    public ResponseEntity<ProgramResponse> deleteById(@PathVariable Long id) {
        return ResponseEntity.ok(programHandler.deleteById(id));
    }
}
