package com.alex.spring_mvc.controller;

import com.alex.spring_mvc.controller.dto.AccountRequestDTO;
import com.alex.spring_mvc.controller.dto.accountResponseDTO;
import com.alex.spring_mvc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping(value = "/accounts/{id}", method = RequestMethod.GET)
    public accountResponseDTO getAccount(@PathVariable Long id) {
        return new accountResponseDTO(accountService.findAccountById(id));
    }

    @RequestMapping(value = "/accounts", method = RequestMethod.POST)
    public Long createAccount(@RequestBody AccountRequestDTO accountRequestDTO) {
        System.out.println("Hello");
        Long id = accountService.saveAccount(accountRequestDTO.getName(), accountRequestDTO.getEmail());
        return id;
    }
}
