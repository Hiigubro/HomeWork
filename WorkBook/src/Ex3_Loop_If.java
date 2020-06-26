import java.util.Scanner;

public class Ex3_Loop_If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();

        if (a % 5 == 2) {
            System.out.println("последняя цифра числа является семеркой");
        }
        else {
            System.out.println("последняя цифра числа НЕ является семеркой");
        }
    }
}
