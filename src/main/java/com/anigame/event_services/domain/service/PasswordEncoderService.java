package com.anigame.event_services.domain.service;

public interface PasswordEncoderService {
    Boolean matches (String password, String encodedPassword);
    String encode (String password);
}
