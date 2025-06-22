package co.edu.udea.nexum.catalog.common.infrastructure.input.rest.v1;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static co.edu.udea.nexum.catalog.common.infrastructure.utils.constants.CommonRestConstants.*;

@Generated
@RestController
@RequestMapping("/v1/home")
public class HomeController {

    @Operation(summary = SWAGGER_SUMMARY_GET_HOME)
    @GetMapping
    public String home(){
        return HOME_MESSAGE;
    }
}
