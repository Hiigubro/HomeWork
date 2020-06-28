package HomeWork5;

/**
 * В классе CalculatorWithMathCopy должны присутствовать 4 метода
 * (деления, умножение, вычитание, сложение)
 * данные методы можно скопировать из класса CalculatorWithOperator.
 *
 * В методах (Возведение в степень, Модуль числа, Корень из числа)
 * можно использовать только вызовы  методов библиотеки Math,
 * все методы в данном классе НЕ статические
 */
public class CalculatorWithMathCopy {

    public final double plus(double a, double b){
        return a + b;
    }
    public final double minus (double a, double b){
        return a - b;
    }
    public final double div (double a, double b){
        return a / b;
    }
    public final double multiply (double a, double b){
        return a * b;
    }

    // возведение в степень
    public  final double power (double a, double b){
        return Math.pow(a, b);
    }

    //модуль числа
    public final double module (double a){
        return Math.abs(a);
    }

    //корень из числа
    public final double squareRoot (double a){
        return Math.sqrt(a);
    }
}
