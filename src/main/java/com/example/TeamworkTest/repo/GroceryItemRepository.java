package com.example.TeamworkTest.repo;

import com.example.TeamworkTest.model.GroceryItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroceryItemRepository extends JpaRepository<GroceryItem, Long> {
}
