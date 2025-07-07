package co.edu.udea.nexum.catalog.program_competency.application.dto.response;

import co.edu.udea.nexum.catalog.common.application.dto.response.BaseResponse;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProgramCompetencyResponse implements BaseResponse {
    private Long id;
    private String name;
    private String description;
}
