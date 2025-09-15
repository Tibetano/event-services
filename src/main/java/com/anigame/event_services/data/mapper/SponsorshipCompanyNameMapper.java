package com.anigame.event_services.data.mapper;

import com.anigame.event_services.data.dto.SponsorshipCompanyNameDTO;
import com.anigame.event_services.domain.model.SponsorshipCompanyName;
import org.springframework.stereotype.Component;

@Component
public class SponsorshipCompanyNameMapper {
    public SponsorshipCompanyNameDTO toDTO (SponsorshipCompanyName sponsorshipCompanyName) {
        return SponsorshipCompanyNameDTO.builder()
                .name(sponsorshipCompanyName.getName())
                .logoLink(sponsorshipCompanyName.getLogoLink())
                .siteLink(sponsorshipCompanyName.getSiteLink())
                .type(sponsorshipCompanyName.getType())
                .build();
    }
}
