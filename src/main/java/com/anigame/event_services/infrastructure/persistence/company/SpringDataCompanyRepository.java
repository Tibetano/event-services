package com.anigame.event_services.infrastructure.persistence.company;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpringDataCompanyRepository extends JpaRepository<CompanyEntity, UUID> {
}
