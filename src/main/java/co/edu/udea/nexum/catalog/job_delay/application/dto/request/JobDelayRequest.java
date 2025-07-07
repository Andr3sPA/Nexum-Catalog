package co.edu.udea.nexum.catalog.job_delay.application.dto.request;

import co.edu.udea.nexum.catalog.common.application.dto.request.BaseRequest;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Builder;
import lombok.Data;

import static co.edu.udea.nexum.catalog.job_delay.application.utils.constants.JobDelayAppConstants.*;

@Data
@Builder
public class JobDelayRequest implements BaseRequest {
    
    @NotNull(message = NOT_NULL_LABEL_MESSAGE)
    private String label;

    @PositiveOrZero(message = NON_NEGATIVE_ORDER_MESSAGE)
    private Integer order;

    @NotNull(message = NOT_NULL_ACTIVE_MESSAGE)
    private Boolean active;
}
