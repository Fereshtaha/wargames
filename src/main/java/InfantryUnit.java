public class InfantryUnit extends Unit {

    public InfantryUnit(String name, int health, int armor, int attack) {
        super(name, health, attack, armor);
    }

    public InfantryUnit(String name, int health) {
        super(name, health, 15, 10);
    }

    public int getAttackBonus() {
        return 2;
    }

    public int getResistBonus() {
        return 1;
    }

}
