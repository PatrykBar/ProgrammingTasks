package Patryk.company.decorator;

import java.math.BigDecimal;

public class i30 extends ToppingDecorator{

    String vsd = "aaa";
    String vsd2 = "aaa";

    public i30(Car newCar) {
        super(newCar);
    }

    @Override
    public BigDecimal price() {

        return otherNewCar.price().add(BigDecimal.valueOf(100000));
    }

    @Override
    public String description() {
        return otherNewCar.description() + " i30 ";
    }
}
