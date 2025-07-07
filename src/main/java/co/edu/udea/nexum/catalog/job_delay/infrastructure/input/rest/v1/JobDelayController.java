package co.edu.udea.nexum.catalog.job_delay.infrastructure.input.rest.v1;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.configuration.advisor.dto.ExceptionResponse;
import co.edu.udea.nexum.catalog.common.infrastructure.configuration.advisor.dto.ValidationExceptionResponse;
import co.edu.udea.nexum.catalog.common.infrastructure.input.rest.BaseCrudController;
import co.edu.udea.nexum.catalog.job_delay.application.dto.request.JobDelayRequest;
import co.edu.udea.nexum.catalog.job_delay.application.dto.response.JobDelayResponse;
import co.edu.udea.nexum.catalog.job_delay.application.handler.JobDelayHandler;
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
import static co.edu.udea.nexum.catalog.job_delay.infrastructure.utils.constants.JobDelayRestConstants.*;

@Generated
@RestController
@RequiredArgsConstructor
@RequestMapping(value = JOB_DELAY_CONTROLLER_PATH)
@Tag(name = JOB_DELAY_CONTROLLER_NAME, description = JOB_DELAY_CONTROLLER_DESCRIPTION)
public class JobDelayController implements BaseCrudController<Long, JobDelayResponse, JobDelayRequest> {

    private final JobDelayHandler jobDelayHandler;

    @Operation(summary = SWAGGER_SAVE_NEW_JOB_DELAY_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_CREATED, description = SWAGGER_NEW_JOB_DELAY_SAVED_SUCCESSFULLY,
                    content = @Content(schema = @Schema(implementation = JobDelayResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_BAD_REQUEST, description = SWAGGER_ERROR_VALIDATIONS_DO_NOT_PASS,
                    content = @Content(schema = @Schema(implementation = ValidationExceptionResponse.class)))
    })
    @Override
    @PostMapping
    public ResponseEntity<JobDelayResponse> save(@RequestBody @Valid JobDelayRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(jobDelayHandler.save(request));
    }

    @Operation(summary = SWAGGER_FIND_JOB_DELAY_BY_ID_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_JOB_DELAY_FOUND,
                    content = @Content(schema = @Schema(implementation = JobDelayResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_NOT_FOUND, description = SWAGGER_JOB_DELAY_WITH_ID_NOT_FOUND,
                    content = @Content(schema = @Schema(implementation = ExceptionResponse.class)))
    })
    @Override
    @GetMapping(COMMON_ID_PATH)
    public ResponseEntity<JobDelayResponse> findById(@PathVariable Long id) {
        return ResponseEntity.ok(jobDelayHandler.findById(id));
    }

    @Operation(summary = SWAGGER_FIND_ALL_JOB_DELAYS_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_FIND_ALL_JOB_DELAYS_SUCCESSFULLY,
                    content = @Content(array = @ArraySchema(schema = @Schema(implementation = JobDelayResponse.class))))
    })
    @Override
    @GetMapping
    public ResponseEntity<List<JobDelayResponse>> findAll() {
        return ResponseEntity.ok(jobDelayHandler.findAll());
    }

    @Operation(summary = SWAGGER_UPDATE_JOB_DELAY_BY_ID_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_JOB_DELAY_UPDATED_SUCCESSFULLY,
                    content = @Content(schema = @Schema(implementation = JobDelayResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_NOT_FOUND, description = SWAGGER_JOB_DELAY_WITH_ID_NOT_FOUND,
                    content = @Content(schema = @Schema(implementation = ExceptionResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_BAD_REQUEST, description = SWAGGER_ERROR_VALIDATIONS_DO_NOT_PASS,
                    content = @Content(schema = @Schema(implementation = ValidationExceptionResponse.class)))
    })
    @Override
    @PutMapping(COMMON_ID_PATH)
    public ResponseEntity<JobDelayResponse> updateById(@PathVariable Long id, @RequestBody @Valid JobDelayRequest request) {
        return ResponseEntity.ok(jobDelayHandler.updateById(id, request));
    }

    @Operation(summary = SWAGGER_DELETE_JOB_DELAY_BY_ID_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_JOB_DELAY_DELETED_SUCCESSFULLY,
                    content = @Content(schema = @Schema(implementation = JobDelayResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_NOT_FOUND, description = SWAGGER_JOB_DELAY_WITH_ID_NOT_FOUND,
                    content = @Content(schema = @Schema(implementation = ExceptionResponse.class)))
    })
    @Override
    @DeleteMapping(COMMON_ID_PATH)
    public ResponseEntity<JobDelayResponse> deleteById(@PathVariable Long id) {
        return ResponseEntity.ok(jobDelayHandler.deleteById(id));
    }
}
