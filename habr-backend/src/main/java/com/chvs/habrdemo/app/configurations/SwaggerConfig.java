package com.chvs.habrdemo.app.configurations;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class SwaggerConfig {

    @Bean
    GroupedOpenApi groupedOpenApi() {
        return GroupedOpenApi.builder()
                .group("prod-swagger-config")
                .pathsToMatch("../entrypoint/habr/**")
                .build();
    }

    @Bean
    OpenAPI openApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Habr demo")
                        .title("Demo habr application")
                        .version("v1")
                        .contact(new Contact()
                                .email("vchs1710@yandex.ru")
                                .name("vchs")));
    }
}
