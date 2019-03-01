package com.lambdaschool.bookstore.repositories;

import com.lambdaschool.bookstore.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
