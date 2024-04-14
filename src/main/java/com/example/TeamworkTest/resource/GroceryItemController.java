package com.example.TeamworkTest.resource;

import com.example.TeamworkTest.model.GroceryItem;
import com.example.TeamworkTest.service.GroceryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class GroceryItemController {

    @Autowired
    private GroceryItemService itemService;

    @GetMapping
    public List<GroceryItem> getAllItems() {
        return itemService.getAllItems();
    }

    @GetMapping("/{id}")
    public GroceryItem getItemById(@PathVariable Long id) {
        return itemService.getItemById(id);
    }

    @PostMapping
    public GroceryItem addItem(@RequestBody GroceryItem item) {
        return itemService.addItem(item);
    }

    @PutMapping("/{id}")
    public GroceryItem updateItem(@PathVariable Long id, @RequestBody GroceryItem item) {
        return itemService.updateItem(id, item);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        itemService.deleteItem(id);
    }
}
