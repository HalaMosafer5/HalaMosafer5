package com.project.restaurant_review_application.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.restaurant_review_application.models.Restaurant;
import java.util.Optional;

@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant, Integer> {
    List<Restaurant> findByCategoryIgnoreCase(String category);
    Optional<Restaurant> findById(Integer id);  // This method is already defined in JpaRepository
    Optional<Restaurant> findByName(String name);  // Changed return type to Optional
}
