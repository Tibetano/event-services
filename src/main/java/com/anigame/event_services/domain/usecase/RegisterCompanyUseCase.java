package com.anigame.event_services.domain.usecase;

import com.anigame.event_services.domain.model.Company;

public interface RegisterCompanyUseCase {
    void execute(Company company);
}
