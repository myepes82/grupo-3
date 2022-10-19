package com.digital.booking.application.domain.enums;

import com.digital.booking.application.exception.BusinessException;
import com.digital.booking.application.exception.ErrorCode;

import java.util.Arrays;

public enum PropertyType {

    DEPARTMENT("DEPARMENT", "Departamento"),
    HOUSE("HOUSE", "Casa");

    private String internalName;
    private String name;

    PropertyType(String internalName, String name){
        this.internalName = internalName;
        this.name = name;
    }

    public static PropertyType getByName(String name){
        return Arrays.stream(PropertyType.values()).filter(propertyType -> propertyType.name.equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() -> {throw new BusinessException(ErrorCode.PROPERTY_TYPE_NOT_FOUND);
                });
    }

    public String getInternalName(){return this.internalName;}
}
