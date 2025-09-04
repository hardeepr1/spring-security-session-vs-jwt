package com.hsingh.sessionvsjwt.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.hsingh.sessionvsjwt.entity.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
