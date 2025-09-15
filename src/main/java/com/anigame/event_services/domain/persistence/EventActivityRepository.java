package com.anigame.event_services.domain.persistence;

import com.anigame.event_services.domain.model.EventActivity;

public interface EventActivityRepository {
    void save(EventActivity eventActivity);
}
