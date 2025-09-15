package com.anigame.event_services.infrastructure.persistence.sponsorship;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpringDataSponsorShipRepository extends JpaRepository<SponsorshipEntity, UUID> {
}
