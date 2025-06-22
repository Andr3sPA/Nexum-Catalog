package co.edu.udea.nexum.catalog.identity_document_type.infrastructure.configuration;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.identity_document_type.domain.api.IdentityDocumentTypeServicePort;
import co.edu.udea.nexum.catalog.identity_document_type.domain.spi.IdentityDocumentTypePersistencePort;
import co.edu.udea.nexum.catalog.identity_document_type.domain.usecase.IdentityDocumentTypeUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Generated
@Configuration
public class IdentityDocumentTypeBeanConfiguration {
    @Bean
    public IdentityDocumentTypeServicePort identityDocumentTypeServicePort(IdentityDocumentTypePersistencePort identityDocumentTypePersistencePort) {
        return new IdentityDocumentTypeUseCase(identityDocumentTypePersistencePort);
    }
}
