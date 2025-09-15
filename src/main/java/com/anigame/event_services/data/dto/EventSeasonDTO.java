package com.anigame.event_services.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record EventSeasonDTO(
        String city,
        String cep,
        @JsonProperty("ticket_price")
        BigDecimal ticketPrice,
        String address,
        @JsonProperty("address_number")
        Long addressNumber,
        @JsonProperty("start_time")
        LocalDateTime startTime,
        @JsonProperty("end_time")
        LocalDateTime endTime
) {
}
