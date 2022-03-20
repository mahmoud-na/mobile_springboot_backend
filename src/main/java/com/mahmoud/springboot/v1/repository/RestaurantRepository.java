package com.mahmoud.springboot.v1.repository;

import com.mahmoud.springboot.v1.models.RestaurantModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantModel,Long> {

}
