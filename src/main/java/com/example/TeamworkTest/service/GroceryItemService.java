package com.example.TeamworkTest.service;

import com.example.TeamworkTest.model.GroceryItem;
import com.example.TeamworkTest.repo.GroceryItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroceryItemService {

    @Autowired
    private GroceryItemRepository itemRepository;

    public List<GroceryItem> getAllItems() {
        return itemRepository.findAll();
    }

    public GroceryItem getItemById(Long id) {
        Optional<GroceryItem> optionalItem = itemRepository.findById(id);
        return optionalItem.orElse(null);
    }

    public GroceryItem addItem(GroceryItem item) {
        return itemRepository.save(item);
    }

    public GroceryItem updateItem(Long id, GroceryItem updatedItem) {
        Optional<GroceryItem> optionalItem = itemRepository.findById(id);
        if (optionalItem.isPresent()) {
            GroceryItem existingItem = optionalItem.get();
            existingItem.setName(updatedItem.getName());
            existingItem.setQuantity(updatedItem.getQuantity());
            existingItem.setNotes(updatedItem.getNotes());
            return itemRepository.save(existingItem);
        } else {
            return null; // or throw an exception if needed
        }
    }

    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }

    // Add more methods as needed
}
