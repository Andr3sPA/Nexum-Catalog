package co.edu.udea.nexum.catalog.alternative_academic_route.application.dto.request;

import co.edu.udea.nexum.catalog.common.application.dto.request.BaseRequest;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import static co.edu.udea.nexum.catalog.alternative_academic_route.application.utils.constants.AlternativeAcademicRouteAppConstants.*;

@Data
@Builder
public class AlternativeAcademicRouteRequest implements BaseRequest {

    @NotBlank(message = AAR_NAME_NOT_BLANK)
    @Size(max = MAX_NAME_LENGTH, message = AAR_NAME_TOO_LONG)
    private String name;

    @Size(max = MAX_DESCRIPTION_LENGTH, message = AAR_DESCRIPTION_TOO_LONG)
    private String description;

    @NotNull(message = AAR_ENABLED_NOT_NULL)
    private Boolean enabled;
}
