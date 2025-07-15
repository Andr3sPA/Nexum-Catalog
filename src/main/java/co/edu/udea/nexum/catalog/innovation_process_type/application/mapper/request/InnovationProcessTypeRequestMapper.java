package co.edu.udea.nexum.catalog.innovation_process_type.application.mapper.request;

import co.edu.udea.nexum.catalog.common.application.mapper.BaseRequestMapper;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.innovation_process_type.application.dto.request.InnovationProcessTypeRequest;
import co.edu.udea.nexum.catalog.innovation_process_type.domain.model.InnovationProcessType;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(
    componentModel = "spring",
    unmappedSourcePolicy = ReportingPolicy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface InnovationProcessTypeRequestMapper extends BaseRequestMapper<InnovationProcessType, InnovationProcessTypeRequest> {
}
