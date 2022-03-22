package com.mahmoud.springboot.v1.repository;

import com.mahmoud.springboot.v1.models.RestaurantModel;
import com.mahmoud.springboot.v1.models.ReviewModel;
import com.mahmoud.springboot.v1.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewModelRepository extends JpaRepository<ReviewModel, Long> {
    List<ReviewModel> findByRestaurant(RestaurantModel restaurant);
    List<ReviewModel> findByUser(UserModel user);

}