package com.anigame.event_services.data.mapper;

import com.anigame.event_services.data.dto.UserDataReqDTO;
import com.anigame.event_services.data.dto.UserProfileResDTO;
import com.anigame.event_services.domain.model.UserProfile;
import com.anigame.event_services.domain.model.enumerate.UserGender;
import com.anigame.event_services.infrastructure.persistence.user_profile.UserGenderEntity;
import com.anigame.event_services.infrastructure.persistence.user_profile.UserProfileEntity;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class UserProfileMapper {

    public UserProfileResDTO toDTO (UserProfile profile) {
        return UserProfileResDTO.builder()
                .firstName(profile.getFirstName())
                .lastName(profile.getLastName())
                .cpf(profile.getCpf())
                .gender(profile.getGender().toString())
                .dateOfBirth(profile.getDateOfBirth().toString())
                .createdAt(profile.getCreatedAt())
                .build();
    }

    public UserProfile toDomain (UserProfileEntity entity) {
        return UserProfile.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .cpf(entity.getCpf())
                .phoneNumber(entity.getPhoneNumber())
                .gender(entity.getGender() != null ? UserGender.valueOf(entity.getGender().name()) : null)
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
                .gender(userData.gender() != null ? UserGender.valueOf(userData.gender()) : null)
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
                .gender(profile.getGender() != null ? UserGenderEntity.valueOf(profile.getGender().name()) : null)
                .dateOfBirth(profile.getDateOfBirth())
                .createdAt(profile.getCreatedAt())
                .updatedAt(profile.getUpdatedAt())
                .build();
    }
}
