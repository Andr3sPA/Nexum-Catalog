package co.edu.udea.nexum.catalog.program.infrastructure.utils.constants;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Generated
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ProgramRestConstants {
    // Controller data
    public static final String PROGRAM_CONTROLLER_PATH = "/v1/programs";
    public static final String PROGRAM_CONTROLLER_NAME = "Programa";

    // Save
    public static final String SWAGGER_SAVE_NEW_PROGRAM_SUMMARY = "Guarda un nuevo programa";
    public static final String PROGRAM_CONTROLLER_DESCRIPTION = "Cualquier operación relacionada a los Programas Universitarios";
    public static final String SWAGGER_NEW_PROGRAM_SAVED_SUCCESSFULLY = "El nuevo programa ha sido registrado satisfactoriamente";

    // Find by id
    public static final String SWAGGER_PROGRAM_WITH_ID_NOT_FOUND = "No se ha encontrado un programa con ese id";
    public static final String SWAGGER_PROGRAM_FOUND = "El programa ha sido encontrado";
    public static final String SWAGGER_FIND_PROGRAM_BY_ID_SUMMARY = "Busca un programa por su id";

    // Find all
    public static final String SWAGGER_FIND_ALL_PROGRAMS_SUMMARY = "Busca todos los programas registrados";
    public static final String SWAGGER_FIND_ALL_PROGRAMS_SUCCESSFULLY = "Retorna una lista con los programas encontrados";

    // Update by id
    public static final String SWAGGER_UPDATE_PROGRAM_BY_ID_SUMMARY = "Actualizar completamente un programa";
    public static final String SWAGGER_PROGRAM_UDPATED_SUCCESSFULLY = "El programa fue actualizado satisfactoriamente";

    // Delete by id
    public static final String SWAGGER_DELETE_PROGRAM_BY_ID_SUMMARY = "Eliminar el programa del id entregado";
    public static final String SWAGGER_PROGRAM_DELETED_SUCCESSFULLY = "El programa ha sido eliminado satisfactoriamente";
}
