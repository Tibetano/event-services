package com.anigame.event_services.application.service;

import com.anigame.event_services.domain.model.UserProfile;
import com.anigame.event_services.domain.persistence.UserProfileRepository;
import com.anigame.event_services.domain.service.TokenService;
import com.anigame.event_services.domain.usecase.GetUserProfileUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetUserProfileService implements GetUserProfileUseCase {

    private final UserProfileRepository userProfileRepository;
    private final TokenService tokenService;

    @Override
    public UserProfile execute(String token) {
        var userId = tokenService.getUserIdFromToken(token);
        return userProfileRepository.findById(userId.toString());
    }
}
