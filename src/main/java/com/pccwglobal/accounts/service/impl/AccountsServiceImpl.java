package com.pccwglobal.accounts.service.impl;

import com.pccwglobal.accounts.dto.AccountDto;
import com.pccwglobal.accounts.entity.Account;
import com.pccwglobal.accounts.exception.AccountNotFoundException;
import com.pccwglobal.accounts.exception.UsernameAlreadyExistsException;
import com.pccwglobal.accounts.repository.AccountsRepository;
import com.pccwglobal.accounts.service.AccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements AccountsService {

    private AccountsRepository accountsRepository;

    @Override
    public void createAccount(AccountDto accountDto) {

        Account existUserName = accountsRepository.findByUserName(accountDto.getUserName());
        if (existUserName != null) {
            throw new UsernameAlreadyExistsException("Username already exists: " + accountDto.getUserName());
        }

        Account newAccount = new Account();
        newAccount.setUserName(accountDto.getUserName());
        newAccount.setFirstName(accountDto.getFirstName());
        newAccount.setLastName(accountDto.getLastName());
        newAccount.setEmail(accountDto.getEmail());
        newAccount.setDateCreated(LocalDateTime.now());
        newAccount.setIsDeleted(false);

        accountsRepository.save(newAccount);
    }

    @Override
    public List<Account> getAccounts(List<String> userNames) {
        List<Account> accounts = accountsRepository.findAllByUserNameInAndIsDeletedFalse(userNames);
        if (accounts.isEmpty()) {
            throw new AccountNotFoundException(userNames);
        }
        return accounts;
    }

    @Override
    @Transactional
    public void updateAccounts(List<AccountDto> accountsDto) {
        Account account;
        for (AccountDto accountDto : accountsDto) {
            account = accountsRepository.findByUserName(accountDto.getUserName());

            if (account == null) {
                throw new AccountNotFoundException(accountDto.getUserName());
            }

            account.setFirstName(accountDto.getFirstName());
            account.setLastName(accountDto.getLastName());
            account.setEmail(accountDto.getEmail());
            account.setDateModified(LocalDateTime.now());

            accountsRepository.save(account);
        }
    }

    @Override
    @Transactional
    public void deleteAccounts(List<String> userNames) {
        List<Account> accounts = accountsRepository.findAllByUserNameInAndIsDeletedFalse(userNames);
        for (Account account : accounts) {
            account.setIsDeleted(true);
            account.setDateDeleted(LocalDateTime.now());
            accountsRepository.save(account);
        }
    }
}
