package com.anigame.event_services.data.mapper;

import com.anigame.event_services.data.dto.UserDataReqDTO;
import com.anigame.event_services.domain.model.UserProfile;
import com.anigame.event_services.domain.model.enumerate.UserGender;
import com.anigame.event_services.infrastructure.persistence.user_profile.UserGenderEntity;
import com.anigame.event_services.infrastructure.persistence.user_profile.UserProfileEntity;
import org.springframework.stereotype.Component;

@Component
public class UserProfileMapper {

    public UserProfile toDomain (UserProfileEntity entity) {
        return UserProfile.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .cpf(entity.getCpf())
                .phoneNumber(entity.getPhoneNumber())
                .gender(UserGender.valueOf(entity.getGender().name()))
                .dateOfBirth(entity.getDateOfBirth())
                .createdAt(entity.getCreatedAt())
                .updatedAt(entity.getUpdatedAt())
                .build();
    }

    public UserProfile toDomain (UserDataReqDTO userData) {
        return UserProfile.builder()
                .firstName(userData.firstName())
                .lastName(userData.lastName())
                .phoneNumber(userData.phoneNumber())
                .gender(UserGender.valueOf(userData.gender()))
                .dateOfBirth(userData.dateOfBirth())
                .build();
    }

    public UserProfileEntity toEntity (UserProfile profile) {
        return UserProfileEntity.builder()
                .id(profile.getId())
                .firstName(profile.getFirstName())
                .lastName(profile.getLastName())
                .cpf(profile.getCpf())
                .phoneNumber(profile.getPhoneNumber())
                .gender(UserGenderEntity.valueOf(profile.getGender().name()))
                .dateOfBirth(profile.getDateOfBirth())
                .createdAt(profile.getCreatedAt())
                .updatedAt(profile.getUpdatedAt())
                .build();
    }
}
