package HomeWork5;

import java.text.DecimalFormat;

/**
 * № 10 Реализация "4.1 + 15 * 7 + (28 / 5) ^ 2" через CalculatorWitMathExtends
 */

public class CalculatorWithMathExtends_Main {
    public static void main(String[] args) {
        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();

        //форматирование числа
        DecimalFormat df = new DecimalFormat("#.##");

        double a = 4.1;
        double b = calculatorWithMathExtends.multiply(15,7);
        double c = calculatorWithMathExtends.div(28,5);
        double d = calculatorWithMathExtends.pow(c,2);
        double e = calculatorWithMathExtends.plus(b, d);
        double result = calculatorWithMathExtends.plus(a, e);

        System.out.println("Реализация примера с помощью CalculatorWithMathExtends: ");

        // Вывод результата
        System.out.printf("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + df.format(result));

        // 4. Деление сохраненного результата на 0
        System.out.printf(" / 0 = " + df.format(result), df.format(result / 0));

        // 5. Деление сохраненного new результата на 0.0d
        System.out.printf(" / 0.0d = " + df.format(result), df.format(result / 0.0d));
    }

}
