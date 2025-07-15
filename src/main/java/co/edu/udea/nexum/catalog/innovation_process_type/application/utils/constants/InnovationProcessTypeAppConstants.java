package co.edu.udea.nexum.catalog.innovation_process_type.application.utils.constants;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Generated
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class InnovationProcessTypeAppConstants {

    public static final String IPT_NAME_NOT_BLANK = "El nombre del tipo de proceso de innovación no puede estar vacío";
    public static final String IPT_NAME_TOO_LONG = "El nombre del tipo de proceso de innovación es demasiado largo";
    public static final int MAX_NAME_LENGTH = 100;

    public static final String IPT_DESCRIPTION_TOO_LONG = "La descripción es demasiado larga";
    public static final int MAX_DESCRIPTION_LENGTH = 500;

    public static final String IPT_ENABLED_NOT_NULL = "Debe especificar si el tipo de proceso de innovación está habilitado";
}
