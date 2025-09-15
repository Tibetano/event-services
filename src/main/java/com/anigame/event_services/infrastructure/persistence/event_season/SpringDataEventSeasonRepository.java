package com.anigame.event_services.infrastructure.persistence.event_season;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpringDataEventSeasonRepository extends JpaRepository<EventSeasonEntity, UUID> {
}
