package наследование_phones;

// Беспроводной телефон - №2 добавили часы работы аккумулятора
public abstract class WirelessPhone extends AbstractPhone {

    private int hour;

    public WirelessPhone(int year, int hour) {
        super(year);
        this.hour = hour;
    }
}
