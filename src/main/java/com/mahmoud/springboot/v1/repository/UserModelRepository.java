package com.mahmoud.springboot.v1.repository;

import com.mahmoud.springboot.v1.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserModelRepository extends JpaRepository<UserModel, Long> {
//    @Query(" select DISTINCT generatedAlias0 from UserModel as generatedAlias0 select usermodel0_.user_id as user_id1_18_ from user usermodel0_ select reviews0_.user_id as user_id6_15_0_,reviews0_.review_id as review_i1_15_0_,reviews0_.review_id as review_i1_15_1_,reviews0_.restaurant_id as restaura5_15_1_,reviews0_.review_comment as review_c2_15_1_,reviews0_.review_date as review_d3_15_1_,reviews0_.review_rate as review_r4_15_1_,reviews0_.user_id as user_id6_15_1_,restaurant1_.restaurant_id as restaura1_14_2_,restaurant1_.restaurant_closing_time as restaura2_14_2_,restaurant1_.restaurant_cover_image as restaura3_14_2_,restaurant1_.restaurant_description as restaura4_14_2_,restaurant1_.restaurant_hotline as restaura5_14_2_,restaurant1_.restaurant_logo_image as restaura6_14_2_,restaurant1_.restaurant_name as restaura7_14_2_,restaurant1_.restaurant_opening_time as restaura8_14_2_,restaurant1_.restaurant_viewers as restaura9_14_2_ from   review reviews0_ inner join restaurants restaurant1_  on reviews0_.restaurant_id=restaurant1_.restaurant_id where reviews0_.user_id=?")
//    @Query("select distinct generatedAlias0 from UserModel as generatedAlias0")
//    List<UserModel> getallusers();



}