package Patryk.company.observer.notification;

import Patryk.company.observer.order.Order;

public class Email implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("Email " + order.getOrderNumber() + " " + order.getOrderStatus());
    }
}
