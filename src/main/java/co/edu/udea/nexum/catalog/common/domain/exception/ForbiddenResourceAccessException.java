package co.edu.udea.nexum.catalog.common.domain.exception;

import static co.edu.udea.nexum.catalog.common.domain.utils.constants.CommonDomainConstants.FORBIDDEN_RESOURCE_ACCESS_ERROR_MESSAGE;

public class ForbiddenResourceAccessException extends RuntimeException {

  public ForbiddenResourceAccessException() {
        super(FORBIDDEN_RESOURCE_ACCESS_ERROR_MESSAGE);
    }
}
