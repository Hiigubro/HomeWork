package HomeWork1;

public class Prioritet {
    public static void main(String[] args) {
        // Решение примера
        int c = 5;
        int d = 2;
        int e = 8;
        // все, что после запятой отбрасываем
        System.out.println(5 + 2 / 8); // 5 + (2/8) = 5 + 0,25 = 5 + 0 = 5
        System.out.println((5 + 2) / 8); // 7 / 8 = 0,875 = 0
        System.out.println((5 + d++) / 8); // (5 + 2) / 8 = 7 / 8 = 0,875 = 0
        System.out.println((5 + d++) / --e); // (5 + 3) / 7 = 8 / 7 = 1,14 = 1
        System.out.println((5 * 2 >> d++) / --e); // (10 >> 4) / 7 = 0 / 7 = 0
        System.out.println((5 + 7 > 20 ? 68 : 22 * 2 >> d++) / --e);
        // 12 > 20 = false. (22 * 2 >> 5) / 7 = (44 >> 5) / 7 = 1 / 7 = 0,14 = 0
        System.out.println(6 - 2 > 3 && 12 * 12 <= 119);
        // 4 > 3 && 144 <= 119 , true && false = false
        System.out.println(true && false); // false
        /* System.out.println((c + d > 20 ? 68 >= 68 :  22 * 2 >> d++) / --e);
        вышеуказанный пример - пример тернарного оператора
        BooleanExpression ? Expression1 : Expression2
        код не компилируется, тк Expression1 = (68 >= 68) является Boolean,
        а должно быть Expression, которое возвращает значение
        МЫ СЕЙЧАС НЕ ДЕЛИМ, но это может быть.
        */
    }
}
