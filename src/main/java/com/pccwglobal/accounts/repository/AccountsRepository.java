package com.pccwglobal.accounts.repository;

import com.pccwglobal.accounts.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends JpaRepository<Account, Long> {

    public Account findByUserName(String userName);

}
