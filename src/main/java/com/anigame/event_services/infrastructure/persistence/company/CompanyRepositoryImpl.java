package com.anigame.event_services.infrastructure.persistence.company;

import com.anigame.event_services.data.mapper.CompanyMapper;
import com.anigame.event_services.domain.model.Company;
import com.anigame.event_services.domain.persistence.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CompanyRepositoryImpl implements CompanyRepository {

    private final SpringDataCompanyRepository jpaRepo;
    private final CompanyMapper companyMapper;

    @Override
    public void save(Company company) {
        jpaRepo.save(companyMapper.toEntity(company));
    }

}
