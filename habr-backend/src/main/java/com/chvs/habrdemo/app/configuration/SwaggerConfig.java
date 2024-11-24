package com.chvs.habrdemo.app.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
class SwaggerConfig {

    @Bean
    GroupedOpenApi groupedOpenApi() {
        return GroupedOpenApi.builder()
                .group("prod-swagger-config")
                .pathsToMatch("/api/**")
                .build();
    }

    @Bean
    OpenAPI openApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Habr demo")
                        .description("Demo habr application")
                        .version("v1")
                        .contact(new Contact()
                                .email("vchs1710@yandex.ru")
                                .name("vchs")))
                .servers(List.of(new Server().url("localhost:8080")));
    }
}
