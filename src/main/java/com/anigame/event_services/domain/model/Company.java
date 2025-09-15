package com.anigame.event_services.domain.model;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.UUID;

@Data
@Builder
public class Company {
    private UUID id;
    private String name;
    private String cnpj;
    private String email;
    private String phoneNumber;
    private Instant createdAt;
    private Instant updatedAt;
}
