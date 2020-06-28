package HomeWork5;

import java.text.DecimalFormat;

/** № 4 Реализация "4.1 + 15 * 7 + (28 / 5) ^ 2" через CalculatorWithOperator
 *
 * 4. В отдельном классе, создать мэйн метод.
 * Внутри данного метода создать экземпляр класса CalculatorWithOperator
 * сохранив его в переменную. При помощи методов созданного объекта
 * вичислить результат выражения 4.1 + 15 * 7 + (28 / 5) ^ 2.
 * Результат записать в переменную (определить самый подходящий
 * тип переменной). Вывести сохранённый результат в консоль.
 */

public class CalculatorWithOperator_Main {
    public static void main(String[] args) {

        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();

        //форматирование числа
        DecimalFormat df = new DecimalFormat("#.##");

        double a = 4.1;
        double b = calculatorWithOperator.multiply(15,7);
        double c = calculatorWithOperator.div(28,5);
        double d = calculatorWithOperator.power(c,2);
        double e = calculatorWithOperator.plus(b, d);
        double result = calculatorWithOperator.plus(a, e);

        System.out.println("Реализация примера с помощью CalculatorWithOperator: ");

        // Вывод результата
        System.out.printf("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + df.format(result));

        // 4. Деление сохраненного результата на 0
        System.out.printf(" / 0 = " + df.format(result), df.format(result / 0));

        // 5. Деление сохраненного new результата на 0.0d
        System.out.printf(" / 0.0d = " + df.format(result), df.format(result / 0.0d));
    }
}

