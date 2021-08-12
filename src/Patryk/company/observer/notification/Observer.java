package Patryk.company.observer.notification;

import Patryk.company.observer.order.Order;

public interface Observer {

    public void update(Order order);
}
