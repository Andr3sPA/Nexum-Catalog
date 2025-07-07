package co.edu.udea.nexum.catalog.program.application.dto.request;

import co.edu.udea.nexum.catalog.common.application.dto.request.BaseRequest;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import static co.edu.udea.nexum.catalog.program.application.utils.constants.ProgramAppConstants.NOT_NULL_NAME_FIELD_MESSAGE;
import static co.edu.udea.nexum.catalog.program.application.utils.constants.ProgramAppConstants.NOT_NULL_SNIES_CODE_FIELD_MESSAGE;

@Data
@Builder
public class ProgramRequest implements BaseRequest {
    @NotNull(message = NOT_NULL_NAME_FIELD_MESSAGE)
    private String name;
    @NotNull(message =NOT_NULL_SNIES_CODE_FIELD_MESSAGE)
    private String code;
}
