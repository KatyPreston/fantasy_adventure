public class Wizard implements IFight {
    String name;
    SpellType spell;
    Familiar familiar;
    int health;
    double riches;

    public Wizard(String name, SpellType spell, int health, double riches){
        this.name = name;
        this.spell = spell;
        this.health = health;
        this.familiar = null;
        this.riches = riches;
    }

    public String getName() {
        return this.name;
    }

    public SpellType getSpell() {
        return this.spell;
    }

    public int getHealth() {
        return this.health;
    }

    public Familiar getFamiliar() {
        return this.familiar;
    }

    public double getRiches(){
        return this.riches;
    }

    public int getAttackValueFromEnum() {
        return this.spell.getValue();
    }

    public void takeDamage(int amount) {
        this.health -= amount;
    }

    public void healDamage(int amount){
        this.health += amount;
    }

    public void setSpell(SpellType spell) {
        this.spell = spell;
    }

    public String callFamiliar(Familiar familiar) {
        this.familiar = familiar;
        this.useFamiliarHealth(familiar.getHealth());
        return "Come to me, Dragon";
    }

    public void useFamiliarHealth(int amount) {
        amount = this.familiar.getHealth();
        this.health += amount;
    }

    public void attack(IFight iFight) {
        iFight.takeDamage(this.spell.getValue());
    }

    public void winRiches(double gold){
        this.riches += gold;
    }
}
