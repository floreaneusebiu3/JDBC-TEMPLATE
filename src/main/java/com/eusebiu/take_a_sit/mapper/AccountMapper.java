package com.eusebiu.take_a_sit.mapper;

import com.eusebiu.take_a_sit.model.Account;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountMapper implements RowMapper<Account> {
    @Override
    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
        Account account = new Account();
        account.setAccountId(rs.getLong("account_id"));
        account.setUserId(rs.getLong("user_id"));
        account.setAccountType(rs.getString("account_type"));
        account.setUsername(rs.getString("username"));
        account.setPassword(rs.getString("password"));
        return account;
    }
}
