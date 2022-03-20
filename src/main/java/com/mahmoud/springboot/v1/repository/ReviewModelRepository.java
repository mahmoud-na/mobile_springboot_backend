package com.mahmoud.springboot.v1.repository;

import com.mahmoud.springboot.v1.models.ReviewModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewModelRepository extends JpaRepository<ReviewModel, Long> {
}