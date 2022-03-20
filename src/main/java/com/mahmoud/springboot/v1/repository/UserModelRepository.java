package com.mahmoud.springboot.v1.repository;

import com.mahmoud.springboot.v1.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserModelRepository extends JpaRepository<UserModel, Long> {
}