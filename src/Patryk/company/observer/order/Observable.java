package Patryk.company.observer.order;

import Patryk.company.observer.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObserver();

}
