package co.edu.udea.nexum.catalog.job_delay.application.mapper.request;

import co.edu.udea.nexum.catalog.common.application.mapper.BaseRequestMapper;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.job_delay.application.dto.request.JobDelayRequest;
import co.edu.udea.nexum.catalog.job_delay.domain.model.JobDelay;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface JobDelayRequestMapper extends BaseRequestMapper<JobDelay, JobDelayRequest> {
}
