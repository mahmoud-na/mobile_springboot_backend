package com.mahmoud.springboot.v1.repository;

import com.mahmoud.springboot.v1.models.NewsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsModelRepository extends JpaRepository<NewsModel, Long> {
}