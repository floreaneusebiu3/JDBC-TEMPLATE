package com.eusebiu.take_a_sit.repository;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T> {
    int create(T t);
    List<T> readAll();
    int update(T t, Long id);
    int delete(Long id);
    Optional<T> readById(Long id);
}
