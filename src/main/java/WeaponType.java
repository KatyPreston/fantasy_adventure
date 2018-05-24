public enum WeaponType {
    SWORD(10),
    AXE(15),
    CLUB(5);

    private final int value;

    WeaponType(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
