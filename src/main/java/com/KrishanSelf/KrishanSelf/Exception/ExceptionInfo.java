package com.KrishanSelf.KrishanSelf.Exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

@Data
public class ExceptionInfo
{
    private String message;

    private HttpStatus httpStatus;

    private ZonedDateTime zonedDateTime;

    public ExceptionInfo(String message, HttpStatus httpStatus, ZonedDateTime zonedDateTime) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.zonedDateTime = zonedDateTime;
    }
}
