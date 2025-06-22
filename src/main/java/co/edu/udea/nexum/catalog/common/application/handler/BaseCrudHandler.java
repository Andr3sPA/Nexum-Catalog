package co.edu.udea.nexum.catalog.common.application.handler;


import co.edu.udea.nexum.catalog.common.application.dto.request.BaseRequest;
import co.edu.udea.nexum.catalog.common.application.dto.response.BaseResponse;

import java.util.List;

public interface BaseCrudHandler<ID, RESPONSE extends BaseResponse, REQUEST extends BaseRequest> {
    RESPONSE save(REQUEST response);
    List<RESPONSE> findAll();
    RESPONSE findById(ID id);
    RESPONSE updateById(ID id, REQUEST response);
    RESPONSE deleteById(ID id);
}
