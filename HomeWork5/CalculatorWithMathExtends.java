package HomeWork5;

/** 6. CalculatorWithMathExtends наследование от CalculatorWithOperator
 * CalculatorWithMathExtends унаследовать базовые
 * (деления, умножение, вычитание, сложение) математические операции
 * из CalculatorWithOperator
 *
 * В методах (Возведение в степень, Модуль числа, Корень из числа)
 * можно использовать только вызовы  методов библиотеки Math, все методы
 * в данном классе НЕ статические
 */

public class CalculatorWithMathExtends extends CalculatorWithOperator {

    // возведение в степень
    public  final double pow (double a, double b){
        return Math.pow(a, b);
    }

    //модуль числа
    public final double mod (double a){
        return Math.abs(a);
    }

    //корень из числа
    public final double sqRoot (double a){
        return Math.sqrt(a);
    }

}
