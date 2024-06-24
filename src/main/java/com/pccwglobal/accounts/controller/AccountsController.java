package com.pccwglobal.accounts.controller;

import com.pccwglobal.accounts.constants.HttpResponseConstants;
import com.pccwglobal.accounts.dto.AccountDto;
import com.pccwglobal.accounts.dto.ResponseDto;
import com.pccwglobal.accounts.entity.Account;
import com.pccwglobal.accounts.service.AccountsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(
        name = "APIs for Accounts Service",
        description = "APIs for creating, updating, fetching, and deleting accounts."
)
@RestController
@RequestMapping(path="/api", produces={MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
@Validated
public class AccountsController {

    private AccountsService accountsService;

    @Operation(
            summary = "Create Account",
            description = "API to create a new account."
    )
    @PostMapping("/account")
    public ResponseEntity<ResponseDto> registerAccount(@Valid @RequestBody AccountDto accountDto) {
        accountsService.createAccount(accountDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(HttpResponseConstants.STATUS_201, HttpResponseConstants.MESSAGE_201));
    }

    @Operation(
            summary = "Fetch Account Details",
            description = "API to fetch account details of one or more users."
    )
    @PostMapping("/account/details")
    public ResponseEntity<List<Account>> getAccounts(@RequestBody List<String> userNames) {
        List<Account> accounts = accountsService.getAccounts(userNames);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(accounts);
    }

    @Operation(
            summary = "Update Account Details",
            description = "API to update account details of one or more users."
    )
    @PutMapping("/account")
    public ResponseEntity<ResponseDto> updateAccounts(@Valid @RequestBody List<AccountDto> accountsDto) {
        accountsService.updateAccounts(accountsDto);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new ResponseDto(HttpResponseConstants.STATUS_200, HttpResponseConstants.MESSAGE_200));
    }

    @Operation(
            summary = "Delete Account",
            description = "API to delete an account of one or more users."
    )
    @DeleteMapping("/account")
    public ResponseEntity<ResponseDto> deleteAccounts(@RequestBody List<String> userNames) {
        accountsService.deleteAccounts(userNames);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new ResponseDto(HttpResponseConstants.STATUS_200, HttpResponseConstants.MESSAGE_200));
    }

}
