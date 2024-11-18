package com.example.idontknowspring.repository;

import com.example.idontknowspring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
