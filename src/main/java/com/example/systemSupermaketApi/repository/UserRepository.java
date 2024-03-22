package com.example.systemSupermaketApi.repository;

import com.example.systemSupermaketApi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findById(long id);
}
