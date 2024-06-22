package com.pccwglobal.accounts.controller;

import com.pccwglobal.accounts.constants.HttpResponseConstants;
import com.pccwglobal.accounts.dto.AccountDto;
import com.pccwglobal.accounts.dto.ErrorResponseDto;
import com.pccwglobal.accounts.dto.ResponseDto;
import com.pccwglobal.accounts.exception.UsernameAlreadyExistsException;
import com.pccwglobal.accounts.service.AccountsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api", produces={MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class AccountsController {

    private AccountsService accountsService;

    @PostMapping("/account")
    public ResponseEntity<ResponseDto> registerAccount(@RequestBody AccountDto accountDto) {
        accountsService.createAccount(accountDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(HttpResponseConstants.STATUS_201, HttpResponseConstants.MESSAGE_201));
    }

}
