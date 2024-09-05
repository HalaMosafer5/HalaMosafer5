package com.project.restaurant_review_application.Services;

import com.project.restaurant_review_application.models.Restaurant;
import com.project.restaurant_review_application.repositories.RestaurantRepo;
import com.project.restaurant_review_application.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServices {

    @Autowired
    private RestaurantRepo restaurantRepo;

    // Add a new restaurant
    public Restaurant addRestaurant(Restaurant restaurant) {
        return restaurantRepo.save(restaurant);
    }

    // Update a restaurant by ID
    public Restaurant updateRestaurant(Integer id, Restaurant restaurantDetails) {
        Restaurant restaurant = restaurantRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Restaurant not found with ID " + id));
        
        restaurant.setName(restaurantDetails.getName());
        restaurant.setAddress(restaurantDetails.getAddress());
        restaurant.setCategory(restaurantDetails.getCategory());
        restaurant.setCuisineType(restaurantDetails.getCuisineType());
        restaurant.setContactInfo(restaurantDetails.getContactInfo());
        restaurant.setRate(restaurantDetails.getRate());
        restaurant.setImageUrl(restaurantDetails.getImageUrl());
        restaurant.setOpeningHours(restaurantDetails.getOpeningHours());
        
        return restaurantRepo.save(restaurant);
    }

    // Update a restaurant by name
    public Restaurant updateRestaurantByName(String name, Restaurant restaurantDetails) {
        Restaurant restaurant = restaurantRepo.findByName(name)
                .orElseThrow(() -> new ResourceNotFoundException("Restaurant not found with name " + name));
        
        restaurant.setName(restaurantDetails.getName());
        restaurant.setAddress(restaurantDetails.getAddress());
        restaurant.setCategory(restaurantDetails.getCategory());
        restaurant.setCuisineType(restaurantDetails.getCuisineType());
        restaurant.setContactInfo(restaurantDetails.getContactInfo());
        restaurant.setRate(restaurantDetails.getRate());
        restaurant.setImageUrl(restaurantDetails.getImageUrl());
        restaurant.setOpeningHours(restaurantDetails.getOpeningHours());
        
        return restaurantRepo.save(restaurant);
    }

    // Delete a restaurant by ID
    public void deleteRestaurantById(Integer id) {
        Restaurant restaurant = restaurantRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Restaurant not found with ID " + id));
        restaurantRepo.delete(restaurant);
    }

    // Delete a restaurant by name
    public void deleteRestaurantByName(String name) {
        Restaurant restaurant = restaurantRepo.findByName(name)
                .orElseThrow(() -> new ResourceNotFoundException("Restaurant not found with name " + name));
        restaurantRepo.delete(restaurant);
    }

    // Get a restaurant by ID
    public Restaurant getRestaurantById(Integer id) {
        return restaurantRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Restaurant not found with ID " + id));
    }

    // Get a restaurant by name
    public Restaurant getRestaurantByName(String name) {
        return restaurantRepo.findByName(name)
                .orElseThrow(() -> new ResourceNotFoundException("Restaurant not found with name " + name));
    }

    // Get restaurants by category
    public List<Restaurant> getRestaurantsByCategory(String category) {
        return restaurantRepo.findByCategoryIgnoreCase(category);
    }
}