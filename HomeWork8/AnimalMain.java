package HomeWork8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class AnimalMain {
    public static void main(String[] args) {

        // 9.1 Начало отсчета времени для измерения скорости наполнения ArrayList
        long startFilling = System.currentTimeMillis();

        // 5. При помощи рандома генерируем объекты Animal. ArrayList.
        ArrayList<Animal> animals = new ArrayList<>();
        Random randomString = new Random();
        for (int i = 0; i < 1_000; i++){
            animals.add(new Animal(randomString.nextInt(), RandomString.generateRandom(3)));
        }

        // 9.2 Получение времени наполнения ArrayList и запись в переменную fillingTime
        long fillingTime = System.currentTimeMillis() - startFilling;

        // 9.3 Вывод времени наполнения ArrayList на экран
        System.out.println("Скорость наполнения ArrayList: " + fillingTime + " миллисекунд");
        System.out.println("_________________________________");

        //Вывод наполненного списка animals на экран
        System.out.println("Cписок animals без сортировки: ");
        System.out.println(animals);
        System.out.println("_________________________________");

        // 8. Сортировка списка animals при помощи созданного компаратора
        animals.sort(new AnimalAgeComparator());

        System.out.println("Список animals, отсортированный с помощью  компаратора AnimalAgeComparator: ");
        System.out.println(animals);
        System.out.println("_________________________________");

        // 11.1 Начало отсчета времени для измерения скорости удаления всех элементов из ArrayList
        long startRemoving = System.currentTimeMillis();

        // 10. Удаление всех элементов из списка animals при помощи Iterator
        Iterator<Animal> animalIterator = animals.iterator();
        while (animalIterator.hasNext()){
            Animal animal = animalIterator.next();
            animalIterator.remove();
        }

        // 11.2 Получение времени удаления всех элементов из LinkedList и запись в переменную removingTime
        long removingTime = System.currentTimeMillis() - startRemoving;

        // 11.3 Вывод времени удаления всех элементов из ArrayList
        System.out.println("Скорость удаления всех элементов из ArrayList: " + removingTime + " миллисекунд");
        System.out.println("_________________________________");

        System.out.println("Пустой список animals, в котором элементы были удалены при помощи iterator: ");
        System.out.println(animals);
        System.out.println("_________________________________");

    }
}
