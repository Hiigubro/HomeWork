package HomeWork5;

public class CalculatorWithCounter{

    private ICalculator iCalculator;
    private int counter;

    public CalculatorWithCounter (ICalculator iCalculator){
        this.iCalculator = iCalculator;
        counter = 0;
    }

    //сумма
    public final double plus (double a, double b){
        counter++;
        return iCalculator.plus(a, b);
    }

    //разница
    public final double minus (double a, double b){
        counter++;
        return iCalculator.minus(a, b);
    }

    //умножение
    public final double multiply (double a, double b){
        counter++;
        return iCalculator.multiply(a, b);
    }

    //деление
    public final double div (double a, double b){
        counter++;
        return iCalculator.div(a, b);
    }

    //возведение в степень
    public final double power (double a, double b){
        counter++;
        return iCalculator.power(a, b);
    }

    //модуль числа
    public final double module (double a){
        counter++;
        return iCalculator.module(a);
    }

    //извлечение квадратного корня
    public final double squareRoot (double a){
        counter++;
        return iCalculator.squareRoot(a);
    }

    public final int getCountOperation(){
        return counter;
    }
}
