package HomeWork8;

import java.util.Iterator;
import java.util.LinkedList;



public class PersonMain {
    public static void main(String[] args) {

        // 9.1 Начало отсчета времени для измерения скорости наполнения LinkedList
        long startFilling = System.currentTimeMillis();

        // 4. При помощи рандома генерируем объекты Person. LinkedList.
        LinkedList<Person> people = new LinkedList<>();
        for (int i = 0; i < 1_000; i++){
            people.add(new Person(RandomString.generateRandom(2), RandomString.generateRandom(3)));
        }

        // 9.2 Получение времени наполнения LinkedList и запись в переменную fillingTime
        long fillingTime = System.currentTimeMillis() - startFilling;

        // 9.3 Вывод времени наполнения LinkedList на экран
        System.out.println("Скорость наполнения LinkedList: " + fillingTime + " миллисекунд");
        System.out.println("_________________________________");

        //Вывод наполненного списка people на экран
        System.out.println("Cписок people без сортировки: ");
        System.out.println(people);
        System.out.println("_________________________________");

        // 8. Сортировка списка people при помощи созданного компаратора
        people.sort(new PersonPassLengthComparator());

        System.out.println("Список people, отсортированный с помощью  компаратора PersonPassLengthComparator: ");
        System.out.println(people);
        System.out.println("_________________________________");

        // 11.1 Начало отсчета времени для измерения скорости удаления всех элементов из LinkedList
        long startRemoving = System.currentTimeMillis();

        // 10. Удаление всех элементов из списка people при помощи Iterator
        Iterator<Person> personIterator = people.iterator();
        while (personIterator.hasNext()){
            Person person = personIterator.next();
            personIterator.remove();
        }

        // 11.2 Получение времени удаления всех элементов из LinkedList и запись в переменную removingTime
        long removingTime = System.currentTimeMillis() - startRemoving;

        // 11.3 Вывод времени удаления всех элементов из LinkedList
        System.out.println("Скорость удаления всех элементов из LinkedList: " + removingTime + " миллисекунд");
        System.out.println("_________________________________");

        //Вывод списка people, в котором элементы были удалены при помощи iterator, на экран
        System.out.println("Пустой список people, в котором элементы были удалены при помощи iterator: ");
        System.out.println(people);
        System.out.println("_________________________________");

    }

}
