package Patryk.company.factory;

public class Unit {

    private int hp;
    private int exp;
    private int dmgDone;

    protected Unit(int hp, int exp, int dmgDone) {
        this.hp = hp;
        this.exp = exp;
        this.dmgDone = dmgDone;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setDmgDone(int dmgDone) {
        this.dmgDone = dmgDone;
    }
}
