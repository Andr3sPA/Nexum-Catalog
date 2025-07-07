package co.edu.udea.nexum.catalog.job_area.infrastructure.output.jpa.mapper;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.mapper.BaseEntityMapper;
import co.edu.udea.nexum.catalog.job_area.domain.model.JobArea;
import co.edu.udea.nexum.catalog.job_area.infrastructure.output.jpa.entity.JobAreaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(
    componentModel = "spring",
    unmappedSourcePolicy = ReportingPolicy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface JobAreaEntityMapper extends BaseEntityMapper<JobArea, JobAreaEntity> {
}
