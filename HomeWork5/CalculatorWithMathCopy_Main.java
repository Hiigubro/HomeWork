package HomeWork5;

import java.text.DecimalFormat;

/** № 8 Реализация "4.1 + 15 * 7 + (28 / 5) ^ 2" через CalculatorWitMathCopy
 *
 */
public class CalculatorWithMathCopy_Main {
    public static void main(String[] args) {

        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();

        //форматирование числа
        DecimalFormat df = new DecimalFormat("#.##");

        double a = 4.1;
        double b = calculatorWithMathCopy.multiply(15,7);
        double c = calculatorWithMathCopy.div(28,5);
        double d = calculatorWithMathCopy.power(c,2);
        double e = calculatorWithMathCopy.plus(b, d);
        double result = calculatorWithMathCopy.plus(a, e);

        System.out.println("Реализация примера с помощью CalculatorWithMathCopy: ");

        // Вывод результата
        System.out.printf("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + df.format(result));

        // 4. Деление сохраненного результата на 0
        System.out.printf(" / 0 = " + df.format(result), df.format(result / 0));

        // 5. Деление сохраненного new результата на 0.0d
        System.out.printf(" / 0.0d = " + df.format(result), df.format(result / 0.0d));
    }
}
