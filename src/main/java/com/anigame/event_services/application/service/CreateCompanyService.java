package com.anigame.event_services.application.service;

import com.anigame.event_services.domain.model.Company;
import com.anigame.event_services.domain.persistence.CompanyRepository;
import com.anigame.event_services.domain.usecase.RegisterCompanyUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class CreateCompanyService implements RegisterCompanyUseCase {

    private final CompanyRepository companyRepository;

    @Override
    public void execute(Company company) {
        company.setCreatedAt(Instant.now());
        company.setUpdatedAt(Instant.now());
        companyRepository.save(company);
    }
}
