package co.edu.udea.nexum.catalog.salary_range.infrastructure.utils.constants;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Generated
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SalaryRangeRestConstants {
    // Controller data
    public static final String SALARY_RANGE_CONTROLLER_PATH = "/v1/salary-ranges";
    public static final String SALARY_RANGE_CONTROLLER_NAME = "Rango Salarial";
    public static final String SALARY_RANGE_CONTROLLER_DESCRIPTION = "Operaciones relacionadas con los rangos salariales de los egresados";

    // Save
    public static final String SWAGGER_SAVE_NEW_SALARY_RANGE_SUMMARY = "Guarda un nuevo rango salarial";
    public static final String SWAGGER_NEW_SALARY_RANGE_SAVED_SUCCESSFULLY = "El nuevo rango salarial ha sido registrado satisfactoriamente";

    // Find by ID
    public static final String SWAGGER_FIND_SALARY_RANGE_BY_ID_SUMMARY = "Busca un rango salarial por su ID";
    public static final String SWAGGER_SALARY_RANGE_FOUND = "El rango salarial ha sido encontrado";
    public static final String SWAGGER_SALARY_RANGE_WITH_ID_NOT_FOUND = "No se ha encontrado un rango salarial con ese ID";

    // Find all
    public static final String SWAGGER_FIND_ALL_SALARY_RANGES_SUMMARY = "Busca todos los rangos salariales registrados";
    public static final String SWAGGER_FIND_ALL_SALARY_RANGES_SUCCESSFULLY = "Retorna una lista con los rangos salariales encontrados";

    // Update by ID
    public static final String SWAGGER_UPDATE_SALARY_RANGE_BY_ID_SUMMARY = "Actualiza completamente un rango salarial";
    public static final String SWAGGER_SALARY_RANGE_UPDATED_SUCCESSFULLY = "El rango salarial ha sido actualizado satisfactoriamente";

    // Delete by ID
    public static final String SWAGGER_DELETE_SALARY_RANGE_BY_ID_SUMMARY = "Elimina un rango salarial por ID";
    public static final String SWAGGER_SALARY_RANGE_DELETED_SUCCESSFULLY = "El rango salarial ha sido eliminado satisfactoriamente";
}
