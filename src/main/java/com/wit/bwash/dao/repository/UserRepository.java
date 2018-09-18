package com.wit.bwash.dao.repository;

import com.wit.bwash.dao.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
