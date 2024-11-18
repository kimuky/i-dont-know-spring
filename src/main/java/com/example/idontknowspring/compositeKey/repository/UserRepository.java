package com.example.idontknowspring.compositeKey.repository;

import com.example.idontknowspring.compositeKey.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
