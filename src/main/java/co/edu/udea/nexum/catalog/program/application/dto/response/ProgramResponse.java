package co.edu.udea.nexum.catalog.program.application.dto.response;

import co.edu.udea.nexum.catalog.common.application.dto.response.BaseResponse;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProgramResponse implements BaseResponse {
    private Long id;
    private String name;
    private String sniesCode;
}
