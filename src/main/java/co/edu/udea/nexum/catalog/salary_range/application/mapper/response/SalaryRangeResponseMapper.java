package co.edu.udea.nexum.catalog.salary_range.application.mapper.response;

import co.edu.udea.nexum.catalog.common.application.mapper.BaseResponseMapper;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.salary_range.application.dto.response.SalaryRangeResponse;
import co.edu.udea.nexum.catalog.salary_range.domain.model.SalaryRange;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SalaryRangeResponseMapper extends BaseResponseMapper<SalaryRange, SalaryRangeResponse> {
}
