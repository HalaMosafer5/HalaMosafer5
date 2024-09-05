package com.project.restaurant_review_application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.restaurant_review_application.models.Users;

@Repository
public interface UsersRepo extends JpaRepository<Users, Integer> {
    // Add custom query methods if needed
}