package com.anigame.event_services.rest.controller;

import com.anigame.event_services.data.dto.UserDataReqDTO;
import com.anigame.event_services.data.mapper.UserProfileMapper;
import com.anigame.event_services.domain.usecase.GetUserProfileUseCase;
import com.anigame.event_services.domain.usecase.UpdateUserProfileUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final GetUserProfileUseCase getUserProfile;
    private final UpdateUserProfileUseCase updateUserProfile;
    private final UserProfileMapper userProfileMapper;

    @PatchMapping("/profile")
    public ResponseEntity<?> updateUser (@RequestBody UserDataReqDTO req, @RequestHeader("Authorization") String authorizationHeader) {
        System.out.println(req);
        var updatedProfile = updateUserProfile.execute(authorizationHeader.replace("Bearer ",""), userProfileMapper.toDomain(req));
        return ResponseEntity.status(HttpStatus.OK).body(
                userProfileMapper.toDTO(updatedProfile)
        );
    }

    @GetMapping("/profile")
    public ResponseEntity<?> getProfile (@RequestHeader("Authorization") String authorizationHeader) {
        return ResponseEntity.status(HttpStatus.OK).body(
                userProfileMapper.toDTO(
                    getUserProfile.execute(authorizationHeader.replace("Bearer ",""))
                )
        );
    }
}
