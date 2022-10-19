package com.digital.booking.application.domain;


import com.digital.booking.application.domain.enums.PropertyType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Property {

    private String name;

    private String description;

    private String location;

    private PropertyType propertyType;
}
