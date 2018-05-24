public abstract class Familiar {
    String type;
    int health;

    public Familiar(String type, int health){
        this.type = type;
        this.health = health;
    }

    public String getType() {
        return this.type;
    }

    public int getHealth(){
        return this.health;
    }
}
