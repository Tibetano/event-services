package com.anigame.event_services.data.mapper;

import com.anigame.event_services.domain.model.Sponsorship;
import com.anigame.event_services.domain.model.enumerate.SponsorshipType;
import com.anigame.event_services.infrastructure.persistence.sponsorship.SponsorshipEntity;
import com.anigame.event_services.infrastructure.persistence.sponsorship.SponsorshipTypeEntity;
import org.springframework.stereotype.Component;

@Component
public class SponsorshipMapper {

    public SponsorshipEntity toEntity (Sponsorship sponsorship) {
        return SponsorshipEntity.builder()
                .id(sponsorship.getId())
                .amount(sponsorship.getAmount())
                .logoLink(sponsorship.getLogoLink())
                .siteLink(sponsorship.getSiteLink())
                .representativeFullName(sponsorship.getRepresentativeName())
                .type(SponsorshipTypeEntity.valueOf(sponsorship.getType().name()))
                .createdAt(sponsorship.getCreatedAt())
                .updatedAt(sponsorship.getUpdatedAt())
                .companyId(sponsorship.getCompanyId())
                .eventId(sponsorship.getEventId())
                .build();
    }

    public Sponsorship toDomain (SponsorshipEntity entity) {
        return Sponsorship.builder()
                .id(entity.getId())
                .amount(entity.getAmount())
                .logoLink(entity.getLogoLink())
                .siteLink(entity.getSiteLink())
                .representativeName(entity.getRepresentativeFullName())
                .type(SponsorshipType.valueOf(entity.getType().name()))
                .createdAt(entity.getCreatedAt())
                .updatedAt(entity.getUpdatedAt())
                .companyId(entity.getCompanyId())
                .eventId(entity.getEventId())
                .build();
    }

}
