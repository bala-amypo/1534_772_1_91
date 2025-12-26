package com.example.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Ticket Management API")
                        .version("1.0"))
                        .description("API documentation")
                .servers(List.of(
                        new Server().url("https://9058.pro604cr.amypo.ai")
                ));
    }
}
