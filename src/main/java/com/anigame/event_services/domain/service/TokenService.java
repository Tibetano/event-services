package com.anigame.event_services.domain.service;

import java.util.UUID;

public interface TokenService {;
    UUID getUserIdFromToken (String token);
}
