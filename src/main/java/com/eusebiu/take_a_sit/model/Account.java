package com.eusebiu.take_a_sit.model;

public class Account {
    private Long accountId;
    private Long userId;
    private String accountType;
    private String username;
    private String password;

    public Account() {
    }

    public Account(Long accountId, Long userId, String accountType, String username, String password) {
        this.accountId = accountId;
        this.userId = userId;
        this.accountType = accountType;
        this.username = username;
        this.password = password;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
