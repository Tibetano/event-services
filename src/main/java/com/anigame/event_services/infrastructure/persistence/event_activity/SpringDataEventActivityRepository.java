package com.anigame.event_services.infrastructure.persistence.event_activity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpringDataEventActivityRepository extends JpaRepository<EventActivityEntity, UUID> {
}
