package co.edu.udea.nexum.catalog.salary_range.application.mapper.request;

import co.edu.udea.nexum.catalog.common.application.mapper.BaseRequestMapper;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.salary_range.application.dto.request.SalaryRangeRequest;
import co.edu.udea.nexum.catalog.salary_range.domain.model.SalaryRange;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SalaryRangeRequestMapper extends BaseRequestMapper<SalaryRange, SalaryRangeRequest> {
}
