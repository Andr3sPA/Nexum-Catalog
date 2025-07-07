package co.edu.udea.nexum.catalog.salary_range.application.handler;

import co.edu.udea.nexum.catalog.common.application.handler.BaseCrudHandler;
import co.edu.udea.nexum.catalog.salary_range.application.dto.request.SalaryRangeRequest;
import co.edu.udea.nexum.catalog.salary_range.application.dto.response.SalaryRangeResponse;

public interface SalaryRangeHandler extends BaseCrudHandler<Long, SalaryRangeResponse, SalaryRangeRequest> {
}
