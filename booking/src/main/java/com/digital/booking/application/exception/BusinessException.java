package com.digital.booking.application.exception;

import org.springframework.http.HttpStatus;

public class BusinessException extends HttpErrorException{

    private static final Integer BAD_REQUEST_CODE = 400;
    public BusinessException(ErrorCode errorCode) {
        super(BAD_REQUEST_CODE, errorCode);
    }
}
