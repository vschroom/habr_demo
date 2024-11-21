package com.chvs.habrdemo;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

@TestConfiguration(proxyBeanMethods = false)
class TestcontainersConfiguration {

    @Bean
    @ServiceConnection
    PostgreSQLContainer<?> postgresContainer() {
        try (var psqlContainer = new PostgreSQLContainer<>(DockerImageName.parse("postgres:latest"))) {
            return psqlContainer
                    .withDatabaseName("habr_db")
                    .withInitScript("init-testcontainers.sql");
        }
    }
}
