package com.pccwglobal.accounts.service;

import com.pccwglobal.accounts.dto.AccountDto;
import com.pccwglobal.accounts.entity.Account;

import java.util.List;

public interface AccountsService {

    void createAccount(AccountDto accountDto);

    List<Account> getAccounts(List<String> userNames);

    void updateAccounts(List<AccountDto> accountsDto);

    void deleteAccounts(List<String> userNames);

}
