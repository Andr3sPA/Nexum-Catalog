package co.edu.udea.nexum.catalog.identity_document_type.infrastructure.input.rest.v1;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.configuration.advisor.dto.ExceptionResponse;
import co.edu.udea.nexum.catalog.identity_document_type.application.dto.response.IdentityDocumentTypeResponse;
import co.edu.udea.nexum.catalog.identity_document_type.application.handler.IdentityDocumentTypeHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.security.PermitAll;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static co.edu.udea.nexum.catalog.common.infrastructure.utils.constants.CommonRestConstants.*;
import static co.edu.udea.nexum.catalog.identity_document_type.infrastructure.utils.constants.IdentityDocumentTypeRestConstants.*;

@Generated
@RestController
@RequiredArgsConstructor
@RequestMapping(value = IDENTITY_DOCUMENT_TYPE_CONTROLLER_PATH)
@Tag(name = IDENTITY_DOCUMENT_TYPE_CONTROLLER_NAME, description = IDENTITY_DOCUMENT_TYPE_CONTROLLER_DESCRIPTION)
public class IdentityDocumentTypeController {
    private final IdentityDocumentTypeHandler identityDocumentTypeHandler;

    @Operation(summary = SWAGGER_FIND_IDENTITY_DOCUMENT_TYPE_BY_ID_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = SWAGGER_CODE_OK,
                    description = SWAGGER_IDENTITY_DOCUMENT_TYPE_FOUND,
                    content = @Content(schema = @Schema(implementation = IdentityDocumentTypeResponse.class))
            ),
            @ApiResponse(
                    responseCode = SWAGGER_CODE_NOT_FOUND,
                    description = SWAGGER_IDENTITY_DOCUMENT_TYPE_WITH_ID_NOT_FOUND,
                    content = @Content(schema = @Schema(implementation = ExceptionResponse.class))
            ),
    })
    @GetMapping(COMMON_ID_PATH)
    @PermitAll
    public ResponseEntity<IdentityDocumentTypeResponse> findById(@PathVariable Long id) {
        return ResponseEntity.ok(identityDocumentTypeHandler.findById(id));
    }

    @Operation(summary = SWAGGER_FIND_ALL_IDENTITY_DOCUMENT_TYPES_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = SWAGGER_CODE_OK,
                    description = SWAGGER_FIND_ALL_IDENTITY_DOCUMENT_TYPES_SUCCESSFULLY,
                    content = @Content(array = @ArraySchema(schema = @Schema(implementation = IdentityDocumentTypeResponse.class)))
            ),
    })
    @GetMapping
    public ResponseEntity<List<IdentityDocumentTypeResponse>> findAll() {
        return ResponseEntity.ok(identityDocumentTypeHandler.findAll());
    }
}
