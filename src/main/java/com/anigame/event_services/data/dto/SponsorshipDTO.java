package com.anigame.event_services.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public record SponsorshipDTO(
        String name,
        @JsonProperty("logo_link")
        String logoLink,
        @JsonProperty("site_link")
        String siteLink,
        String type
) {
}
