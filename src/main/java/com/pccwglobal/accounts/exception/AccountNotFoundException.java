package com.pccwglobal.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class AccountNotFoundException extends RuntimeException{

    public AccountNotFoundException(List<String> userNames) {
        super("No accounts found for usernames: " + userNames);
    }

}
