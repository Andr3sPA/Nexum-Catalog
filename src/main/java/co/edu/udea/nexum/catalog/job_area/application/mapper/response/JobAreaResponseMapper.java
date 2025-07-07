package co.edu.udea.nexum.catalog.job_area.application.mapper.response;

import co.edu.udea.nexum.catalog.common.application.mapper.BaseResponseMapper;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.job_area.application.dto.response.JobAreaResponse;
import co.edu.udea.nexum.catalog.job_area.domain.model.JobArea;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface JobAreaResponseMapper extends BaseResponseMapper<JobArea, JobAreaResponse> {
}
