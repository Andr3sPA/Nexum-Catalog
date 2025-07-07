package co.edu.udea.nexum.catalog.job_institution_type.infrastructure.utils.constants;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Generated
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JobInstitutionTypeRestConstants {
    public static final String JOB_INSTITUTION_TYPE_CONTROLLER_PATH = "/v1/job-institution-types";
    public static final String JOB_INSTITUTION_TYPE_CONTROLLER_NAME = "Tipo de Institución de Primer Empleo";
    public static final String JOB_INSTITUTION_TYPE_CONTROLLER_DESCRIPTION = "Operaciones relacionadas con los tipos de institución del primer empleo de los programas académicos";

    public static final String SWAGGER_SAVE_NEW_JOB_INSTITUTION_TYPE_SUMMARY = "Guardar nuevo tipo de institución de primer empleo";
    public static final String SWAGGER_NEW_JOB_INSTITUTION_TYPE_SAVED_SUCCESSFULLY = "Tipo de institución de primer empleo guardado correctamente";

    public static final String SWAGGER_FIND_JOB_INSTITUTION_TYPE_BY_ID_SUMMARY = "Buscar tipo de institución de primer empleo por id";
    public static final String SWAGGER_JOB_INSTITUTION_TYPE_FOUND = "Tipo de institución de primer empleo encontrado";
    public static final String SWAGGER_JOB_INSTITUTION_TYPE_WITH_ID_NOT_FOUND = "No se encontró el tipo de institución de primer empleo con el id proporcionado";

    public static final String SWAGGER_FIND_ALL_JOB_INSTITUTION_TYPES_SUMMARY = "Buscar todos los tipos de institución de primer empleo registrados";
    public static final String SWAGGER_FIND_ALL_JOB_INSTITUTION_TYPES_SUCCESSFULLY = "Listado de tipos de institución de primer empleo retornado exitosamente";

    public static final String PROGRAM_PROGRAM_ID = "/program/{programId}";
    public static final String SWAGGER_FIND_ALL_BY_PROGRAM_ID_SUMMARY = "Buscar todos los tipos de institución de primer empleo asociados a un programa";
    public static final String SWAGGER_FIND_ALL_BY_PROGRAM_ID_SUCCESSFULLY = "Listado de tipos de institución de primer empleo del programa retornado exitosamente";

    public static final String SWAGGER_UPDATE_JOB_INSTITUTION_TYPE_BY_ID_SUMMARY = "Actualizar completamente un tipo de institución de primer empleo";
    public static final String SWAGGER_JOB_INSTITUTION_TYPE_UPDATED_SUCCESSFULLY = "Tipo de institución de primer empleo actualizado exitosamente";

    public static final String SWAGGER_DELETE_JOB_INSTITUTION_TYPE_BY_ID_SUMMARY = "Eliminar tipo de institución de primer empleo por id";
    public static final String SWAGGER_JOB_INSTITUTION_TYPE_DELETED_SUCCESSFULLY = "Tipo de institución de primer empleo eliminado exitosamente";
}
