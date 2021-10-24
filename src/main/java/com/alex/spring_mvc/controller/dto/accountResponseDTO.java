package com.alex.spring_mvc.controller.dto;

import com.alex.spring_mvc.entity.Account;

public class accountResponseDTO {

    private Long id;

    private String name;

    private String email;

    public accountResponseDTO(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public accountResponseDTO(Account account) {
        id = account.getId();
        name = account.getName();
        email = account.getEmail();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
