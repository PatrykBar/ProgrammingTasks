package Patryk.company;

public interface InterfaceAndAbst {

    int number = 7; // jedynie stałe

    default int numberToPrint(){
        return 5;
    }
}
