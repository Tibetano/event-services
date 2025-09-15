package com.anigame.event_services.infrastructure.persistence.event_activity;

import com.anigame.event_services.domain.model.EventActivity;
import com.anigame.event_services.domain.persistence.EventActivityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class EventActivityRepositoryImpl implements EventActivityRepository {
    @Override
    public void save(EventActivity eventActivity) {

    }
}
