package com.anigame.event_services.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public record UserDataReqDTO(
        @JsonProperty("first_name")
        String firstName,
        @JsonProperty("last_name")
        String lastName,
        @JsonProperty("gender")
        String gender,
        @JsonProperty("date_of_birth")
        LocalDate dateOfBirth,
        @JsonProperty("phone_number")
        String phoneNumber
) {
}
