public enum WeaponType {
    SWORD(10),
    AXE(10),
    CLUB(5);

    private final int value;

    WeaponType(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
