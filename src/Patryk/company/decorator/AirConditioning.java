package Patryk.company.decorator;

import java.math.BigDecimal;

public class AirConditioning extends ToppingDecorator{

    public AirConditioning(Car newCar) {
        super(newCar);
    }

    @Override
    public BigDecimal price() {
        return otherNewCar.price().add(BigDecimal.valueOf(200));
    }

    @Override
    public String description() {
        return otherNewCar.description() + " + Air conditioning, ";
    }
}
