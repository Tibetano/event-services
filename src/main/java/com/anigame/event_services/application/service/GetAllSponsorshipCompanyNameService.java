package com.anigame.event_services.application.service;

import com.anigame.event_services.domain.model.SponsorshipCompanyName;
import com.anigame.event_services.domain.persistence.SponsorshipRepository;
import com.anigame.event_services.domain.usecase.GetAllSponsorshipCompanyNameUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAllSponsorshipCompanyNameService implements GetAllSponsorshipCompanyNameUseCase {

    private final SponsorshipRepository sponsorshipRepository;

    @Override
    public List<SponsorshipCompanyName> execute() {
        return sponsorshipRepository.findAllSponsorshipCompanyName();
    }
}
