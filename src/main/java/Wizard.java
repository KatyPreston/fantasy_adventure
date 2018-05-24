public class Wizard implements IFight {
    String name;
    SpellType spell;
    Familiar familiar;
    int health;

    public Wizard(String name, SpellType spell, int health){
        this.name = name;
        this.spell = spell;
        this.health = health;
        this.familiar = null;
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

    public int getAttackValueFromEnum() {
        return this.spell.getValue();
    }

    public void takeDamage(int amount) {
        this.health -= amount;
    }

    public void setSpell(SpellType spell) {
        this.spell = spell;
    }
}
