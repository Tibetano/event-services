package com.anigame.event_services.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CompanyDTO(
        String name,
        String cnpj,
        String email,
        @JsonProperty("phone_number")
        String phoneNumber
) {
}
