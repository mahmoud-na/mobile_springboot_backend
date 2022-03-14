package com.mahmoud.springboot.v1.controllers;

import com.mahmoud.springboot.v1.models.RestaurantModel;

import com.mahmoud.springboot.v1.services.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/restaurants/v1")
public class AppController {

    @Autowired
    private AppService appService;

    @GetMapping(value = {"/", ""})
    public List<RestaurantModel> getAllRestaurants() {
        return appService.getAllRestaurants();
    }

    @GetMapping("/{id}")
    public RestaurantModel getRestaurantById(@PathVariable int id) {
        return appService.getById(id);
    }


    @PostMapping(value = {"", "/"})
    public RestaurantModel createNewRestaurant(@RequestBody RestaurantModel restaurant) {
        if (appService.addRestaurant(restaurant)) {
            return restaurant;
        }
        return null;
    }
    @DeleteMapping(value = "/{id}")
    public void deleteRestaurant(@PathVariable int id){
        appService.deleteRestaurant(id);
    }
}
