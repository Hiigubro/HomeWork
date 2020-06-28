package HomeWork5;

import java.text.DecimalFormat;

public class CalculatorWithCounter_Main {
    public static void main(String[] args) {

        //обёртывание классов
        CalculatorWithCounter calculatorWithCounter = new CalculatorWithCounter(new CalculatorWithOperator());
        calculatorWithCounter = new CalculatorWithCounter(new CalculatorWithMathCopy());
        calculatorWithCounter = new CalculatorWithCounter(new CalculatorWithMathExtends());

        //форматирование числа
        DecimalFormat df = new DecimalFormat("#.##");

        double a = 4.1;
        double b = calculatorWithCounter.multiply(15,7);
        double c = calculatorWithCounter.div(28,5);
        double d = calculatorWithCounter.power(c,2);
        double e = calculatorWithCounter.plus(b, d);
        double result = calculatorWithCounter.plus(a, e);

        System.out.println("Реализация примера с помощью CalculatorWithMathCounter: ");

        // Вывод результата
        System.out.printf("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + df.format(result));

        // 4. Деление сохраненного результата на 0
        System.out.printf(" / 0 = " + df.format(result), df.format(result / 0));

        // 5. Деление сохраненного new результата на 0.0d
        System.out.printf(" / 0.0d = " + df.format(result), df.format(result / 0.0d));

        System.out.println("Количество выполненных операций = " + calculatorWithCounter.getCountOperation());
    }
}
