package co.edu.udea.nexum.catalog.innovation_process_type.application.dto.response;

import co.edu.udea.nexum.catalog.common.application.dto.response.BaseResponse;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InnovationProcessTypeResponse implements BaseResponse {
    private Long id;
    private String name;
    private String description;
}
