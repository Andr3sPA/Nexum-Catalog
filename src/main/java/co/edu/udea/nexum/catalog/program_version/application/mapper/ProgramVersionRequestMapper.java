package co.edu.udea.nexum.catalog.program_version.application.mapper;

import co.edu.udea.nexum.catalog.common.application.mapper.BaseRequestMapper;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.program.domain.model.Program;
import co.edu.udea.nexum.catalog.program_version.application.dto.request.ProgramVersionRequest;
import co.edu.udea.nexum.catalog.program_version.domain.model.ProgramVersion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProgramVersionRequestMapper extends BaseRequestMapper<ProgramVersion, ProgramVersionRequest> {
    default Program program(Long programId) {
        return Program.builder().id(programId).build();
    }

    @Mapping(source = "programId", target = "program")
    ProgramVersion toDomain(ProgramVersionRequest entity);
}
