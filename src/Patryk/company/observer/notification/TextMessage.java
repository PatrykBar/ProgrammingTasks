package Patryk.company.observer.notification;

import Patryk.company.observer.order.Order;

public class TextMessage implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("Text Message " + order.getOrderNumber() + " " + order.getOrderStatus());
    }
}
