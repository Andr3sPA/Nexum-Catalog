package co.edu.udea.nexum.catalog.innovation_process_type.application.dto.request;

import co.edu.udea.nexum.catalog.common.application.dto.request.BaseRequest;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import static co.edu.udea.nexum.catalog.innovation_process_type.application.utils.constants.InnovationProcessTypeAppConstants.*;

@Data
@Builder
public class InnovationProcessTypeRequest implements BaseRequest {

    @NotBlank(message = IPT_NAME_NOT_BLANK)
    @Size(max = MAX_NAME_LENGTH, message = IPT_NAME_TOO_LONG)
    private String name;

    @Size(max = MAX_DESCRIPTION_LENGTH, message = IPT_DESCRIPTION_TOO_LONG)
    private String description;

    @NotNull(message = IPT_ENABLED_NOT_NULL)
    private Boolean enabled;
}
