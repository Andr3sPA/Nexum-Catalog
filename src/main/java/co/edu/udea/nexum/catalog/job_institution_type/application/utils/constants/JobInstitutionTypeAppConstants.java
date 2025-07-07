package co.edu.udea.nexum.catalog.job_institution_type.application.utils.constants;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Generated
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JobInstitutionTypeAppConstants {

    public static final String JOB_INSTITUTION_TYPE_NAME_NOT_BLANK = "El nombre del tipo de institución no puede estar vacío";
    public static final String JOB_INSTITUTION_TYPE_NAME_TOO_LONG = "El nombre del tipo de institución es demasiado largo";
    public static final int MAX_NAME_LENGTH = 100;

    public static final String JOB_INSTITUTION_TYPE_DESCRIPTION_TOO_LONG = "La descripción es demasiado larga";
    public static final int MAX_DESCRIPTION_LENGTH = 500;

    public static final String JOB_INSTITUTION_TYPE_PROGRAM_ID_NOT_NULL = "Debe asociarse a un programa existente";
}
