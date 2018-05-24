public class Cleric {

        int health;
        RegenTools regenTools;

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
}
