package com.anigame.event_services.domain.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class EventSeason {
    private UUID id;
    private String city;
    private String cep;
    private String address;
    private Long addressNumber;
    private BigDecimal ticketPrice;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Instant createdAt;
    private Instant updatedAt;
}
