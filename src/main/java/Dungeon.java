public class Dungeon {

    private Wizard boss;
    private double gold;

    public Dungeon(Wizard boss, double gold){
        this.boss = boss;
        this.gold = gold;
    }

    public Wizard getBoss(){
        return this.boss;
    }

    public double getGold(){
        return this.gold;
    }

    public void goldIsStolenBy(IFight iFight){
        iFight.winRiches(this.gold);
        this.gold = 0;
    }

    public String exitDungeon(){
        return "Well done, you beat the Boss! You are free to go.";

    }

    public void fight(IFight iFight) {
        while(this.boss.health > 0){
            iFight.attack(boss);
        }
        goldIsStolenBy(iFight);
        exitDungeon();

    }
}