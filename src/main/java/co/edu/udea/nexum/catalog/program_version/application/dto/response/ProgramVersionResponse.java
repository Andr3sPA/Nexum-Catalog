package co.edu.udea.nexum.catalog.program_version.application.dto.response;

import co.edu.udea.nexum.catalog.common.application.dto.response.BaseResponse;
import co.edu.udea.nexum.catalog.program.application.dto.response.ProgramResponse;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProgramVersionResponse implements BaseResponse {
    private Long id;
    private ProgramResponse program;
    private Short version;
    private Integer startYear;
    private Integer endYear;
}
