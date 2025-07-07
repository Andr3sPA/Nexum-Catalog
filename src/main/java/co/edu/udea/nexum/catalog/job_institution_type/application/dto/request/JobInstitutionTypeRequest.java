package co.edu.udea.nexum.catalog.job_institution_type.application.dto.request;

import co.edu.udea.nexum.catalog.common.application.dto.request.BaseRequest;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

import static co.edu.udea.nexum.catalog.job_institution_type.application.utils.constants.JobInstitutionTypeAppConstants.*;

@Data
@Builder
public class JobInstitutionTypeRequest implements BaseRequest {

    @NotBlank(message = JOB_INSTITUTION_TYPE_NAME_NOT_BLANK)
    @Size(max = MAX_NAME_LENGTH, message = JOB_INSTITUTION_TYPE_NAME_TOO_LONG)
    private String name;

    @Size(max = MAX_DESCRIPTION_LENGTH, message = JOB_INSTITUTION_TYPE_DESCRIPTION_TOO_LONG)
    private String description;

    @NotNull(message = JOB_INSTITUTION_TYPE_PROGRAM_ID_NOT_NULL)
    private Long programId;
}
