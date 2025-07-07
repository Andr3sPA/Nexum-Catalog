package co.edu.udea.nexum.catalog.job_area.application.utils.constants;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Generated
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JobAreaAppConstants {
    public static final String JOB_AREA_NAME_NOT_BLANK = "El nombre del área de empleo no puede estar vacío";
    public static final String JOB_AREA_NAME_TOO_LONG = "El nombre del área de empleo es demasiado largo";
    public static final int MAX_NAME_LENGTH = 100;

    public static final String JOB_AREA_DESCRIPTION_TOO_LONG = "La descripción es demasiado larga";
    public static final int MAX_DESCRIPTION_LENGTH = 500;

    public static final String JOB_AREA_PROGRAM_ID_NOT_NULL = "Debe asociarse a un programa existente";
}
