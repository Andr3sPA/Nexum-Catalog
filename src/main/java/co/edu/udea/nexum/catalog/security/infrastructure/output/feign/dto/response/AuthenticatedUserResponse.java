package co.edu.udea.nexum.catalog.security.infrastructure.output.feign.dto.response;

import co.edu.udea.nexum.catalog.common.infrastructure.output.feign.dto.response.FeignResponse;
import co.edu.udea.nexum.catalog.security.domain.utils.enums.RoleName;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class AuthenticatedUserResponse implements FeignResponse {
    private UUID id;
    private RoleName role;
    private String token;
}
