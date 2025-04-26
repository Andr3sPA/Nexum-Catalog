package co.edu.udea.nexum.catalog.common.domain.utils;

public class CommonDomainConstants {


    private CommonDomainConstants() {
        throw new IllegalStateException("Utility class");
    }

    // Exception messages
    public static final String ENTITY_NOT_FOUND_TEMPLATE_MESSAGE = "Entity of type '%s' has not been found";
    public static final String ENTITY_WITH_ATTRIBUTE_NOT_FOUND_TEMPLATE_MESSAGE = "Entity of type '%s' with %s '%s' has not been found";
    public static final String ENTITY_WITH_ATTRIBUTE_ALREADY_EXIST_TEMPLATE_MESSAGE = "An entity of type '%s' with %s '%s' already exists";

    public static final String INVALID_TOKEN_MESSAGE = "Given token is invalid";
    public static final String EXPIRED_TOKEN_MESSAGE = "Given token has expired";
}
