package com.anigame.event_services.domain.persistence;

import com.anigame.event_services.domain.model.Company;

public interface CompanyRepository {
    void save(Company company);
}
