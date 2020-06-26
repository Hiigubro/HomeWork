package интерфейс;

public class Program {
    public static void main(String[] args) {

        // Приватные методы
        Calculatable c = new Calculation();
        System.out.println(c.sum(1, 2));
        System.out.println(c.sum(1, 2, 4));

        // Статический метод
        Printable.read();

        Book b1 = new Book("Java. Объединение.", "H. Shildt");
        b1.print(); //Java. Объединение. (H. Shildt)

        // мы не можем напрямую создавать объекты интерфейсов,
        // поэтому следующий код не будет работать:
        // Printable b2 = new Printable();
        // b2.print();

        Printable b2 = new Book("Java. Объединение.", "H. Shildt");
        b2.print();      //  Java. Объединение. (H. Shildt)

        b2 = new Journal("Foreign Policy");
        b2.print();      // Foreign Policy

        Printable b3 =new Journal("Foreign Affairs");
        b3.print();

        // И если мы хотим обратиться к методам класса Journal,
        // которые определены не в интерфейсе Printable,
        // а в самом классе Journal, то нам надо явным образом
        // выполнить преобразование типов: ((Journal)p).getName();
        Printable b4 =new Journal("Foreign Tours");
        String name = ((Journal)b4).getName();
        System.out.println(name);

        Printable b5 =new Journal("Foreign Giks");
        b3.println(); // Не определено для печати

    }
}
// интерфейс - чему то конкретному научили
interface Printable{
    void print();

    /**
     * Метод по умолчанию - это обычный метод без модификаторов,
     * который помечается ключевым словом default.
     */
    default void println (){
        System.out.println("Не определено для печати");
    }

    // Статический метод
    static void read(){
        System.out.println("Читать Printable");
    }
}

    /** implements
     * Чтобы класс применил интерфейс,
     * надо использовать ключевое слово implements:
     */
class Book implements Printable{
    String name;
    String author;

    Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    public void print() {
        System.out.printf("%s (%s) \n", name, author);
    }
}

class Journal implements Printable {

    private String name;

    String getName(){
        return name;
    }

    Journal(String name){
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}


