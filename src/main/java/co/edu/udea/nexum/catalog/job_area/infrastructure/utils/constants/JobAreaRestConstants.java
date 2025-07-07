package co.edu.udea.nexum.catalog.job_area.infrastructure.utils.constants;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Generated
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JobAreaRestConstants {
    // Controller data
    public static final String JOB_AREA_CONTROLLER_PATH = "/v1/job-areas";
    public static final String JOB_AREA_CONTROLLER_NAME = "Área de Primer Empleo";
    public static final String JOB_AREA_CONTROLLER_DESCRIPTION = "Operaciones relacionadas con las áreas del primer empleo de los programas académicos";

    // Save
    public static final String SWAGGER_SAVE_NEW_JOB_AREA_SUMMARY = "Guardar nueva área de primer empleo";
    public static final String SWAGGER_NEW_JOB_AREA_SAVED_SUCCESSFULLY = "Área de primer empleo guardada correctamente";

    // Find by id
    public static final String SWAGGER_FIND_JOB_AREA_BY_ID_SUMMARY = "Buscar área de primer empleo por id";
    public static final String SWAGGER_JOB_AREA_FOUND = "Área de primer empleo encontrada";
    public static final String SWAGGER_JOB_AREA_WITH_ID_NOT_FOUND = "No se encontró el área de primer empleo con el id proporcionado";

    // Find all
    public static final String SWAGGER_FIND_ALL_JOB_AREAS_SUMMARY = "Buscar todas las áreas de primer empleo registradas";
    public static final String SWAGGER_FIND_ALL_JOB_AREAS_SUCCESSFULLY = "Listado de áreas de primer empleo retornado exitosamente";

    // Find all by programId
    public static final String PROGRAM_PROGRAM_ID = "/program/{programId}";
    public static final String SWAGGER_FIND_ALL_BY_PROGRAM_ID_SUMMARY = "Buscar todas las áreas de primer empleo asociadas a un programa";
    public static final String SWAGGER_FIND_ALL_BY_PROGRAM_ID_SUCCESSFULLY = "Listado de áreas de primer empleo del programa retornado exitosamente";

    // Update
    public static final String SWAGGER_UPDATE_JOB_AREA_BY_ID_SUMMARY = "Actualizar completamente un área de primer empleo";
    public static final String SWAGGER_JOB_AREA_UPDATED_SUCCESSFULLY = "Área de primer empleo actualizada exitosamente";

    // Delete
    public static final String SWAGGER_DELETE_JOB_AREA_BY_ID_SUMMARY = "Eliminar área de primer empleo por id";
    public static final String SWAGGER_JOB_AREA_DELETED_SUCCESSFULLY = "Área de primer empleo eliminada exitosamente";
}
