package com.borapapila.the_papila_bank.repository;

import com.borapapila.the_papila_bank.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Boolean existsByEmail(String email);
}
