package co.edu.udea.nexum.catalog.program.application.mapper;

import co.edu.udea.nexum.catalog.common.application.mapper.BaseRequestMapper;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.program.application.dto.request.ProgramRequest;
import co.edu.udea.nexum.catalog.program.domain.model.Program;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProgramRequestMapper extends BaseRequestMapper<Program, ProgramRequest> {
}
