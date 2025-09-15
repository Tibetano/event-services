package com.anigame.event_services.domain.persistence;

import com.anigame.event_services.domain.model.UserProfile;

import java.util.UUID;

public interface UserProfileRepository {
    void save (UserProfile userProfile);
    void saveNewUserProfile (UserProfile userProfile);
    void update (UUID userId, UserProfile userProfile);
    UserProfile findById(String userId);
}
