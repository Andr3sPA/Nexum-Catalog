package co.edu.udea.nexum.catalog.job_institution_type.infrastructure.input.rest.v1;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.configuration.advisor.dto.ExceptionResponse;
import co.edu.udea.nexum.catalog.common.infrastructure.configuration.advisor.dto.ValidationExceptionResponse;
import co.edu.udea.nexum.catalog.common.infrastructure.input.rest.BaseCrudController;
import co.edu.udea.nexum.catalog.job_institution_type.application.dto.request.JobInstitutionTypeRequest;
import co.edu.udea.nexum.catalog.job_institution_type.application.dto.response.JobInstitutionTypeResponse;
import co.edu.udea.nexum.catalog.job_institution_type.application.handler.JobInstitutionTypeHandler;
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
import static co.edu.udea.nexum.catalog.job_institution_type.infrastructure.utils.constants.JobInstitutionTypeRestConstants.*;

@Generated
@RestController
@RequiredArgsConstructor
@RequestMapping(value = JOB_INSTITUTION_TYPE_CONTROLLER_PATH)
@Tag(name = JOB_INSTITUTION_TYPE_CONTROLLER_NAME, description = JOB_INSTITUTION_TYPE_CONTROLLER_DESCRIPTION)
public class JobInstitutionTypeController implements BaseCrudController<Long, JobInstitutionTypeResponse, JobInstitutionTypeRequest> {

    private final JobInstitutionTypeHandler jobInstitutionTypeHandler;

    @Operation(summary = SWAGGER_SAVE_NEW_JOB_INSTITUTION_TYPE_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_CREATED, description = SWAGGER_NEW_JOB_INSTITUTION_TYPE_SAVED_SUCCESSFULLY,
                    content = @Content(schema = @Schema(implementation = JobInstitutionTypeResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_BAD_REQUEST, description = SWAGGER_ERROR_VALIDATIONS_DO_NOT_PASS,
                    content = @Content(schema = @Schema(implementation = ValidationExceptionResponse.class)))
    })
    @PostMapping
    @Override
    public ResponseEntity<JobInstitutionTypeResponse> save(@RequestBody @Valid JobInstitutionTypeRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(jobInstitutionTypeHandler.save(request));
    }

    @Operation(summary = SWAGGER_FIND_JOB_INSTITUTION_TYPE_BY_ID_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_JOB_INSTITUTION_TYPE_FOUND,
                    content = @Content(schema = @Schema(implementation = JobInstitutionTypeResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_NOT_FOUND, description = SWAGGER_JOB_INSTITUTION_TYPE_WITH_ID_NOT_FOUND,
                    content = @Content(schema = @Schema(implementation = ExceptionResponse.class)))
    })
    @GetMapping(COMMON_ID_PATH)
    @Override
    public ResponseEntity<JobInstitutionTypeResponse> findById(@PathVariable Long id) {
        return ResponseEntity.ok(jobInstitutionTypeHandler.findById(id));
    }

    @Operation(summary = SWAGGER_FIND_ALL_JOB_INSTITUTION_TYPES_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_FIND_ALL_JOB_INSTITUTION_TYPES_SUCCESSFULLY,
                    content = @Content(array = @ArraySchema(schema = @Schema(implementation = JobInstitutionTypeResponse.class))))
    })
    @GetMapping
    @Override
    public ResponseEntity<List<JobInstitutionTypeResponse>> findAll() {
        return ResponseEntity.ok(jobInstitutionTypeHandler.findAll());
    }

    @Operation(summary = SWAGGER_UPDATE_JOB_INSTITUTION_TYPE_BY_ID_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_JOB_INSTITUTION_TYPE_UPDATED_SUCCESSFULLY,
                    content = @Content(schema = @Schema(implementation = JobInstitutionTypeResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_NOT_FOUND, description = SWAGGER_JOB_INSTITUTION_TYPE_WITH_ID_NOT_FOUND,
                    content = @Content(schema = @Schema(implementation = ExceptionResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_BAD_REQUEST, description = SWAGGER_ERROR_VALIDATIONS_DO_NOT_PASS,
                    content = @Content(schema = @Schema(implementation = ValidationExceptionResponse.class)))
    })
    @PutMapping(COMMON_ID_PATH)
    @Override
    public ResponseEntity<JobInstitutionTypeResponse> updateById(@PathVariable Long id, @RequestBody @Valid JobInstitutionTypeRequest request) {
        return ResponseEntity.ok(jobInstitutionTypeHandler.updateById(id, request));
    }

    @Operation(summary = SWAGGER_DELETE_JOB_INSTITUTION_TYPE_BY_ID_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_JOB_INSTITUTION_TYPE_DELETED_SUCCESSFULLY,
                    content = @Content(schema = @Schema(implementation = JobInstitutionTypeResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_NOT_FOUND, description = SWAGGER_JOB_INSTITUTION_TYPE_WITH_ID_NOT_FOUND,
                    content = @Content(schema = @Schema(implementation = ExceptionResponse.class)))
    })
    @DeleteMapping(COMMON_ID_PATH)
    @Override
    public ResponseEntity<JobInstitutionTypeResponse> deleteById(@PathVariable Long id) {
        return ResponseEntity.ok(jobInstitutionTypeHandler.deleteById(id));
    }

    @Operation(summary = SWAGGER_FIND_ALL_BY_PROGRAM_ID_SUMMARY)
    @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_FIND_ALL_BY_PROGRAM_ID_SUCCESSFULLY,
            content = @Content(array = @ArraySchema(schema = @Schema(implementation = JobInstitutionTypeResponse.class))))
    @GetMapping(PROGRAM_PROGRAM_ID)
    public ResponseEntity<List<JobInstitutionTypeResponse>> findAllByProgramId(@PathVariable Long programId) {
        return ResponseEntity.ok(jobInstitutionTypeHandler.findAllByProgramId(programId));
    }
}
