public abstract class DBK implements IFight {

    private String type;
    private WeaponType weapon;
    private int health ;


    public DBK(String type, WeaponType weapon, int health){
        this.type = type;
        this.weapon = weapon;
        this.health = health;
    }

    public String getType() {
        return this.type;
    }

    public WeaponType getWeapon() {
        return this.weapon;
    }

    public int getHealth() {
        return this.health;
    }

    public int getAttackValueFromEnum() {
        return this.weapon.getValue();
    }

    public void takeDamage(int amount) {
        this.health -= amount;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public void attack(IFight iFight) {
        iFight.takeDamage(this.weapon.getValue());
    }
}
