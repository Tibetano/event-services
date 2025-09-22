package com.anigame.event_services.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import java.time.Instant;

@Builder
public record UserProfileResDTO(
        @JsonProperty("first_name")
        String firstName,
        @JsonProperty("last_name")
        String lastName,
        String cpf,
        String gender,
        @JsonProperty("date_of_birth")
        String dateOfBirth,
        @JsonProperty("created_at")
        Instant createdAt
) {
}
