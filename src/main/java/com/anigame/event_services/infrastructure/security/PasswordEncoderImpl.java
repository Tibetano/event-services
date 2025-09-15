package com.anigame.event_services.infrastructure.security;

import com.anigame.event_services.domain.service.PasswordEncoderService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PasswordEncoderImpl implements PasswordEncoderService {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public Boolean matches(String password, String encodedPassword) {
        return bCryptPasswordEncoder.matches(password,encodedPassword);
    }

    @Override
    public String encode(String password) {
        return bCryptPasswordEncoder.encode(password);
    }
}
