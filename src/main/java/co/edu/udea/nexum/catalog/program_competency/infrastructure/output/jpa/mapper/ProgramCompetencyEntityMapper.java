package co.edu.udea.nexum.catalog.program_competency.infrastructure.output.jpa.mapper;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.mapper.BaseEntityMapper;
import co.edu.udea.nexum.catalog.program_competency.domain.model.ProgramCompetency;
import co.edu.udea.nexum.catalog.program_competency.infrastructure.output.jpa.entity.ProgramCompetencyEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(
    componentModel = "spring",
    unmappedSourcePolicy = ReportingPolicy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface ProgramCompetencyEntityMapper extends BaseEntityMapper<ProgramCompetency, ProgramCompetencyEntity> {
}
