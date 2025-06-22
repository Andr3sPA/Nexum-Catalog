package co.edu.udea.nexum.catalog.program_version.infrastructure.input.rest.v1;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.configuration.advisor.dto.ExceptionResponse;
import co.edu.udea.nexum.catalog.common.infrastructure.configuration.advisor.dto.ValidationExceptionResponse;
import co.edu.udea.nexum.catalog.common.infrastructure.input.rest.BaseCrudController;
import co.edu.udea.nexum.catalog.program_version.application.dto.request.ProgramVersionRequest;
import co.edu.udea.nexum.catalog.program_version.application.dto.response.ProgramVersionResponse;
import co.edu.udea.nexum.catalog.program_version.application.handler.ProgramVersionHandler;
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
import static co.edu.udea.nexum.catalog.program_version.infrastructure.utils.constants.ProgramVersionRestConstants.*;


@Generated
@RestController
@RequiredArgsConstructor
@RequestMapping(value = PROGRAM_VERSION_CONTROLLER_PATH)
@Tag(name = PROGRAM_VERSION_CONTROLLER_NAME, description = PROGRAM_VERSION_CONTROLLER_DESCRIPTION)
public class ProgramVersionController implements BaseCrudController<Long, ProgramVersionResponse, ProgramVersionRequest> {
    private final ProgramVersionHandler programVersionHandler;

    @Operation(summary = SWAGGER_SAVE_NEW_PROGRAM_VERSION_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = SWAGGER_CODE_CREATED,
                    description = SWAGGER_NEW_PROGRAM_VERSION_SAVED_SUCCESSFULLY,
                    content = @Content(schema = @Schema(implementation = ProgramVersionResponse.class))
            ),
            @ApiResponse(
                    responseCode = SWAGGER_CODE_BAD_REQUEST,
                    description = SWAGGER_ERROR_VALIDATIONS_DO_NOT_PASS,
                    content = @Content(schema = @Schema(implementation = ValidationExceptionResponse.class))
            ),
    })
    @Override
    @PostMapping
    public ResponseEntity<ProgramVersionResponse> save(@RequestBody @Valid ProgramVersionRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(programVersionHandler.save(request));
    }

    @Operation(summary = SWAGGER_FIND_PROGRAM_VERSION_BY_ID_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = SWAGGER_CODE_OK,
                    description = SWAGGER_PROGRAM_VERSION_FOUND,
                    content = @Content(schema = @Schema(implementation = ProgramVersionResponse.class))
            ),
            @ApiResponse(
                    responseCode = SWAGGER_CODE_NOT_FOUND,
                    description = SWAGGER_PROGRAM_VERSION_WITH_ID_NOT_FOUND,
                    content = @Content(schema = @Schema(implementation = ExceptionResponse.class))
            ),
    })
    @Override
    @GetMapping(COMMON_ID_PATH)
    public ResponseEntity<ProgramVersionResponse> findById(@PathVariable Long id) {
        return ResponseEntity.ok(programVersionHandler.findById(id));
    }

    @Operation(summary = SWAGGER_FIND_ALL_PROGRAM_VERSIONS_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = SWAGGER_CODE_OK,
                    description = SWAGGER_FIND_ALL_PROGRAM_VERSIONS_SUCCESSFULLY,
                    content = @Content(array = @ArraySchema(schema = @Schema(implementation = ProgramVersionResponse.class)))
            ),
    })
    @Override
    @GetMapping
    public ResponseEntity<List<ProgramVersionResponse>> findAll() {
        return ResponseEntity.ok(programVersionHandler.findAll());
    }

    @Operation(summary = SWAGGER_UPDATE_PROGRAM_VERSION_BY_ID_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = SWAGGER_CODE_OK,
                    description = SWAGGER_PROGRAM_VERSION_UPDATED_SUCCESSFULLY,
                    content = @Content(schema = @Schema(implementation = ProgramVersionResponse.class))
            ),
            @ApiResponse(
                    responseCode = SWAGGER_CODE_NOT_FOUND,
                    description = SWAGGER_PROGRAM_VERSION_WITH_ID_NOT_FOUND,
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
    public ResponseEntity<ProgramVersionResponse> updateById(@PathVariable Long id, @RequestBody @Valid ProgramVersionRequest request) {
        return ResponseEntity.ok(programVersionHandler.updateById(id, request));
    }

    @Operation(summary = SWAGGER_DELETE_PROGRAM_VERSION_BY_ID_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = SWAGGER_CODE_OK,
                    description = SWAGGER_PROGRAM_VERSION_DELETED_SUCCESSFULLY,
                    content = @Content(schema = @Schema(implementation = ProgramVersionResponse.class))
            ),
            @ApiResponse(
                    responseCode = SWAGGER_CODE_NOT_FOUND,
                    description = SWAGGER_PROGRAM_VERSION_WITH_ID_NOT_FOUND,
                    content = @Content(schema = @Schema(implementation = ExceptionResponse.class))
            ),
    })
    @Override
    @DeleteMapping(COMMON_ID_PATH)
    public ResponseEntity<ProgramVersionResponse> deleteById(@PathVariable Long id) {
        return ResponseEntity.ok(programVersionHandler.deleteById(id));
    }

}
