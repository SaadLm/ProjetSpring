package com.example.Pam_web_api.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
//@OpenAPIDefinition(info = @Info(title = "Dentiste API", version = "v1", description = "API for managing Dentistes"))
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.OAS_30) // Utilise OpenAPI 3.0
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.Pam_web_api")) // Chemin vers les contrôleurs
                .paths(PathSelectors.any())//inclure tous les chemins
                .build();
    }
}
