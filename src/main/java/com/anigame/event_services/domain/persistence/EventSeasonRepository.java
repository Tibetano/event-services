package com.anigame.event_services.domain.persistence;

import com.anigame.event_services.domain.model.EventSeason;

public interface EventSeasonRepository {
    void save(EventSeason eventSeason);
}
