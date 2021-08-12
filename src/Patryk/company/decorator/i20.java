package Patryk.company.decorator;

import java.math.BigDecimal;

public class i20 extends ToppingDecorator {

    public i20(Car newCar) {
        super(newCar);
    }

    @Override
    public BigDecimal price() {
        return otherNewCar.price().add(BigDecimal.valueOf(50000));
    }

    @Override
    public String description() {
        return otherNewCar.description() + " i20 ";
    }
}
