package com.eusebiu.take_a_sit.repository;

import com.eusebiu.take_a_sit.model.Account;

import java.util.List;
import java.util.Optional;

public class AccountRepository implements CrudRepository<Account>{
    @Override
    public int create(Account account) {
        return 0;
    }

    @Override
    public List<Account> readAll() {
        return null;
    }

    @Override
    public int update(Account account, Long id) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public Optional<Account> readById(Long id) {
        return Optional.empty();
    }
}
