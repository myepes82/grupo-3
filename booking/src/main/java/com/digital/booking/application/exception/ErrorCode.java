package com.digital.booking.application.exception;

public enum ErrorCode {
    PROPERTY_TYPE_NOT_FOUND(ErrorConstants.PROPERTY_TYPE_NOT_FOUND);

    ErrorCode(String value) {}

    public static class ErrorConstants{
        private static final String PROPERTY_TYPE_NOT_FOUND = "The property type has not found;";
    }
}
