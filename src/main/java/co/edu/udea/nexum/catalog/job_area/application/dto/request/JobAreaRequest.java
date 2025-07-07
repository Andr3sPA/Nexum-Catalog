package co.edu.udea.nexum.catalog.job_area.application.dto.request;

import co.edu.udea.nexum.catalog.common.application.dto.request.BaseRequest;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

import static co.edu.udea.nexum.catalog.job_area.application.utils.constants.JobAreaAppConstants.*;

@Data
@Builder
public class JobAreaRequest implements BaseRequest {

    @NotBlank(message = JOB_AREA_NAME_NOT_BLANK)
    @Size(max = MAX_NAME_LENGTH, message = JOB_AREA_NAME_TOO_LONG)
    private String name;

    @Size(max = MAX_DESCRIPTION_LENGTH, message = JOB_AREA_DESCRIPTION_TOO_LONG)
    private String description;

    @NotNull(message = JOB_AREA_PROGRAM_ID_NOT_NULL)
    private Long programId;
}
