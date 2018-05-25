public abstract class DBK implements IFight {

    private String type;
    private WeaponType weapon;
    private int health ;
    private double riches;


    public DBK(String type, WeaponType weapon, int health, double riches){
        this.type = type;
        this.weapon = weapon;
        this.health = health;
        this.riches = riches;
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

    public double getRiches(){
        return this.riches;
    }

    public int getAttackValueFromEnum() {
        return this.weapon.getValue();
    }

    public void takeDamage(int amount) {
        this.health -= amount;
    }

    public void healDamage(int amount){
        this.health += amount;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public void attack(IFight iFight) {
        iFight.takeDamage(this.weapon.getValue());
    }

    public void winRiches(double gold){
        this.riches += gold;
    }
}
