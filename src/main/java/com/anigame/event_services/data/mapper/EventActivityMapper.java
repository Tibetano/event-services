package com.anigame.event_services.data.mapper;

import com.anigame.event_services.domain.model.EventActivity;
import com.anigame.event_services.infrastructure.persistence.event_activity.EventActivityEntity;
import org.springframework.stereotype.Component;

@Component
public class EventActivityMapper {

    public EventActivityEntity toEntity (EventActivity eventActivity) {
        return EventActivityEntity.builder()
                .id(eventActivity.getId())
                .name(eventActivity.getName())
                .description(eventActivity.getDescription())
                .activiteEventTime(eventActivity.getActiviteEventTime())
                .createdAt(eventActivity.getCreatedAt())
                .updatedAt(eventActivity.getUpdatedAt())

                .userProfileId(eventActivity.getUserProfileId())
                .eventSeasonId(eventActivity.getEventSeasonId())

                .build();
    }
    public EventActivity toDomain (EventActivityEntity eventActivity) {
        return EventActivity.builder()
                .id(eventActivity.getId())
                .name(eventActivity.getName())
                .description(eventActivity.getDescription())
                .activiteEventTime(eventActivity.getActiviteEventTime())
                .createdAt(eventActivity.getCreatedAt())
                .updatedAt(eventActivity.getUpdatedAt())

                .userProfileId(eventActivity.getUserProfileId())
                .eventSeasonId(eventActivity.getEventSeasonId())

                .build();
    }
}
