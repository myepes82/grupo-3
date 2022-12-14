package com.digital.booking.application.domain;

import lombok.Builder;
import lombok.Value;

import java.time.LocalDate;

@Builder
@Value
public class User {

    String name;
    String lastName;
    String email;
    String password;
    Boolean status;
    LocalDate birthDate;
    LocalDate createdAt;
    LocalDate updatedAt;
}
