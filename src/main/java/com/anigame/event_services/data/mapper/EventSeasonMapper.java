package com.anigame.event_services.data.mapper;

import com.anigame.event_services.data.dto.EventSeasonDTO;
import com.anigame.event_services.domain.model.EventSeason;
import com.anigame.event_services.infrastructure.persistence.event_season.EventSeasonEntity;
import org.springframework.stereotype.Component;

@Component
public class EventSeasonMapper {

    public EventSeasonEntity toEntity (EventSeason eventSeason) {
        return EventSeasonEntity.builder()
                .id(eventSeason.getId())
                .city(eventSeason.getCity())
                .cep(eventSeason.getCep())
                .address(eventSeason.getAddress())
                .addressNumber(eventSeason.getAddressNumber())
                .ticketPrice(eventSeason.getTicketPrice())
                .startTime(eventSeason.getStartTime())
                .endTime(eventSeason.getEndTime())
                .createdAt(eventSeason.getCreatedAt())
                .updatedAt(eventSeason.getUpdatedAt())
                .build();
    }

    public EventSeason toDomain (EventSeasonEntity entity) {
        return EventSeason.builder()
                .id(entity.getId())
                .city(entity.getCity())
                .cep(entity.getCep())
                .address(entity.getAddress())
                .addressNumber(entity.getAddressNumber())
                .ticketPrice(entity.getTicketPrice())
                .startTime(entity.getStartTime())
                .endTime(entity.getEndTime())
                .createdAt(entity.getCreatedAt())
                .updatedAt(entity.getUpdatedAt())
                .build();
    }

    public EventSeason toDomain (EventSeasonDTO entity) {
        return EventSeason.builder()
                .city(entity.city())
                .cep(entity.cep())
                .address(entity.address())
                .addressNumber(entity.addressNumber())
                .ticketPrice(entity.ticketPrice())
                .startTime(entity.startTime())
                .endTime(entity.endTime())
                .build();
    }
}
