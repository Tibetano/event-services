package com.anigame.event_services.domain.model;

import com.anigame.event_services.domain.model.enumerate.SponsorshipType;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Data
@Builder
public class Sponsorship {
    private UUID id;
    private BigDecimal amount;
    private String logoLink;
    private String siteLink;
    private String representativeName;
    private SponsorshipType type;
    private Instant createdAt;
    private Instant updatedAt;
    private UUID companyId;
    private UUID eventId;
}
