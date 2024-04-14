package com.example.TeamworkTest.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@NoArgsConstructor
public class GroceryItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private int quantity;
    private String notes;


    // Constructor with arguments
    public GroceryItem(String name, int quantity, String notes) {
        this.name = name;
        this.quantity = quantity;
        this.notes = notes;
    }


    @Override
    public String toString() {
        return "GroceryItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", notes='" + notes + '\'' +
                '}';
    }
}
