package com.pccwglobal.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class ErrorResponseDto {

    private String api;
    private HttpStatus errorCode;
    private String errorMessage;

}
