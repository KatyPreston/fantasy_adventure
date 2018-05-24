public class Cleric implements IFight {

        private int health;
        private RegenTools regenTools;

    public Cleric(int health, RegenTools regenTools){
        this.health = health;
        this.regenTools = regenTools;
        }

    public int getHealth() {
        return health;
    }

    public RegenTools getRegenTools() {
        return regenTools;
    }

    public void takeDamage(int amount) {
        this.health -= amount;
    }

    public void healDamage(int amount){
        this.health += amount;
    }

    public void setRegenTool(RegenTools regenTool) {
        this.regenTools = regenTool;
    }

    public void attack(IFight iFight) {
        iFight.healDamage(this.regenTools.getValue());
    }

}
