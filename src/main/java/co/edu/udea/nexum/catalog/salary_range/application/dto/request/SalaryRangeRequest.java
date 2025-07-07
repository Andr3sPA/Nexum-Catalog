package co.edu.udea.nexum.catalog.salary_range.application.dto.request;

import co.edu.udea.nexum.catalog.common.application.dto.request.BaseRequest;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Builder;
import lombok.Data;

import static co.edu.udea.nexum.catalog.salary_range.application.utils.constants.SalaryRangeAppConstants.*;

@Data
@Builder
public class SalaryRangeRequest implements BaseRequest {

    @NotNull(message = NOT_NULL_SALARY_MESSAGE)
    private String salary;

    @PositiveOrZero(message = NON_NEGATIVE_ORDER_MESSAGE)
    private Integer order;

    @NotNull(message = NOT_NULL_ACTIVE_MESSAGE)
    private Boolean active;
}
