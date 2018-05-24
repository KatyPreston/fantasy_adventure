public enum RegenTools {

    GREENTOOL(10),
    REDPOTION(25),
    BLUEPOTION(50);

    private final int value;

   RegenTools(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
