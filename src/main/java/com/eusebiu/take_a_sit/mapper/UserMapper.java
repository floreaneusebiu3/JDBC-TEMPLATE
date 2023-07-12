package com.eusebiu.take_a_sit.mapper;

import com.eusebiu.take_a_sit.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setUserId(rs.getLong("user_id"));
        user.setFirstName(rs.getString("first_name"));
        user.setLastName(rs.getString("last_name"));
        user.setMail(rs.getString("mail"));
        user.setPhoneNumber(rs.getString("phone_number"));
        return user;
    }
}
