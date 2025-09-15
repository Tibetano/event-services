package com.anigame.event_services.rest.controller;

import com.anigame.event_services.data.dto.CompanyDTO;
import com.anigame.event_services.data.mapper.CompanyMapper;
import com.anigame.event_services.domain.usecase.RegisterCompanyUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
@RequiredArgsConstructor
public class CompanyController {
    private final RegisterCompanyUseCase createCompanyUseCase;

    private final CompanyMapper companyMapper;

    @PostMapping
    private ResponseEntity<?> registerCompany (@RequestBody CompanyDTO company) {
        createCompanyUseCase.execute(companyMapper.toDomain(company));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
