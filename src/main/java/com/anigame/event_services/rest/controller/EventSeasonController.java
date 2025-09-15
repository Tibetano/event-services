package com.anigame.event_services.rest.controller;

import com.anigame.event_services.data.dto.EventSeasonDTO;
import com.anigame.event_services.data.mapper.EventSeasonMapper;
import com.anigame.event_services.domain.usecase.RegisterEventSeasonUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event-season")
@RequiredArgsConstructor
public class EventSeasonController {

    private final RegisterEventSeasonUseCase registerEventSeason;
    private final EventSeasonMapper eventSeasonMapper;

    @PostMapping
    public ResponseEntity<?> registerEvent (@RequestBody EventSeasonDTO event) {
        registerEventSeason.execute(eventSeasonMapper.toDomain(event));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
