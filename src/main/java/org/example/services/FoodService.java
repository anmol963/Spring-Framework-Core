package org.example.services;

import org.example.model.Restaurant;

public class FoodService {

    private Restaurant restaurant;
    private DeliveryService deliveryService;

    public FoodService(Restaurant restaurant, DeliveryService deliveryService) {
        this.restaurant = restaurant;
        this.deliveryService = deliveryService;
    }

    public void processOrder() {
        this.restaurant.prepareFood();
        this.deliveryService.startDelivery();
    }
}
