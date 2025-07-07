package co.edu.udea.nexum.catalog.job_delay.infrastructure.output.jpa.mapper;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.mapper.BaseEntityMapper;
import co.edu.udea.nexum.catalog.job_delay.domain.model.JobDelay;
import co.edu.udea.nexum.catalog.job_delay.infrastructure.output.jpa.entity.JobDelayEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(
        componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface JobDelayEntityMapper extends BaseEntityMapper<JobDelay, JobDelayEntity> {
}
