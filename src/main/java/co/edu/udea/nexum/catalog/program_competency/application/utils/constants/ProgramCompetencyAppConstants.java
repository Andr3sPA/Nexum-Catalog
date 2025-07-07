package co.edu.udea.nexum.catalog.program_competency.application.utils.constants;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Generated
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ProgramCompetencyAppConstants {

    public static final String PROGRAM_COMPETENCY_NAME_NOT_BLANK = "El nombre de la competencia no puede estar vacío";
    public static final String PROGRAM_COMPETENCY_NAME_TOO_LONG = "El nombre de la competencia es demasiado largo";
    public static final int MAX_NAME_LENGTH = 100;

    public static final String PROGRAM_COMPETENCY_DESCRIPTION_TOO_LONG = "La descripción de la competencia es demasiado larga";
    public static final int MAX_DESCRIPTION_LENGTH = 500;

    public static final String PROGRAM_COMPETENCY_PROGRAM_ID_NOT_NULL = "Debe asociarse a un programa existente";
}
