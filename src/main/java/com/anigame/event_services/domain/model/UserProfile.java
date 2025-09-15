package com.anigame.event_services.domain.model;

import com.anigame.event_services.domain.model.enumerate.UserGender;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
public class UserProfile {
    private UUID id;
    private String firstName;
    private String lastName;
    private String cpf;
    private String phoneNumber;
    private UserGender gender;
    private LocalDate dateOfBirth;
    private Instant createdAt;
    private Instant updatedAt;
}
