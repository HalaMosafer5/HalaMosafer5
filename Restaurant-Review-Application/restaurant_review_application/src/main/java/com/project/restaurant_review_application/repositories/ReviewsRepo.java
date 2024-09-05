package com.project.restaurant_review_application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.restaurant_review_application.models.Reviews;

@Repository
public interface ReviewsRepo extends JpaRepository<Reviews, Integer> {
    // Add custom query methods if needed
}