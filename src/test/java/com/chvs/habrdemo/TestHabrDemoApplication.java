package com.chvs.habrdemo;

import org.springframework.boot.SpringApplication;

public class TestHabrDemoApplication {

    public static void main(String[] args) {
        SpringApplication.from(HabrDemoApplication::main).with(TestcontainersConfiguration.class).run(args);
    }
}
