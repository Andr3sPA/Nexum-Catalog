package co.edu.udea.nexum.catalog.common.infrastructure.input.rest.v1;

import co.edu.udea.nexum.catalog.common.infrastructure.utils.constants.CommonRestConstants;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/home")
public class HomeController {

    @Operation(summary = CommonRestConstants.SWAGGER_SUMMARY_GET_HOME)
    @GetMapping
    public String home(){
        return "Microservicio de catálogo de Nexum";
    }
}
