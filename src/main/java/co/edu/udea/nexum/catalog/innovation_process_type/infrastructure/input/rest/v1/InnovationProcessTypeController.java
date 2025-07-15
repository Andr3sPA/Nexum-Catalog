package co.edu.udea.nexum.catalog.innovation_process_type.infrastructure.input.rest.v1;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.configuration.advisor.dto.ExceptionResponse;
import co.edu.udea.nexum.catalog.common.infrastructure.configuration.advisor.dto.ValidationExceptionResponse;
import co.edu.udea.nexum.catalog.common.infrastructure.input.rest.BaseCrudController;
import co.edu.udea.nexum.catalog.innovation_process_type.application.dto.request.InnovationProcessTypeRequest;
import co.edu.udea.nexum.catalog.innovation_process_type.application.dto.response.InnovationProcessTypeResponse;
import co.edu.udea.nexum.catalog.innovation_process_type.application.handler.InnovationProcessTypeHandler;
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
import static co.edu.udea.nexum.catalog.innovation_process_type.infrastructure.utils.constants.InnovationProcessTypeRestConstants.*;

@Generated
@RestController
@RequiredArgsConstructor
@RequestMapping(value = INNOVATION_PROCESS_TYPE_CONTROLLER_PATH)
@Tag(name = INNOVATION_PROCESS_TYPE_CONTROLLER_NAME, description = INNOVATION_PROCESS_TYPE_CONTROLLER_DESCRIPTION)
public class InnovationProcessTypeController implements BaseCrudController<Long, InnovationProcessTypeResponse, InnovationProcessTypeRequest> {

    private final InnovationProcessTypeHandler handler;

    @Operation(summary = SWAGGER_SAVE_NEW_INNOVATION_PROCESS_TYPE_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_CREATED, description = SWAGGER_NEW_INNOVATION_PROCESS_TYPE_SAVED_SUCCESSFULLY,
                    content = @Content(schema = @Schema(implementation = InnovationProcessTypeResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_BAD_REQUEST, description = SWAGGER_ERROR_VALIDATIONS_DO_NOT_PASS,
                    content = @Content(schema = @Schema(implementation = ValidationExceptionResponse.class)))
    })
    @PostMapping
    @Override
    public ResponseEntity<InnovationProcessTypeResponse> save(@RequestBody @Valid InnovationProcessTypeRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(handler.save(request));
    }

    @Operation(summary = SWAGGER_FIND_INNOVATION_PROCESS_TYPE_BY_ID_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_INNOVATION_PROCESS_TYPE_FOUND,
                    content = @Content(schema = @Schema(implementation = InnovationProcessTypeResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_NOT_FOUND, description = SWAGGER_INNOVATION_PROCESS_TYPE_WITH_ID_NOT_FOUND,
                    content = @Content(schema = @Schema(implementation = ExceptionResponse.class)))
    })
    @GetMapping(COMMON_ID_PATH)
    @Override
    public ResponseEntity<InnovationProcessTypeResponse> findById(@PathVariable Long id) {
        return ResponseEntity.ok(handler.findById(id));
    }

    @Operation(summary = SWAGGER_FIND_ALL_INNOVATION_PROCESS_TYPES_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_FIND_ALL_INNOVATION_PROCESS_TYPES_SUCCESSFULLY,
                    content = @Content(array = @ArraySchema(schema = @Schema(implementation = InnovationProcessTypeResponse.class))))
    })
    @GetMapping
    @Override
    public ResponseEntity<List<InnovationProcessTypeResponse>> findAll() {
        return ResponseEntity.ok(handler.findAll());
    }

    @Operation(summary = SWAGGER_UPDATE_INNOVATION_PROCESS_TYPE_BY_ID_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_INNOVATION_PROCESS_TYPE_UPDATED_SUCCESSFULLY,
                    content = @Content(schema = @Schema(implementation = InnovationProcessTypeResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_NOT_FOUND, description = SWAGGER_INNOVATION_PROCESS_TYPE_WITH_ID_NOT_FOUND,
                    content = @Content(schema = @Schema(implementation = ExceptionResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_BAD_REQUEST, description = SWAGGER_ERROR_VALIDATIONS_DO_NOT_PASS,
                    content = @Content(schema = @Schema(implementation = ValidationExceptionResponse.class)))
    })
    @PutMapping(COMMON_ID_PATH)
    @Override
    public ResponseEntity<InnovationProcessTypeResponse> updateById(@PathVariable Long id, @RequestBody @Valid InnovationProcessTypeRequest request) {
        return ResponseEntity.ok(handler.updateById(id, request));
    }

    @Operation(summary = SWAGGER_DELETE_INNOVATION_PROCESS_TYPE_BY_ID_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_INNOVATION_PROCESS_TYPE_DELETED_SUCCESSFULLY,
                    content = @Content(schema = @Schema(implementation = InnovationProcessTypeResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_NOT_FOUND, description = SWAGGER_INNOVATION_PROCESS_TYPE_WITH_ID_NOT_FOUND,
                    content = @Content(schema = @Schema(implementation = ExceptionResponse.class)))
    })
    @DeleteMapping(COMMON_ID_PATH)
    @Override
    public ResponseEntity<InnovationProcessTypeResponse> deleteById(@PathVariable Long id) {
        return ResponseEntity.ok(handler.deleteById(id));
    }

    @Operation(summary = SWAGGER_FIND_ALL_BY_ENABLED_SUMMARY)
    @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_FIND_ALL_BY_ENABLED_SUCCESSFULLY,
            content = @Content(array = @ArraySchema(schema = @Schema(implementation = InnovationProcessTypeResponse.class))))
    @GetMapping(ENABLED_PATH)
    public ResponseEntity<List<InnovationProcessTypeResponse>> findAllByEnabled(@RequestParam boolean enabled) {
        return ResponseEntity.ok(handler.findAllByEnabled(enabled));
    }

    @GetMapping(IDS_PATH)
    public ResponseEntity<List<InnovationProcessTypeResponse>> findAllByIds(@RequestParam List<Long> ids) {
        return ResponseEntity.ok(handler.findByIds(ids));
    }
}
