package com.anigame.event_services.infrastructure.persistence.event_season;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_event_seasons", schema = "event_services")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EventSeasonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid DEFAULT gen_random_uuid()", updatable = false, nullable = false)
    private UUID id;
    @Column(name = "city", nullable = false)
    private String city;
    @Column(name = "cep", nullable = false)
    private String cep;
    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "address_number", nullable = false)
    private Long addressNumber;
    @Column(name = "ticket_price", nullable = false)
    private BigDecimal ticketPrice;
    @Column(name = "start_time", nullable = false)
    private LocalDateTime startTime;
    @Column(name = "end_time", nullable = false)
    private LocalDateTime endTime;
    @Column(name = "created_at", nullable = false)
    private Instant createdAt;
    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;
}
