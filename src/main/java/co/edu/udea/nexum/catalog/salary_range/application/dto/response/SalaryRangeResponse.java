package co.edu.udea.nexum.catalog.salary_range.application.dto.response;

import co.edu.udea.nexum.catalog.common.application.dto.response.BaseResponse;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class SalaryRangeResponse implements BaseResponse {
    private Long id;
    private String salary;
    private Integer order;
    private Boolean active;
    private LocalDateTime creationDate;
    private LocalDateTime lastUpdate;
}
