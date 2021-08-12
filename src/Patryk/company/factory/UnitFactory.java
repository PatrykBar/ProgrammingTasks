package Patryk.company.factory;

public class UnitFactory extends Factory{
    @Override
    public Unit createUnit(UnitType unitType) {

        switch (unitType){
            case RIFLEMAN:
                return new Rifleman(200,0,20);
            case TANK:
                return new Tank(500,20,30);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }
}
