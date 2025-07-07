package co.edu.udea.nexum.catalog.salary_range.infrastructure.input.rest.v1;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.configuration.advisor.dto.ExceptionResponse;
import co.edu.udea.nexum.catalog.common.infrastructure.configuration.advisor.dto.ValidationExceptionResponse;
import co.edu.udea.nexum.catalog.common.infrastructure.input.rest.BaseCrudController;
import co.edu.udea.nexum.catalog.salary_range.application.dto.request.SalaryRangeRequest;
import co.edu.udea.nexum.catalog.salary_range.application.dto.response.SalaryRangeResponse;
import co.edu.udea.nexum.catalog.salary_range.application.handler.SalaryRangeHandler;
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
import static co.edu.udea.nexum.catalog.salary_range.infrastructure.utils.constants.SalaryRangeRestConstants.*;

@Generated
@RestController
@RequiredArgsConstructor
@RequestMapping(value = SALARY_RANGE_CONTROLLER_PATH)
@Tag(name = SALARY_RANGE_CONTROLLER_NAME, description = SALARY_RANGE_CONTROLLER_DESCRIPTION)
public class SalaryRangeController implements BaseCrudController<Long, SalaryRangeResponse, SalaryRangeRequest> {

    private final SalaryRangeHandler salaryRangeHandler;

    @Operation(summary = SWAGGER_SAVE_NEW_SALARY_RANGE_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_CREATED, description = SWAGGER_NEW_SALARY_RANGE_SAVED_SUCCESSFULLY, content = @Content(schema = @Schema(implementation = SalaryRangeResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_BAD_REQUEST, description = SWAGGER_ERROR_VALIDATIONS_DO_NOT_PASS, content = @Content(schema = @Schema(implementation = ValidationExceptionResponse.class)))
    })
    @Override
    @PostMapping
    public ResponseEntity<SalaryRangeResponse> save(@RequestBody @Valid SalaryRangeRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(salaryRangeHandler.save(request));
    }

    @Operation(summary = SWAGGER_FIND_SALARY_RANGE_BY_ID_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_SALARY_RANGE_FOUND, content = @Content(schema = @Schema(implementation = SalaryRangeResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_NOT_FOUND, description = SWAGGER_SALARY_RANGE_WITH_ID_NOT_FOUND, content = @Content(schema = @Schema(implementation = ExceptionResponse.class)))
    })
    @Override
    @GetMapping(COMMON_ID_PATH)
    public ResponseEntity<SalaryRangeResponse> findById(@PathVariable Long id) {
        return ResponseEntity.ok(salaryRangeHandler.findById(id));
    }

    @Operation(summary = SWAGGER_FIND_ALL_SALARY_RANGES_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_FIND_ALL_SALARY_RANGES_SUCCESSFULLY, content = @Content(array = @ArraySchema(schema = @Schema(implementation = SalaryRangeResponse.class))))
    })
    @Override
    @GetMapping
    public ResponseEntity<List<SalaryRangeResponse>> findAll() {
        return ResponseEntity.ok(salaryRangeHandler.findAll());
    }

    @Operation(summary = SWAGGER_UPDATE_SALARY_RANGE_BY_ID_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_SALARY_RANGE_UPDATED_SUCCESSFULLY, content = @Content(schema = @Schema(implementation = SalaryRangeResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_NOT_FOUND, description = SWAGGER_SALARY_RANGE_WITH_ID_NOT_FOUND, content = @Content(schema = @Schema(implementation = ExceptionResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_BAD_REQUEST, description = SWAGGER_ERROR_VALIDATIONS_DO_NOT_PASS, content = @Content(schema = @Schema(implementation = ValidationExceptionResponse.class)))
    })
    @Override
    @PutMapping(COMMON_ID_PATH)
    public ResponseEntity<SalaryRangeResponse> updateById(@PathVariable Long id, @RequestBody @Valid SalaryRangeRequest request) {
        return ResponseEntity.ok(salaryRangeHandler.updateById(id, request));
    }

    @Operation(summary = SWAGGER_DELETE_SALARY_RANGE_BY_ID_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_SALARY_RANGE_DELETED_SUCCESSFULLY, content = @Content(schema = @Schema(implementation = SalaryRangeResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_NOT_FOUND, description = SWAGGER_SALARY_RANGE_WITH_ID_NOT_FOUND, content = @Content(schema = @Schema(implementation = ExceptionResponse.class)))
    })
    @Override
    @DeleteMapping(COMMON_ID_PATH)
    public ResponseEntity<SalaryRangeResponse> deleteById(@PathVariable Long id) {
        return ResponseEntity.ok(salaryRangeHandler.deleteById(id));
    }
}
