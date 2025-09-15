package com.anigame.event_services.domain.usecase;

import com.anigame.event_services.domain.model.EventSeason;

public interface RegisterEventSeasonUseCase {
    void execute (EventSeason eventSeason);
}
