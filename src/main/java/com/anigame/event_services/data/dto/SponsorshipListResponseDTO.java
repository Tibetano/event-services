package com.anigame.event_services.data.dto;

import lombok.Builder;

import java.util.List;

@Builder
public record SponsorshipListResponseDTO(
        List<SponsorshipCompanyNameDTO> sponsorships
) {
}
