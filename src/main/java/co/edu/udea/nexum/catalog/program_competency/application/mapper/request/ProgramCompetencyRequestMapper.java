package co.edu.udea.nexum.catalog.program_competency.application.mapper.request;

import co.edu.udea.nexum.catalog.common.application.mapper.BaseRequestMapper;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.program.domain.model.Program;
import co.edu.udea.nexum.catalog.program_competency.application.dto.request.ProgramCompetencyRequest;
import co.edu.udea.nexum.catalog.program_competency.domain.model.ProgramCompetency;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProgramCompetencyRequestMapper extends BaseRequestMapper<ProgramCompetency, ProgramCompetencyRequest> {

    default Program mapProgram(Long programId) {
        return Program.builder().id(programId).build();
    }

    @Mapping(source = "programId", target = "program")
    ProgramCompetency toDomain(ProgramCompetencyRequest request);
}
