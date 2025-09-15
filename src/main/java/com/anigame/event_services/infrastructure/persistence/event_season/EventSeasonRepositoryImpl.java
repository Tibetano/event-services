package com.anigame.event_services.infrastructure.persistence.event_season;

import com.anigame.event_services.data.mapper.EventSeasonMapper;
import com.anigame.event_services.domain.model.EventSeason;
import com.anigame.event_services.domain.persistence.EventSeasonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class EventSeasonRepositoryImpl implements EventSeasonRepository {

    private final SpringDataEventSeasonRepository jpaRepo;
    private final EventSeasonMapper eventSeasonMapper;

    @Override
    public void save(EventSeason eventSeason) {
        jpaRepo.save(eventSeasonMapper.toEntity(eventSeason));
    }
}
