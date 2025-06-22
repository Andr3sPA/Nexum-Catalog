package co.edu.udea.nexum.catalog.identity_document_type.infrastructure.utils.constants;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Generated
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class IdentityDocumentTypeRestConstants {
    // Controller data
    public static final String IDENTITY_DOCUMENT_TYPE_CONTROLLER_PATH = "/v1/identity-document-types";
    public static final String IDENTITY_DOCUMENT_TYPE_CONTROLLER_NAME = "Tipo de Documento de Identidad";
    public static final String IDENTITY_DOCUMENT_TYPE_CONTROLLER_DESCRIPTION = "Las operaciónes necesarias para los tipos de documentos de identidad";

    // Find by id
    public static final String SWAGGER_IDENTITY_DOCUMENT_TYPE_WITH_ID_NOT_FOUND = "No se ha encontrado un tipo de documento de identidad con ese id";
    public static final String SWAGGER_IDENTITY_DOCUMENT_TYPE_FOUND = "El tipo de documento de identidad ha sido encontrado";
    public static final String SWAGGER_FIND_IDENTITY_DOCUMENT_TYPE_BY_ID_SUMMARY = "Busca un tipo de documento de identidad por su id";

    // Find all
    public static final String SWAGGER_FIND_ALL_IDENTITY_DOCUMENT_TYPES_SUMMARY = "Busca todos los tipos de documentos de identidad registrados";
    public static final String SWAGGER_FIND_ALL_IDENTITY_DOCUMENT_TYPES_SUCCESSFULLY = "Retorna una lista con los tipos de documentos de identidad encontrados";
}
