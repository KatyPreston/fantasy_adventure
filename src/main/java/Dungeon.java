public class Dungeon {

    private Wizard boss;

    public Dungeon(Wizard boss){
        this.boss = boss;
    }

    public Wizard getBoss(){
        return this.boss;
    }

    public String exitDungeon() {
        return "Well done, you beat the Boss! You are free to go.";
    }

    public void fight(IFight iFight) {
        while(this.boss.health > 0){
            iFight.attack(boss);
        }
            exitDungeon();

    }
}