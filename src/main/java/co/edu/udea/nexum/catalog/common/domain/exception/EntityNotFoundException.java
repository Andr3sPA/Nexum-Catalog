package co.edu.udea.nexum.catalog.common.domain.exception;

import co.edu.udea.nexum.catalog.common.domain.utils.CommonDomainConstants;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String className){
      super(String.format(
              CommonDomainConstants.ENTITY_NOT_FOUND_TEMPLATE_MESSAGE,
              className
      ));
    }

    public EntityNotFoundException(String classname, String attr, String id){
        super(String.format(
                CommonDomainConstants.ENTITY_WITH_ATTRIBUTE_NOT_FOUND_TEMPLATE_MESSAGE,
                classname, attr, id
        ));
    }
}
