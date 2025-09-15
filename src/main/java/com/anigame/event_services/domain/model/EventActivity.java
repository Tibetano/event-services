package com.anigame.event_services.domain.model;

import com.anigame.event_services.domain.model.enumerate.ActiviteType;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class EventActivity {
    private UUID id;
    private String name;
    private ActiviteType type;
    private String description;
    private LocalDateTime activiteEventTime;
    private Instant createdAt;
    private Instant updatedAt;
    private UUID userProfileId;
    private UUID eventSeasonId;
}
