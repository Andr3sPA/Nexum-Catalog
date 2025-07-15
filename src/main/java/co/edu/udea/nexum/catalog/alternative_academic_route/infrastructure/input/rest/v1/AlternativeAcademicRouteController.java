package co.edu.udea.nexum.catalog.alternative_academic_route.infrastructure.input.rest.v1;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.configuration.advisor.dto.ExceptionResponse;
import co.edu.udea.nexum.catalog.common.infrastructure.configuration.advisor.dto.ValidationExceptionResponse;
import co.edu.udea.nexum.catalog.common.infrastructure.input.rest.BaseCrudController;
import co.edu.udea.nexum.catalog.alternative_academic_route.application.dto.request.AlternativeAcademicRouteRequest;
import co.edu.udea.nexum.catalog.alternative_academic_route.application.dto.response.AlternativeAcademicRouteResponse;
import co.edu.udea.nexum.catalog.alternative_academic_route.application.handler.AlternativeAcademicRouteHandler;
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
import static co.edu.udea.nexum.catalog.alternative_academic_route.infrastructure.utils.constants.AlternativeAcademicRouteRestConstants.*;

@Generated
@RestController
@RequiredArgsConstructor
@RequestMapping(value = ALTERNATIVE_ACADEMIC_ROUTE_CONTROLLER_PATH)
@Tag(name = ALTERNATIVE_ACADEMIC_ROUTE_CONTROLLER_NAME, description = ALTERNATIVE_ACADEMIC_ROUTE_CONTROLLER_DESCRIPTION)
public class AlternativeAcademicRouteController implements BaseCrudController<Long, AlternativeAcademicRouteResponse, AlternativeAcademicRouteRequest> {

    private final AlternativeAcademicRouteHandler handler;

    @Operation(summary = SWAGGER_SAVE_NEW_ALTERNATIVE_ACADEMIC_ROUTE_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_CREATED, description = SWAGGER_NEW_ALTERNATIVE_ACADEMIC_ROUTE_SAVED_SUCCESSFULLY,
                    content = @Content(schema = @Schema(implementation = AlternativeAcademicRouteResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_BAD_REQUEST, description = SWAGGER_ERROR_VALIDATIONS_DO_NOT_PASS,
                    content = @Content(schema = @Schema(implementation = ValidationExceptionResponse.class)))
    })
    @PostMapping
    @Override
    public ResponseEntity<AlternativeAcademicRouteResponse> save(@RequestBody @Valid AlternativeAcademicRouteRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(handler.save(request));
    }

    @Operation(summary = SWAGGER_FIND_ALTERNATIVE_ACADEMIC_ROUTE_BY_ID_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_ALTERNATIVE_ACADEMIC_ROUTE_FOUND,
                    content = @Content(schema = @Schema(implementation = AlternativeAcademicRouteResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_NOT_FOUND, description = SWAGGER_ALTERNATIVE_ACADEMIC_ROUTE_WITH_ID_NOT_FOUND,
                    content = @Content(schema = @Schema(implementation = ExceptionResponse.class)))
    })
    @GetMapping(COMMON_ID_PATH)
    @Override
    public ResponseEntity<AlternativeAcademicRouteResponse> findById(@PathVariable Long id) {
        return ResponseEntity.ok(handler.findById(id));
    }

    @Operation(summary = SWAGGER_FIND_ALL_ALTERNATIVE_ACADEMIC_ROUTES_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_FIND_ALL_ALTERNATIVE_ACADEMIC_ROUTES_SUCCESSFULLY,
                    content = @Content(array = @ArraySchema(schema = @Schema(implementation = AlternativeAcademicRouteResponse.class))))
    })
    @GetMapping
    @Override
    public ResponseEntity<List<AlternativeAcademicRouteResponse>> findAll() {
        return ResponseEntity.ok(handler.findAll());
    }

    @Operation(summary = SWAGGER_UPDATE_ALTERNATIVE_ACADEMIC_ROUTE_BY_ID_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_ALTERNATIVE_ACADEMIC_ROUTE_UPDATED_SUCCESSFULLY,
                    content = @Content(schema = @Schema(implementation = AlternativeAcademicRouteResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_NOT_FOUND, description = SWAGGER_ALTERNATIVE_ACADEMIC_ROUTE_WITH_ID_NOT_FOUND,
                    content = @Content(schema = @Schema(implementation = ExceptionResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_BAD_REQUEST, description = SWAGGER_ERROR_VALIDATIONS_DO_NOT_PASS,
                    content = @Content(schema = @Schema(implementation = ValidationExceptionResponse.class)))
    })
    @PutMapping(COMMON_ID_PATH)
    @Override
    public ResponseEntity<AlternativeAcademicRouteResponse> updateById(@PathVariable Long id, @RequestBody @Valid AlternativeAcademicRouteRequest request) {
        return ResponseEntity.ok(handler.updateById(id, request));
    }

    @Operation(summary = SWAGGER_DELETE_ALTERNATIVE_ACADEMIC_ROUTE_BY_ID_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_ALTERNATIVE_ACADEMIC_ROUTE_DELETED_SUCCESSFULLY,
                    content = @Content(schema = @Schema(implementation = AlternativeAcademicRouteResponse.class))),
            @ApiResponse(responseCode = SWAGGER_CODE_NOT_FOUND, description = SWAGGER_ALTERNATIVE_ACADEMIC_ROUTE_WITH_ID_NOT_FOUND,
                    content = @Content(schema = @Schema(implementation = ExceptionResponse.class)))
    })
    @DeleteMapping(COMMON_ID_PATH)
    @Override
    public ResponseEntity<AlternativeAcademicRouteResponse> deleteById(@PathVariable Long id) {
        return ResponseEntity.ok(handler.deleteById(id));
    }

    @Operation(summary = SWAGGER_FIND_ALL_BY_ENABLED_SUMMARY)
    @ApiResponse(responseCode = SWAGGER_CODE_OK, description = SWAGGER_FIND_ALL_BY_ENABLED_SUCCESSFULLY,
            content = @Content(array = @ArraySchema(schema = @Schema(implementation = AlternativeAcademicRouteResponse.class))))
    @GetMapping(ENABLED_PATH)
    public ResponseEntity<List<AlternativeAcademicRouteResponse>> findAllByEnabled(@RequestParam boolean enabled) {
        return ResponseEntity.ok(handler.findAllByEnabled(enabled));
    }
}
