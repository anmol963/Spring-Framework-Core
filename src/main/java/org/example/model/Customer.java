package org.example.model;

import org.example.services.FoodService;

public class Customer {

    private FoodService foodService;

    // Setter Injection
    public void setFoodService(FoodService foodService) {
        this.foodService = foodService;
    }

    public void placeOrder() {
        System.out.println("Customer placed an order!");
        foodService.processOrder();
    }
}
