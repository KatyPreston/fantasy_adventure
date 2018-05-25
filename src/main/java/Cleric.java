public class Cleric implements IFight {

    private int health;
    private RegenTools regenTools;
    private double riches;

    public Cleric(int health, RegenTools regenTools, double riches){
        this.health = health;
        this.regenTools = regenTools;
        this.riches = riches;
        }

    public int getHealth() {
        return health;
    }

    public RegenTools getRegenTools() {
        return regenTools;
    }

    public double getRiches(){
        return this.riches;
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

    public void winRiches(double gold){
        this.riches += gold;
    }

}
