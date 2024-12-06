package com.chvs.habrdemo.core.model.profile;

import jakarta.persistence.Enumerated;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static jakarta.persistence.EnumType.STRING;

public class Profile {

    private Long id;
    private LocalDateTime registeredAt;
    private String fullName;
    private LocalDate birthDate;
    @Enumerated(STRING)
    private Gender gender;
    private Qualification qualification;
    // java, spring, hibernate, etc...
    private List<String> abilities;
    private String about;
}
