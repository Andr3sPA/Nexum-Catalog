package co.edu.udea.nexum.catalog.program_competency.infrastructure.utils.constants;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Generated
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ProgramCompetencyRestConstants {
    // Controller metadata
    public static final String PROGRAM_COMPETENCY_CONTROLLER_PATH = "/v1/program-competencies";
    public static final String PROGRAM_COMPETENCY_CONTROLLER_NAME = "Competencias del Programa";
    public static final String PROGRAM_COMPETENCY_CONTROLLER_DESCRIPTION = "Operaciones relacionadas con las competencias del programa según su formación";

    // Save
    public static final String SWAGGER_SAVE_NEW_PROGRAM_COMPETENCY_SUMMARY = "Guardar nueva competencia del programa";
    public static final String SWAGGER_NEW_PROGRAM_COMPETENCY_SAVED_SUCCESSFULLY = "Competencia del programa guardada correctamente";

    // Find by ID
    public static final String SWAGGER_FIND_PROGRAM_COMPETENCY_BY_ID_SUMMARY = "Buscar competencia del programa por id";
    public static final String SWAGGER_PROGRAM_COMPETENCY_FOUND = "Competencia del programa encontrada";
    public static final String SWAGGER_PROGRAM_COMPETENCY_WITH_ID_NOT_FOUND = "No se encontró la competencia del programa con el id proporcionado";

    // Find all
    public static final String SWAGGER_FIND_ALL_PROGRAM_COMPETENCIES_SUMMARY = "Buscar todas las competencias del programa registradas";
    public static final String SWAGGER_FIND_ALL_PROGRAM_COMPETENCIES_SUCCESSFULLY = "Listado de competencias del programa retornado exitosamente";

    // Find all by ProgramId
    public static final String PROGRAM_PATH = "/program";
    public static final String SWAGGER_FIND_ALL_BY_PROGRAM_ID_SUMMARY = "Buscar todas las competencias asociadas a un programa";
    public static final String SWAGGER_FIND_ALL_BY_PROGRAM_ID_SUCCESSFULLY = "Listado de competencias del programa retornado exitosamente";

    // Update
    public static final String SWAGGER_UPDATE_PROGRAM_COMPETENCY_BY_ID_SUMMARY = "Actualizar completamente una competencia del programa";
    public static final String SWAGGER_PROGRAM_COMPETENCY_UPDATED_SUCCESSFULLY = "Competencia del programa actualizada exitosamente";

    // Delete
    public static final String SWAGGER_DELETE_PROGRAM_COMPETENCY_BY_ID_SUMMARY = "Eliminar competencia del programa por id";
    public static final String SWAGGER_PROGRAM_COMPETENCY_DELETED_SUCCESSFULLY = "Competencia del programa eliminada exitosamente";
}
