package com.anigame.event_services.data.mapper;

import com.anigame.event_services.data.dto.CompanyDTO;
import com.anigame.event_services.domain.model.Company;
import com.anigame.event_services.infrastructure.persistence.company.CompanyEntity;
import org.springframework.stereotype.Component;

@Component
public class CompanyMapper {

    public CompanyEntity toEntity (Company company) {
        return CompanyEntity.builder()
                .id(company.getId())
                .name(company.getName())
                .cnpj(company.getCnpj())
                .email(company.getEmail())
                .phoneNumber(company.getPhoneNumber())
                .createdAt(company.getCreatedAt())
                .updatedAt(company.getUpdatedAt())
                .build();
    }

    public Company toDomain (CompanyEntity entity) {
        return Company.builder()
                .id(entity.getId())
                .name(entity.getName())
                .cnpj(entity.getCnpj())
                .email(entity.getEmail())
                .phoneNumber(entity.getPhoneNumber())
                .createdAt(entity.getCreatedAt())
                .updatedAt(entity.getUpdatedAt())
                .build();
    }

    public Company toDomain (CompanyDTO company) {
        return Company.builder()
                .name(company.name())
                .cnpj(company.cnpj())
                .email(company.email())
                .phoneNumber(company.phoneNumber())
                .build();
    }
}
