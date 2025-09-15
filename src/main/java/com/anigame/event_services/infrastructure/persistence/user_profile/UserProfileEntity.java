package com.anigame.event_services.infrastructure.persistence.user_profile;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "tb_user_profiles", schema = "event_services")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserProfileEntity {
    @Id
    @Column(updatable = false, nullable = false)
    private UUID id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "cpf", unique = true, nullable = false)
    private String cpf;
    @Column(name = "phone_number", unique = true, nullable = false)
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    @Column(name = "gender", nullable = false)
    private UserGenderEntity gender;
    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;
    @Column(name = "created_at", nullable = false)
    private Instant createdAt;
    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;

    public void updateProperties (UserProfileEntity userData){
        this.setFirstName(userData.getFirstName() != null ? userData.getFirstName() : this.getFirstName());
        this.setLastName(userData.getLastName() != null ? userData.getLastName() : this.getLastName());
        this.setPhoneNumber(userData.getPhoneNumber() != null ? userData.getPhoneNumber() : this.getPhoneNumber());
        this.setGender(userData.getGender() != null ? userData.getGender() : this.getGender());
        this.setDateOfBirth(userData.getDateOfBirth() != null ? userData.getDateOfBirth() : this.getDateOfBirth());
        this.setUpdatedAt(userData.getUpdatedAt() != null ? userData.getUpdatedAt() : this.getUpdatedAt());
    }
}
