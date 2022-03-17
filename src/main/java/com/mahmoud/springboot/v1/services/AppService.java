package com.mahmoud.springboot.v1.services;

import com.mahmoud.springboot.v1.models.BranchModel;
import com.mahmoud.springboot.v1.models.RestaurantModel;
import com.mahmoud.springboot.v1.models.ServicesModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AppService {


    List<String> phones = new ArrayList<>(Arrays.asList("01151742505", "01023104355"));

    List<ServicesModel> services = new ArrayList<>(
            Arrays.asList(
                    new ServicesModel(1, "Wifi"),
                    new ServicesModel(2, "Open-Air"),
                    new ServicesModel(3, "In-Door"),
                    new ServicesModel(4, "PlayStation")
            ));


    List<BranchModel> branches = new ArrayList<>(
//            Arrays.asList(
//                    new BranchModel(123, "0123456789", "Masr El gdeda", services),
//                    new BranchModel(124, "6164664464", "Nasr City", services),
//                    new BranchModel(125, "9655478123", "Banha", services)
//            )
    );


    List<String> restaurantImages = new ArrayList<>(Arrays.asList(
            "restaurantImage--1",
            "restaurantImage--2",
            "restaurantImage--3",
            "restaurantImage--4"

    ));


    List<String> restaurantMenuImages = new ArrayList<>(
            Arrays.asList(
                    "restaurantMenuImage--1",
                    "restaurantMenuImage--2",
                    "restaurantMenuImage--3",
                    "restaurantMenuImage--4"
            ));


    List<RestaurantModel> restaurants = new ArrayList<>(
//            Arrays.asList(
//                    new RestaurantModel(
//                            0, "KFC",
//                            phones,
//                            branches,
//                            restaurantImages,
//                            restaurantMenuImages,
//                            "restaurantLogoImage",
//                            "10:15 am",
//                            "12:15 am",
//                            "mat3am lle btates el m7amra we el fra5 el 4a2ya",
//                            "55555",
//                            12500
//                    ),
//                    new RestaurantModel(
//                            1, "Syed Hanfy",
//                            phones,
//                            branches,
//                            restaurantImages,
//                            restaurantMenuImages,
//                            "restaurantLogoImage",
//                            "10:15 am",
//                            "12:15 am",
//                            "A7la mat3am ko4ary fe masr",
//                            "44444",
//                            15987
//                    ),
//                    new RestaurantModel(
//                            2, "BurgerKing",
//                            phones,
//                            branches,
//                            restaurantImages,
//                            restaurantMenuImages,
//                            "restaurantLogoImage",
//                            "10:15 am",
//                            "12:15 am",
//                            "El burgraya el 4a2ya el kombo large Burger",
//                            "3333",
//                            5000
//                    ),
//                    new RestaurantModel(
//                            3, "7ader moot 3anter",
//                            phones,
//                            branches,
//                            restaurantImages,
//                            restaurantMenuImages,
//                            "restaurantLogoImage",
//                            "10:15 am",
//                            "12:15 am",
//                            "a7la mn mat3am el prince 5od balak",
//                            "2222",
//                            12500
//                    )
//            )
    );


    public List<RestaurantModel> getAllRestaurants() {
        return restaurants;
    }


    public RestaurantModel getById(int id) {
        for (RestaurantModel restaurant : restaurants) {
            if (restaurant.getRestaurantId() == id) {
                return restaurant;
            }
        }
        return null;
    }


    public boolean addRestaurant(RestaurantModel restaurant) {
         return restaurants.add(restaurant);
    }

    public boolean deleteRestaurant(int id){
        for (RestaurantModel restaurant : restaurants) {
            if (restaurant.getRestaurantId() == id) {
                return restaurants.remove(restaurant);
            }
        }
        return false;
    }
}
