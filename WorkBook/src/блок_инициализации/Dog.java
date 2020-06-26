package блок_инициализации;

//блоки инициализации используются для
// инициализации переменных внутри класса;
public class Dog {
    private String name;
    private String poroda;
    private int age;

    // Блок инициализации НЕСТАТИЧЕСКИЙ
    {
        System.out.println("Это нестатический блок инициализации!");
    }

    // Блок инициализации НЕСТАТИЧЕСКИЙ
    // используется для инициализации статических
    // переменных, а "обычный"  - для всех остальных.
    static {
        //..
    }

    public Dog(String x, String y, int z){
        name = x;
        poroda = y;
        age = z;
    }
}
