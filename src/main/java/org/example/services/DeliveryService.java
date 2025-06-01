package org.example.services;

import org.example.model.DeliveryBoy;

public class DeliveryService {

    private DeliveryBoy deliveryBoy;

    public void setDeliveryBoy(DeliveryBoy deliveryBoy) {
        this.deliveryBoy = deliveryBoy;
    }

    public void startDelivery() {
        this.deliveryBoy.deliver();
    }
}
