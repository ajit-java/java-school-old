package com.example;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by ajit on 29.10.15.
 */
@ControllerAdvice
public class ContAdvice {

    @ExceptionHandler
    @ResponseStatus(HttpStatus.CONFLICT)
    @ResponseBody
    public Exception handleExpertForumException(Exception exception) {
        LoggerFactory.getLogger(exception.getClass()).error(exception.getMessage(),exception);
        return exception;
    }
}
