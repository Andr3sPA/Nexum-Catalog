package co.edu.udea.nexum.catalog.program_competency.application.dto.request;

import co.edu.udea.nexum.catalog.common.application.dto.request.BaseRequest;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

import static co.edu.udea.nexum.catalog.program_competency.application.utils.constants.ProgramCompetencyAppConstants.*;

@Data
@Builder
public class ProgramCompetencyRequest implements BaseRequest {

    @NotBlank(message = PROGRAM_COMPETENCY_NAME_NOT_BLANK)
    @Size(max = MAX_NAME_LENGTH, message = PROGRAM_COMPETENCY_NAME_TOO_LONG)
    private String name;

    @Size(max = MAX_DESCRIPTION_LENGTH, message = PROGRAM_COMPETENCY_DESCRIPTION_TOO_LONG)
    private String description;

    @NotNull(message = PROGRAM_COMPETENCY_PROGRAM_ID_NOT_NULL)
    private Long programId;
}
