package com.anigame.event_services.application.service;

import com.anigame.event_services.data.dto.SponsorshipDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record SponsorshipListDTO(
        @JsonProperty("sponsorships")
        List<SponsorshipDTO> sponsorshipList
) {
}
