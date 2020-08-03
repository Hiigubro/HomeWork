package HomeWork8;

import java.util.Comparator;

/**
 * 7. Создать класс AnimalAgeComparator который
 * наследует интерфейс Comparator из jdk.
 * Данный класс должен сравнивать возраст животных.
 */

public class AnimalAgeComparator implements Comparator <Animal> {

    @Override
    public int compare(Animal age1, Animal age2) {
        return age1.getAge() - age2.getAge();
        /**
         * если текущее значение больше выбранного : 1
         * если текущее значение меньше выбранного: -1
         * если текущее значение равно выбранному: 0
         */
    }
}
