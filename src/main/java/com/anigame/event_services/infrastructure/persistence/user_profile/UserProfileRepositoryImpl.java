package com.anigame.event_services.infrastructure.persistence.user_profile;

import com.anigame.event_services.data.mapper.UserProfileMapper;
import com.anigame.event_services.domain.model.UserProfile;
import com.anigame.event_services.domain.persistence.UserProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class UserProfileRepositoryImpl implements UserProfileRepository {

    private final SpringDataUserProfileRepository jpaRepo;
    private final UserProfileMapper profileMapper;

    @Override
    public void save(UserProfile userProfile) {
        jpaRepo.save(profileMapper.toEntity(userProfile));
    }

    @Override
    public void saveNewUserProfile(UserProfile userProfile) {
        jpaRepo.save(profileMapper.toEntity(userProfile));
    }

    @Override
    public void update(UUID userId, UserProfile userProfile) {
        var dbUser = jpaRepo.findById(userId)
                .orElseThrow(() -> new RuntimeException("User profile not found."));
        dbUser.updateProperties(profileMapper.toEntity(userProfile));
        jpaRepo.save(dbUser);
    }

    @Override
    public UserProfile findById(String userId) {
        var dbUser = jpaRepo.findById(UUID.fromString(userId))
                .orElseThrow(()->new RuntimeException("User profile not found."));
        return profileMapper.toDomain(dbUser);
    }
}
