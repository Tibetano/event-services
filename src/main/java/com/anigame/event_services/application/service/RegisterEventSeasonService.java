package com.anigame.event_services.application.service;

import com.anigame.event_services.domain.model.EventSeason;
import com.anigame.event_services.domain.persistence.EventSeasonRepository;
import com.anigame.event_services.domain.usecase.RegisterEventSeasonUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class RegisterEventSeasonService implements RegisterEventSeasonUseCase {

    private final EventSeasonRepository eventSeasonRepository;

    @Override
    public void execute(EventSeason eventSeason) {
        eventSeason.setCreatedAt(Instant.now());
        eventSeason.setUpdatedAt(Instant.now());
        eventSeasonRepository.save(eventSeason);
    }
}
