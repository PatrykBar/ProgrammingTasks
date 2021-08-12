package Patryk.company.observer.notification;

import Patryk.company.observer.order.Order;

public class MobileAPP implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("MobileApp " + order.getOrderNumber() + " " + order.getOrderStatus());
    }
}
