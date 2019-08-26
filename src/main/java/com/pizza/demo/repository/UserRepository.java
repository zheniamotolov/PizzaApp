package com.pizza.demo.repository;

import com.pizza.demo.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository< User,Long> {
    User findByUsername(String username);
}
