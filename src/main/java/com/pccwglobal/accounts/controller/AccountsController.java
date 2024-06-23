package com.pccwglobal.accounts.controller;

import com.pccwglobal.accounts.constants.HttpResponseConstants;
import com.pccwglobal.accounts.dto.AccountDto;
import com.pccwglobal.accounts.dto.ResponseDto;
import com.pccwglobal.accounts.entity.Account;
import com.pccwglobal.accounts.service.AccountsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping("/account/details")
    public ResponseEntity<List<Account>> getAccounts(@RequestBody List<String> userNames) {
        List<Account> accounts = accountsService.getAccounts(userNames);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(accounts);
    }

    @PutMapping("/account")
    public ResponseEntity<ResponseDto> updateAccount(@RequestBody List<AccountDto> accountsDto) {
        accountsService.updateAccounts(accountsDto);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new ResponseDto(HttpResponseConstants.STATUS_200, HttpResponseConstants.MESSAGE_200));
    }

}
