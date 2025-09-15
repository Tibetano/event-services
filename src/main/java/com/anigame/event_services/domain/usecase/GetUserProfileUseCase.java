package com.anigame.event_services.domain.usecase;

import com.anigame.event_services.domain.model.UserProfile;

public interface GetUserProfileUseCase {
    UserProfile execute (String token);
}
