package co.edu.udea.nexum.catalog.innovation_process_type.infrastructure.output.jpa.mapper;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.mapper.BaseEntityMapper;
import co.edu.udea.nexum.catalog.innovation_process_type.domain.model.InnovationProcessType;
import co.edu.udea.nexum.catalog.innovation_process_type.infrastructure.output.jpa.entity.InnovationProcessTypeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(
    componentModel = "spring",
    unmappedSourcePolicy = ReportingPolicy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface InnovationProcessTypeEntityMapper extends BaseEntityMapper<InnovationProcessType, InnovationProcessTypeEntity> {
}
