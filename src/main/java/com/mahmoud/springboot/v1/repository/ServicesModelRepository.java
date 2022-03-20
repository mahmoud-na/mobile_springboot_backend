package com.mahmoud.springboot.v1.repository;

import com.mahmoud.springboot.v1.models.ServicesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicesModelRepository extends JpaRepository<ServicesModel, Long> {
}