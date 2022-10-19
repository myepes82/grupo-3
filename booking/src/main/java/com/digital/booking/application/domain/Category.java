package com.digital.booking.application.domain;

import lombok.Builder;
import lombok.Value;

import java.time.LocalDate;

@Builder
@Value
public class Category {

    String name;

    Boolean status;

    LocalDate createdAt;
}
