package com.anigame.event_services.domain.model;

import com.anigame.event_services.domain.model.enumerate.SponsorshipType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SponsorshipCompanyName {
    private String name;
    private String logoLink;
    private String siteLink;
    private SponsorshipType type;
}
