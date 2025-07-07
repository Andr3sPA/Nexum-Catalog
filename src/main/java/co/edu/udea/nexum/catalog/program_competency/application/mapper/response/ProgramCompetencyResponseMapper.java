package co.edu.udea.nexum.catalog.program_competency.application.mapper.response;

import co.edu.udea.nexum.catalog.common.application.mapper.BaseResponseMapper;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.program_competency.application.dto.response.ProgramCompetencyResponse;
import co.edu.udea.nexum.catalog.program_competency.domain.model.ProgramCompetency;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProgramCompetencyResponseMapper extends BaseResponseMapper<ProgramCompetency, ProgramCompetencyResponse> {
}
