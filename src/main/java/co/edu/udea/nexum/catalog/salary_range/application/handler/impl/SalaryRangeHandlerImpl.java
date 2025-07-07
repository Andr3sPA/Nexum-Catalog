package co.edu.udea.nexum.catalog.salary_range.application.handler.impl;

import co.edu.udea.nexum.catalog.common.application.handler.impl.BaseCrudHandlerImpl;
import co.edu.udea.nexum.catalog.common.application.mapper.BaseRequestMapper;
import co.edu.udea.nexum.catalog.common.application.mapper.BaseResponseMapper;
import co.edu.udea.nexum.catalog.common.domain.api.BaseCrudServicePort;
import co.edu.udea.nexum.catalog.salary_range.application.dto.request.SalaryRangeRequest;
import co.edu.udea.nexum.catalog.salary_range.application.dto.response.SalaryRangeResponse;
import co.edu.udea.nexum.catalog.salary_range.application.handler.SalaryRangeHandler;
import co.edu.udea.nexum.catalog.salary_range.application.mapper.request.SalaryRangeRequestMapper;
import co.edu.udea.nexum.catalog.salary_range.application.mapper.response.SalaryRangeResponseMapper;
import co.edu.udea.nexum.catalog.salary_range.domain.api.SalaryRangeServicePort;
import co.edu.udea.nexum.catalog.salary_range.domain.model.SalaryRange;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SalaryRangeHandlerImpl
        extends BaseCrudHandlerImpl<Long, SalaryRange, SalaryRangeResponse, SalaryRangeRequest>
        implements SalaryRangeHandler {

    private final SalaryRangeServicePort salaryRangeServicePort;
    private final SalaryRangeResponseMapper salaryRangeResponseMapper;
    private final SalaryRangeRequestMapper salaryRangeRequestMapper;

    @Override
    protected BaseCrudServicePort<Long, SalaryRange> getServicePort() {
        return salaryRangeServicePort;
    }

    @Override
    protected BaseResponseMapper<SalaryRange, SalaryRangeResponse> getResponseMapper() {
        return salaryRangeResponseMapper;
    }

    @Override
    protected BaseRequestMapper<SalaryRange, SalaryRangeRequest> getRequestMapper() {
        return salaryRangeRequestMapper;
    }
}
