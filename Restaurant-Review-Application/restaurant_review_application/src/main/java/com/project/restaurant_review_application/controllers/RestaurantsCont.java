package com.project.restaurant_review_application.controllers;

import com.project.restaurant_review_application.models.Restaurant;
import com.project.restaurant_review_application.Services.RestaurantServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;




import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantsCont {

    @Autowired
    private RestaurantServices restaurantService;

    @PostMapping
    public ResponseEntity<Restaurant> addRestaurant(@RequestBody Restaurant restaurant) {
        Restaurant newRestaurant = restaurantService.addRestaurant(restaurant);
        return new ResponseEntity<>(newRestaurant, HttpStatus.CREATED);
    }

    @PutMapping("/id/{id}")
    public ResponseEntity<Restaurant> updateRestaurantById(@PathVariable Integer id, @RequestBody Restaurant restaurantDetails) {
        Restaurant updatedRestaurant = restaurantService.updateRestaurant(id, restaurantDetails);
        return new ResponseEntity<>(updatedRestaurant, HttpStatus.OK);
    }

    @PutMapping("/name/{name}")
    public ResponseEntity<Restaurant> updateRestaurantByName(@PathVariable String name, @RequestBody Restaurant restaurantDetails) {
        Restaurant updatedRestaurant = restaurantService.updateRestaurantByName(name, restaurantDetails);
        return new ResponseEntity<>(updatedRestaurant, HttpStatus.OK);
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<Void> deleteRestaurantById(@PathVariable Integer id) {
        restaurantService.deleteRestaurantById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/name/{name}")
    public ResponseEntity<Void> deleteRestaurantByName(@PathVariable String name) {
        restaurantService.deleteRestaurantByName(name);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Restaurant> getRestaurantById(@PathVariable Integer id) {
        Restaurant restaurant = restaurantService.getRestaurantById(id);
        return new ResponseEntity<>(restaurant, HttpStatus.OK);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Restaurant> getRestaurantByName(@PathVariable String name) {
        Restaurant restaurant = restaurantService.getRestaurantByName(name);
        return new ResponseEntity<>(restaurant, HttpStatus.OK);
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<Restaurant>> getRestaurantsByCategory(@PathVariable String category) {
        List<Restaurant> restaurants = restaurantService.getRestaurantsByCategory(category);
        return new ResponseEntity<>(restaurants, HttpStatus.OK);
    }
}