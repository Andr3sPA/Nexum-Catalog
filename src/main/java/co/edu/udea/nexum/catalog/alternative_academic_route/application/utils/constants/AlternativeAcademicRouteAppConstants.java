package co.edu.udea.nexum.catalog.alternative_academic_route.application.utils.constants;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Generated
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AlternativeAcademicRouteAppConstants {

    public static final String AAR_NAME_NOT_BLANK = "El nombre de la ruta académica alternativa no puede estar vacío";
    public static final String AAR_NAME_TOO_LONG = "El nombre de la ruta académica alternativa es demasiado largo";
    public static final int MAX_NAME_LENGTH = 100;

    public static final String AAR_DESCRIPTION_TOO_LONG = "La descripción es demasiado larga";
    public static final int MAX_DESCRIPTION_LENGTH = 500;

    public static final String AAR_ENABLED_NOT_NULL = "Debe especificar si la ruta académica alternativa está habilitada";
}
