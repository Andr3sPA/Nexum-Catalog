package co.edu.udea.nexum.catalog.program_version.application.utils.constants;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Generated
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ProgramVersionAppConstants {
    public static final String PROGRAM_ID_FIELD_MUST_NOT_BE_NULL_MESSAGE = "El id del programa no puede ser nulo";
    public static final String PROGRAM_VERSION_FIELD_MUST_NOT_BE_NULL_MESSAGE = "La versión no puede ser nula";
    public static final String PROGRAM_VERSION_MIN_VALUE_MESSAGE = "La versión tiene que ser un número natural";
    public static final String PROGRAM_VERSION_START_YEAR_MUST_NOT_BE_NULL_MESSAGE = "El año de inicio no puede ser nulo";
    public static final String PROGRAM_VERSION_YEAR_MUST_BE_POSITIVE_MESSAGE = "El año debe ser positivo";
    public static final int MIN_VERSION_VALUE_MESSAGE = 1;
}
