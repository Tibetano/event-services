package com.anigame.event_services.rest.controller;

import com.anigame.event_services.data.mapper.SponsorshipCompanyNameMapper;
import com.anigame.event_services.domain.usecase.GetAllSponsorshipCompanyNameUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sponsorships")
@RequiredArgsConstructor
public class SponsorshipController {

    private final GetAllSponsorshipCompanyNameUseCase getAllSponsorshipUseCase;
    private final SponsorshipCompanyNameMapper sponsorshipCompanyNameMapper;

    @GetMapping("/current")
    public ResponseEntity<?> getAllSponsors() {
        return ResponseEntity.ok(getAllSponsorshipUseCase.execute().stream().map(
                sponsorshipCompanyNameMapper::toDTO
        ).toList());
    }

}
