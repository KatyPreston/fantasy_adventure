public enum SpellType {
    FIREBALL(25),
    LIGHTNING(50),
    WATERBLAST(75);

    private final int value;

    SpellType(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
