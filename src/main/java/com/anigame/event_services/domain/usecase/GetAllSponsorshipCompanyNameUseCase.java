package com.anigame.event_services.domain.usecase;

import com.anigame.event_services.domain.model.SponsorshipCompanyName;

import java.util.List;

public interface GetAllSponsorshipCompanyNameUseCase {
    List<SponsorshipCompanyName> execute();
}
