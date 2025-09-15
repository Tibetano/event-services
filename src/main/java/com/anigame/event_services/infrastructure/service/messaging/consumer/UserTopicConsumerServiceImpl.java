package com.anigame.event_services.infrastructure.service.messaging.consumer;

import com.anigame.event_services.domain.model.UserProfile;
import com.anigame.event_services.domain.persistence.UserProfileRepository;
import com.anigame.event_services.domain.service.UserTopicConsumerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class UserTopicConsumerServiceImpl implements UserTopicConsumerService {

    private final UserProfileRepository userProfileRepository;
    private final ObjectMapper objectMapper;

    @KafkaListener(
            topics = "${topics.register-user}",
            groupId = "register-user-consumer-1"
    )
    public void consume (String message) {
        System.out.println("<<=== MENSAGEM RECEBIDA ===>>> \n" + message);
        try {
            var shippingData = objectMapper.readValue(message, UserProfile.class);
            shippingData.setCreatedAt(Instant.now());
            shippingData.setUpdatedAt(Instant.now());
            System.out.println(shippingData);
            userProfileRepository.saveNewUserProfile(shippingData);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
