package наследование_phones;

public class SmartPhone extends CellPhone implements Iphone {

    private String operationSystem;

    public SmartPhone(int year, int hour, String operationSystem) {
        super(year, hour);
        this.operationSystem = operationSystem;
    }

    public void install (String program){
        System.out.println("Устанавливаю " + program + "для " + operationSystem);
    }
}
