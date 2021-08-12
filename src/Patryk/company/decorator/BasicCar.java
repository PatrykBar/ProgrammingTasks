package Patryk.company.decorator;

import java.math.BigDecimal;

public class BasicCar implements Car {

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(10000);
    }

    @Override
    public String description() {
        return "Besic Car";
    }
}
