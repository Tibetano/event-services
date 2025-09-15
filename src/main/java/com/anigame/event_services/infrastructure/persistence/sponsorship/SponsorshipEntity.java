package com.anigame.event_services.infrastructure.persistence.sponsorship;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "tb_sponsorships", schema = "event_services")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SponsorshipEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid DEFAULT gen_random_uuid()", updatable = false, nullable = false)
    private UUID id;
    @Column(name = "amount", nullable = false)
    private BigDecimal amount;
    @Column(name = "logo_link", nullable = false)
    private String logoLink;
    @Column(name = "site_link", nullable = false)
    private String siteLink;
    @Column(name = "representative_full_name", nullable = false)
    private String representativeFullName;
    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private SponsorshipTypeEntity type;
    @Column(name = "created_at", nullable = false)
    private Instant createdAt;
    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;

    @JoinColumn(name = "company_id", nullable = false)
    private UUID companyId;
    @JoinColumn(name = "event_id", nullable = false)
    private UUID eventId;
}
