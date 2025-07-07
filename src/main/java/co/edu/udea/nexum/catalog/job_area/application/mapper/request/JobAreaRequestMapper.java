package co.edu.udea.nexum.catalog.job_area.application.mapper.request;

import co.edu.udea.nexum.catalog.common.application.mapper.BaseRequestMapper;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.job_area.application.dto.request.JobAreaRequest;
import co.edu.udea.nexum.catalog.job_area.domain.model.JobArea;
import co.edu.udea.nexum.catalog.program.domain.model.Program;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface JobAreaRequestMapper extends BaseRequestMapper<JobArea, JobAreaRequest> {

    default Program mapProgram(Long programId) {
        return Program.builder().id(programId).build();
    }

    @Mapping(source = "programId", target = "program")
    JobArea toDomain(JobAreaRequest request);
}
