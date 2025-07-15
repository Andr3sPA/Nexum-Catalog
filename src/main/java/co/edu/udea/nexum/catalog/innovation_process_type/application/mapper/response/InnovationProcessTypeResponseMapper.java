package co.edu.udea.nexum.catalog.innovation_process_type.application.mapper.response;

import co.edu.udea.nexum.catalog.common.application.mapper.BaseResponseMapper;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.innovation_process_type.application.dto.response.InnovationProcessTypeResponse;
import co.edu.udea.nexum.catalog.innovation_process_type.domain.model.InnovationProcessType;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(
    componentModel = "spring",
    unmappedSourcePolicy = ReportingPolicy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface InnovationProcessTypeResponseMapper extends BaseResponseMapper<InnovationProcessType, InnovationProcessTypeResponse> {
}
