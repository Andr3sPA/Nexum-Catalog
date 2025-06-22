package co.edu.udea.nexum.catalog.program_version.application.dto.request;

import co.edu.udea.nexum.catalog.common.application.dto.request.BaseRequest;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Builder;
import lombok.Data;

import static co.edu.udea.nexum.catalog.program_version.application.utils.constants.ProgramVersionAppConstants.*;

@Data
@Builder
public class ProgramVersionRequest implements BaseRequest {
    @NotNull(message = PROGRAM_ID_FIELD_MUST_NOT_BE_NULL_MESSAGE)
    private Long programId;
    @NotNull(message = PROGRAM_VERSION_FIELD_MUST_NOT_BE_NULL_MESSAGE)
    @Min(value = MIN_VERSION_VALUE_MESSAGE, message = PROGRAM_VERSION_MIN_VALUE_MESSAGE)
    private Short version;
    @NotNull(message = PROGRAM_VERSION_START_YEAR_MUST_NOT_BE_NULL_MESSAGE)
    @Positive(message = PROGRAM_VERSION_YEAR_MUST_BE_POSITIVE_MESSAGE)
    private Integer startYear;
    @Positive(message = PROGRAM_VERSION_YEAR_MUST_BE_POSITIVE_MESSAGE)
    private Integer endYear;
}
