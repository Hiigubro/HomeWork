package HomeWork5;

public class CalculatorWithOperator implements ICalculator {

    public final double plus(double a, double b){
        return a + b;
    }
    public final double minus (double a, double b){
        return a - b;
    }

    //деление
    public final double div (double a, double b){
        return a / b;
    }

    // умножение
    public final double multiply (double a, double b){
        return a * b;
    }

    // возведение в степень
    public final double power (double a, double b){
        double result = 1;
        for (int i = 0; i < b; i++){
            result *= a;
        }
        return result;
    }

    //модуль числа
    public final double module (double a){
        if (a < 0){
            return a * (-1);
        } else {
            return a;
        }
    }

    //корень из числа
    public final double squareRoot (double a){

        double temp; // переменная для хранения переходящего значения
        double squareRoot = a / 2;

        do {
            temp = squareRoot;
            squareRoot = (temp + (a / temp)) / 2;
        } while ((temp - squareRoot) != 0);
        return squareRoot;
    }
}
