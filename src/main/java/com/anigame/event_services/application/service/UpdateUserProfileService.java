package com.anigame.event_services.application.service;

import com.anigame.event_services.domain.model.UserProfile;
import com.anigame.event_services.domain.persistence.UserProfileRepository;
import com.anigame.event_services.domain.service.TokenService;
import com.anigame.event_services.domain.usecase.UpdateUserProfileUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateUserProfileService implements UpdateUserProfileUseCase {

    private final UserProfileRepository userProfileRepository;
    private final TokenService tokenService;

    @Override
    public void execute(String token, UserProfile userProfile) {
        var userId = tokenService.getUserIdFromToken(token);
        userProfileRepository.update(userId, userProfile);
    }
}
