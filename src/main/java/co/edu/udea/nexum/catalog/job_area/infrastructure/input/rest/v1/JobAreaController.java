package co.edu.udea.nexum.catalog.job_area.infrastructure.input.rest.v1;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.configuration.advisor.dto.ExceptionResponse;
import co.edu.udea.nexum.catalog.common.infrastructure.configuration.advisor.dto.ValidationExceptionResponse;
import co.edu.udea.nexum.catalog.common.infrastructure.input.rest.BaseCrudController;
import co.edu.udea.nexum.catalog.job_area.application.dto.request.JobAreaRequest;
import co.edu.udea.nexum.catalog.job_area.application.dto.response.JobAreaResponse;
import co.edu.udea.nexum.catalog.job_area.application.handler.JobAreaHandler;
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
import static co.edu.udea.nexum.catalog.job_area.infrastructure.utils.constants.JobAreaRestConstants.*;

@Generated
@RestController
@RequiredArgsConstructor
@RequestMapping(value = JOB_AREA_CONTROLLER_PATH)
@Tag(name = JOB_AREA_CONTROLLER_NAME, description = JOB_AREA_CONTROLLER_DESCRIPTION)
public class JobAreaController implements BaseCrudController<Long, JobAreaResponse, JobAreaRequest> {
    private final JobAreaHandler jobAreaHandler;

    @Operation(summary = SWAGGER_SAVE_NEW_JOB_AREA_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_CREATED, description = SWAGGER_NEW_JOB_AREA_SAVED_SUCCESSFULLY,
                    content = @Content(schema = @Schema(implementation = JobAreaResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_BAD_REQUEST, description = SWAGGER_ERROR_VALIDATIONS_DO_NOT_PASS,
                    content = @Content(schema = @Schema(implementation = ValidationExceptionResponse.class)))
    })
    @PostMapping
    @Override
    public ResponseEntity<JobAreaResponse> save(@RequestBody @Valid JobAreaRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(jobAreaHandler.save(request));
    }

    @Operation(summary = SWAGGER_FIND_JOB_AREA_BY_ID_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_JOB_AREA_FOUND,
                    content = @Content(schema = @Schema(implementation = JobAreaResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_NOT_FOUND, description = SWAGGER_JOB_AREA_WITH_ID_NOT_FOUND,
                    content = @Content(schema = @Schema(implementation = ExceptionResponse.class)))
    })
    @GetMapping(COMMON_ID_PATH)
    @Override
    public ResponseEntity<JobAreaResponse> findById(@PathVariable Long id) {
        return ResponseEntity.ok(jobAreaHandler.findById(id));
    }

    @Operation(summary = SWAGGER_FIND_ALL_JOB_AREAS_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_FIND_ALL_JOB_AREAS_SUCCESSFULLY,
                    content = @Content(array = @ArraySchema(schema = @Schema(implementation = JobAreaResponse.class))))
    })
    @GetMapping
    @Override
    public ResponseEntity<List<JobAreaResponse>> findAll() {
        return ResponseEntity.ok(jobAreaHandler.findAll());
    }

    @Operation(summary = SWAGGER_UPDATE_JOB_AREA_BY_ID_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_JOB_AREA_UPDATED_SUCCESSFULLY,
                    content = @Content(schema = @Schema(implementation = JobAreaResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_NOT_FOUND, description = SWAGGER_JOB_AREA_WITH_ID_NOT_FOUND,
                    content = @Content(schema = @Schema(implementation = ExceptionResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_BAD_REQUEST, description = SWAGGER_ERROR_VALIDATIONS_DO_NOT_PASS,
                    content = @Content(schema = @Schema(implementation = ValidationExceptionResponse.class)))
    })
    @PutMapping(COMMON_ID_PATH)
    @Override
    public ResponseEntity<JobAreaResponse> updateById(@PathVariable Long id, @RequestBody @Valid JobAreaRequest request) {
        return ResponseEntity.ok(jobAreaHandler.updateById(id, request));
    }

    @Operation(summary = SWAGGER_DELETE_JOB_AREA_BY_ID_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_JOB_AREA_DELETED_SUCCESSFULLY,
                    content = @Content(schema = @Schema(implementation = JobAreaResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_NOT_FOUND, description = SWAGGER_JOB_AREA_WITH_ID_NOT_FOUND,
                    content = @Content(schema = @Schema(implementation = ExceptionResponse.class)))
    })
    @DeleteMapping(COMMON_ID_PATH)
    @Override
    public ResponseEntity<JobAreaResponse> deleteById(@PathVariable Long id) {
        return ResponseEntity.ok(jobAreaHandler.deleteById(id));
    }

    @Operation(summary = SWAGGER_FIND_ALL_BY_PROGRAM_ID_SUMMARY)
    @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_FIND_ALL_BY_PROGRAM_ID_SUCCESSFULLY,
            content = @Content(array = @ArraySchema(schema = @Schema(implementation = JobAreaResponse.class))))
    @GetMapping(PROGRAM_PATH)
    public ResponseEntity<List<JobAreaResponse>> findAllByProgramId(@RequestParam Long programId) {
        return ResponseEntity.ok(jobAreaHandler.findAllByProgramId(programId));
    }
}
