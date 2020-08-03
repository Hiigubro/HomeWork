package HomeWork8;

import java.util.Comparator;

/**
 * 6. Создать класс PersonPassLengthComparator
 * который наследует интерфейс Comparator из jdk.
 * Данный класс должен сравнивать длинну пароля пользователей.
 */
public class PersonPassLengthComparator implements Comparator <Person>{

    @Override

    public int compare (Person password1, Person password2) {
        return password1.getPassword().length() - password2.getPassword().length();
        /**
         * если текущая длина пароля больше выбранной : 1
         * если текущая длина пароля меньше выбранной: -1
         * если текущая длина пароля равна выбранной: 0
         */
        }
}
