package com.mahmoud.springboot.v1.repository;

import com.mahmoud.springboot.v1.models.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryModelRepository extends JpaRepository<CategoryModel, Long> {

}