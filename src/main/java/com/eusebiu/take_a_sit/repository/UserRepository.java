package com.eusebiu.take_a_sit.repository;

import com.eusebiu.take_a_sit.mapper.UserMapper;
import com.eusebiu.take_a_sit.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository implements CrudRepository<User>{
    private static final String selectQuery = "SELECT * FROM users";
    private static final String createQuery = "INSERT INTO users(first_name, last_name, mail, phone_number) VALUES(?, ?, ?, ?)";
    private static final String updateQuery = "UPDATE users SET first_name = ?, last_name = ?, mail = ?, phone_number = ? WHERE user_id = ?";
    private static final String deleteQuery = "DELETE FROM users WHERE user_id = ?";
    private static final String getByIdQuery = "SELECT * FROM users WHERE user_id = ?";
    private JdbcTemplate jdbcTemplate;

    public UserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int create(User user) {
        return jdbcTemplate.update(createQuery, user.getFirstName(), user.getLastName(), user.getMail(), user.getPhoneNumber());
    }

    @Override
    public List<User> readAll() {
        return jdbcTemplate.query(selectQuery, new UserMapper());
    }

    @Override
    public int update(User user, Long id) {
        return jdbcTemplate.update(updateQuery, user.getFirstName(), user.getLastName(), user.getMail(), user.getPhoneNumber(), id);
    }

    @Override
    public int delete(Long id) {
        return jdbcTemplate.update(deleteQuery, id);
    }

    @Override
    public Optional<User> readById(Long id) {
        return jdbcTemplate.query(getByIdQuery, new UserMapper(), id)
                .stream()
                .findFirst();
    }
}
