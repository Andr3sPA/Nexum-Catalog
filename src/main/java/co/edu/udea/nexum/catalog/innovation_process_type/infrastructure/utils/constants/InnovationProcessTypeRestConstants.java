package co.edu.udea.nexum.catalog.innovation_process_type.infrastructure.utils.constants;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Generated
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class InnovationProcessTypeRestConstants {

    public static final String INNOVATION_PROCESS_TYPE_CONTROLLER_PATH = "/v1/innovation-process-types";
    public static final String INNOVATION_PROCESS_TYPE_CONTROLLER_NAME = "Tipo de Proceso de Innovación";
    public static final String INNOVATION_PROCESS_TYPE_CONTROLLER_DESCRIPTION = "Operaciones relacionadas con los tipos de procesos de innovación";

    public static final String SWAGGER_SAVE_NEW_INNOVATION_PROCESS_TYPE_SUMMARY = "Guardar nuevo tipo de proceso de innovación";
    public static final String SWAGGER_NEW_INNOVATION_PROCESS_TYPE_SAVED_SUCCESSFULLY = "Tipo de proceso de innovación guardado correctamente";

    public static final String SWAGGER_FIND_INNOVATION_PROCESS_TYPE_BY_ID_SUMMARY = "Buscar tipo de proceso de innovación por id";
    public static final String SWAGGER_INNOVATION_PROCESS_TYPE_FOUND = "Tipo de proceso de innovación encontrado";
    public static final String SWAGGER_INNOVATION_PROCESS_TYPE_WITH_ID_NOT_FOUND = "No se encontró el tipo de proceso de innovación con el id proporcionado";

    public static final String SWAGGER_FIND_ALL_INNOVATION_PROCESS_TYPES_SUMMARY = "Buscar todos los tipos de procesos de innovación";
    public static final String SWAGGER_FIND_ALL_INNOVATION_PROCESS_TYPES_SUCCESSFULLY = "Listado de tipos de procesos de innovación retornado exitosamente";

    public static final String SWAGGER_UPDATE_INNOVATION_PROCESS_TYPE_BY_ID_SUMMARY = "Actualizar tipo de proceso de innovación por id";
    public static final String SWAGGER_INNOVATION_PROCESS_TYPE_UPDATED_SUCCESSFULLY = "Tipo de proceso de innovación actualizado exitosamente";

    public static final String SWAGGER_DELETE_INNOVATION_PROCESS_TYPE_BY_ID_SUMMARY = "Eliminar tipo de proceso de innovación por id";
    public static final String SWAGGER_INNOVATION_PROCESS_TYPE_DELETED_SUCCESSFULLY = "Tipo de proceso de innovación eliminado exitosamente";

    public static final String ENABLED_PATH = "/enabled";
    public static final String SWAGGER_FIND_ALL_BY_ENABLED_SUMMARY = "Buscar tipos de procesos de innovación habilitados o deshabilitados";
    public static final String SWAGGER_FIND_ALL_BY_ENABLED_SUCCESSFULLY = "Listado de tipos de procesos de innovación según el estado retornado exitosamente";
    public static final String IDS_PATH = "/ids";
}
