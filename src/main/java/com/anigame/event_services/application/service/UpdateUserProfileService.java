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
    public UserProfile execute(String token, UserProfile userProfile) {
        System.out.println("77777777");
        System.out.println(userProfile);
        var userId = tokenService.getUserIdFromToken(token);
        System.out.println("888888");
        System.out.println(userId);
        return userProfileRepository.update(userId, userProfile);
    }
}
