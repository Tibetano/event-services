package com.anigame.event_services.data.dto;

import com.anigame.event_services.domain.model.enumerate.SponsorshipType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public record SponsorshipCompanyNameDTO(
        String name,
        @JsonProperty("logo_link")
        String logoLink,
        @JsonProperty("site_link")
        String siteLink,
        SponsorshipType type
) {
}