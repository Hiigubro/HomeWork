package HomeWork5;

public class Color {

    /** 1.2 константы цветов
     * Внутри класса создать константы цветов радуги
     * которые будут содержать номера цветов
     */
    private final int RED = 1;
    private final int ORANGE = 2;
    private final int YELLOW = 3;
    private final int GREEN = 4;
    private final int BLUE = 5;
    private final int INDIGO = 6;
    private final int VIOLET = 7;


    //Текущий цвет
    private int someColor;

    /** Создать конструктор который будет принимать параметр int.
     * Туда мы будем передавать номер цвета.
     * @param someColor параметр, содержащий текущий цвет
     */
    public Color (int someColor){
        this.someColor = someColor;
    }

    /**1.3 Создать метод getNumber()
     * должен вернуть номер цвета который мы передали в конструктор
     * @return
     */
    public int getNumber(){
        return someColor;
    }

    /**
     * Создать метод getName().
     * должен возвращать название цвета ввиде строки на русском,
     * если цвет нам не известен возвращать строку "неизвестно" .
     */
    public String getName(){
        switch (someColor){
            case RED:
                return "Красный";
            case ORANGE:
                return "Оранжевый";
            case YELLOW:
                return "Желтый";
            case GREEN:
                return "Зеленый";
            case BLUE:
                return"Голубой";
            case INDIGO:
                return "Синий";
            case VIOLET:
                return "Фиолетовый";
            default:
                return "Неизвестно";
        }
    }
}
