public class Lamp {
    boolean isOn;

    static class Main {
        public static void main(String[] args) {

            // создание объектов l1 и l2
            Lamp l1 = new Lamp();
            Lamp l2 = new Lamp();

            // вызов методов turnOn и turnOff;
            l1.turnOn();
            l2.turnOff();
        }
    }
    void turnOff(){
        //инициализируем переменную со значением false
        isOn = false;
        System.out.println("Свет включен? " + isOn);
    }
    void turnOn(){
        //инициализируем переменную со значением true
        isOn = true;
        System.out.println("Свет включен? " + isOn);
    }

}
