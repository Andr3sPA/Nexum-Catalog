package co.edu.udea.nexum.catalog.job_institution_type.application.mapper.request;

import co.edu.udea.nexum.catalog.common.application.mapper.BaseRequestMapper;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.job_institution_type.application.dto.request.JobInstitutionTypeRequest;
import co.edu.udea.nexum.catalog.job_institution_type.domain.model.JobInstitutionType;
import co.edu.udea.nexum.catalog.program.domain.model.Program;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface JobInstitutionTypeRequestMapper extends BaseRequestMapper<JobInstitutionType, JobInstitutionTypeRequest> {

    default Program mapProgram(Long programId) {
        return Program.builder().id(programId).build();
    }

    @Mapping(source = "programId", target = "program")
    JobInstitutionType toDomain(JobInstitutionTypeRequest request);
}
