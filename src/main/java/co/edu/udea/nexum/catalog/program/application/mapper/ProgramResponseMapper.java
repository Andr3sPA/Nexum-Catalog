package co.edu.udea.nexum.catalog.program.application.mapper;

import co.edu.udea.nexum.catalog.common.application.mapper.BaseResponseMapper;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.program.application.dto.response.ProgramResponse;
import co.edu.udea.nexum.catalog.program.domain.model.Program;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProgramResponseMapper extends BaseResponseMapper<Program, ProgramResponse> {
}
