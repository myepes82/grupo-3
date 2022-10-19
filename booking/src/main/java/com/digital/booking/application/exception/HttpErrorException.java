package com.digital.booking.application.exception;

import com.digital.booking.application.exception.model.ErrorObjectModel;

import java.util.Map;

public class HttpErrorException extends RuntimeException{
    private final ErrorObjectModel errorObject;


    public HttpErrorException(int httpStatus, ErrorCode errorCode) {
        this.errorObject = ErrorObjectModel.builder()
                .httpStatus(httpStatus)
                .code(errorCode)
                .build();
    }

    public HttpErrorException(int httpStatus, ErrorCode errorCode, Map<String, String> fields) {
        this.errorObject = ErrorObjectModel.builder()
                .httpStatus(httpStatus)
                .code(errorCode)
                .fields(fields)
                .build();
    }

    public ErrorObjectModel getErrorObject(){return this.errorObject;}
}
