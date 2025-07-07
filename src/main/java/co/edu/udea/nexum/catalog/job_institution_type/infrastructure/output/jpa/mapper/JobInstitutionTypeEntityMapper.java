package co.edu.udea.nexum.catalog.job_institution_type.infrastructure.output.jpa.mapper;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.mapper.BaseEntityMapper;
import co.edu.udea.nexum.catalog.job_institution_type.domain.model.JobInstitutionType;
import co.edu.udea.nexum.catalog.job_institution_type.infrastructure.output.jpa.entity.JobInstitutionTypeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(
    componentModel = "spring",
    unmappedSourcePolicy = ReportingPolicy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface JobInstitutionTypeEntityMapper extends BaseEntityMapper<JobInstitutionType, JobInstitutionTypeEntity> {
}
