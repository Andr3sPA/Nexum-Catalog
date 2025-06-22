package co.edu.udea.nexum.catalog.program_version.infrastructure.utils.constants;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Generated
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ProgramVersionRestConstants {
    // Controller data
    public static final String PROGRAM_VERSION_CONTROLLER_PATH = "/v1/program-versions";
    public static final String PROGRAM_VERSION_CONTROLLER_NAME = "Versión del Programa";

    // Save
    public static final String SWAGGER_SAVE_NEW_PROGRAM_VERSION_SUMMARY = "Guarda una nueva versión del programa";
    public static final String PROGRAM_VERSION_CONTROLLER_DESCRIPTION = "Cualquier operación relacionada a las Versiones de los Programas Universitarios";
    public static final String SWAGGER_NEW_PROGRAM_VERSION_SAVED_SUCCESSFULLY = "La nueva versión del programa ha sido registrada satisfactoriamente";

    // Find by id
    public static final String SWAGGER_PROGRAM_VERSION_WITH_ID_NOT_FOUND = "No se ha encontrado una versión del programa con ese id";
    public static final String SWAGGER_PROGRAM_VERSION_FOUND = "La versión del programa ha sido encontrada";
    public static final String SWAGGER_FIND_PROGRAM_VERSION_BY_ID_SUMMARY = "Busca una versión de programa por su id";

    // Find all
    public static final String SWAGGER_FIND_ALL_PROGRAM_VERSIONS_SUMMARY = "Busca todas las versiones de programas registradas";
    public static final String SWAGGER_FIND_ALL_PROGRAM_VERSIONS_SUCCESSFULLY = "Retorna una lista con las versiones de programas encontradas";

    // Update by id
    public static final String SWAGGER_UPDATE_PROGRAM_VERSION_BY_ID_SUMMARY = "Actualizar completamente una versión de programa";
    public static final String SWAGGER_PROGRAM_VERSION_UPDATED_SUCCESSFULLY = "La versión del programa fue actualizada satisfactoriamente";

    // Delete by id
    public static final String SWAGGER_DELETE_PROGRAM_VERSION_BY_ID_SUMMARY = "Eliminar la versión del programa del id entregado";
    public static final String SWAGGER_PROGRAM_VERSION_DELETED_SUCCESSFULLY = "La versión del programa ha sido eliminada satisfactoriamente";
}

