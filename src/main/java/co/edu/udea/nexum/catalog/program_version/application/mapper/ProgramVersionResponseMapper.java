package co.edu.udea.nexum.catalog.program_version.application.mapper;

import co.edu.udea.nexum.catalog.common.application.mapper.BaseResponseMapper;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.program.domain.model.Program;
import co.edu.udea.nexum.catalog.program_version.application.dto.response.ProgramVersionResponse;
import co.edu.udea.nexum.catalog.program_version.domain.model.ProgramVersion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProgramVersionResponseMapper extends BaseResponseMapper<ProgramVersion, ProgramVersionResponse> {
}
