package Patryk.company.decorator;

import javax.swing.table.TableRowSorter;
import java.math.BigDecimal;

public abstract class ToppingDecorator implements Car{

    protected Car otherNewCar;

    public  ToppingDecorator(Car newCar) {
        this.otherNewCar = newCar;
    }

    @Override
    public BigDecimal price() {
        return otherNewCar.price();
    }

    @Override
    public String description() {
        return otherNewCar.description();
    }


}
