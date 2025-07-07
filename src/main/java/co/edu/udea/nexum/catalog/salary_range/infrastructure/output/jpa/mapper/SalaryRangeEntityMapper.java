package co.edu.udea.nexum.catalog.salary_range.infrastructure.output.jpa.mapper;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.mapper.BaseEntityMapper;
import co.edu.udea.nexum.catalog.salary_range.domain.model.SalaryRange;
import co.edu.udea.nexum.catalog.salary_range.infrastructure.output.jpa.entity.SalaryRangeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Generated
@Mapper(
        componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface SalaryRangeEntityMapper extends BaseEntityMapper<SalaryRange, SalaryRangeEntity> {
}
