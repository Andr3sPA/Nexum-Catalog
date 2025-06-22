package co.edu.udea.nexum.catalog;

import co.edu.udea.nexum.catalog.security.infrastructure.output.feign.client.AuthFeign;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(clients ={
		AuthFeign.class
})
@SpringBootApplication
public class CatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogApplication.class, args);
	}

}
