package com.alex.spring_mvc.service;

import com.alex.spring_mvc.entity.Account;
import com.alex.spring_mvc.repository.AccountRepository;

public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Long saveAccount(String name, String email) {
        return accountRepository.save(new Account(name, email)).getId();
    }

    public Account findAccountById(Long id) {
        return accountRepository.findOne(id);
    }
}
