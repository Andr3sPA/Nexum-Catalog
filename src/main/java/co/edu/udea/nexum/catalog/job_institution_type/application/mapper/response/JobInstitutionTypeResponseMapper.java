package co.edu.udea.nexum.catalog.job_institution_type.application.mapper.response;

import co.edu.udea.nexum.catalog.common.application.mapper.BaseResponseMapper;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.job_institution_type.application.dto.response.JobInstitutionTypeResponse;
import co.edu.udea.nexum.catalog.job_institution_type.domain.model.JobInstitutionType;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface JobInstitutionTypeResponseMapper extends BaseResponseMapper<JobInstitutionType, JobInstitutionTypeResponse> {
}
