package com.anigame.event_services.domain.persistence;

import com.anigame.event_services.domain.model.Sponsorship;
import com.anigame.event_services.domain.model.SponsorshipCompanyName;

import java.util.List;

public interface SponsorshipRepository {
    void save(Sponsorship sponsorship);
    List<Sponsorship> findAll();
    List<SponsorshipCompanyName> findAllSponsorshipCompanyName ();
}
