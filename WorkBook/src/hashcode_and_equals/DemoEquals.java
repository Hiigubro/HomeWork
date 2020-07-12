package hashcode_and_equals;

public class DemoEquals {
    public static void main(String[] args) {

        // в памяти создастся два объекта
        Equals object1 = new Equals(5, 10);
        Equals object2 = new Equals(5, 10);

        /**
         * Для проверки эквивалентности в классе Object
         * существует метод equals(),
         * который сравнивает содержимое объектов
         * и выводит значение типа boolean true,
         * если содержимое эквивалентно, и false — если нет
         */
        object1.equals(object2);//true

        Equals object3 = new Equals(5, 10);

        /**
         * Переменная object4 ссылается на тот-же объект
         * что и переменная object3
         */
        Equals object4 = object3;
        object3.equals(object4);//true
    }
}
