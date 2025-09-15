package com.anigame.event_services.infrastructure.persistence.event_activity;

import com.anigame.event_services.infrastructure.persistence.company.CompanyEntity;
import com.anigame.event_services.infrastructure.persistence.event_season.EventSeasonEntity;
import com.anigame.event_services.infrastructure.persistence.user_profile.UserProfileEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_event_activities", schema = "event_services")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EventActivityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid DEFAULT gen_random_uuid()", updatable = false, nullable = false)
    private UUID id;
    @Column(name = "name", nullable = false)
    private String name;
    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private ActiviteTypeEntity type;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "activite_event_time", nullable = false)
    private LocalDateTime activiteEventTime;
    @Column(name = "created_at", nullable = false)
    private Instant createdAt;
    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;

    @JoinColumn(name = "user_profile_id", nullable = false)
    private UUID userProfileId;
    @JoinColumn(name = "event_id", nullable = false)
    private UUID eventSeasonId;
}
