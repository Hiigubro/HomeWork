package Стат_Динамич_связ_в_Java;

public class Main {
        public static void main(String[] args) {

            // Пример статического и динамического связывания в Java
            Insurance current = new CarInsurance();

            // Динамическое связывание на основе объекта
            // происхоит во время ВЫПОЛНЕНИЯ
            // исп для разрешения переопределенных методов
            int premium = current.premium();

            // Статическое связывание на основе класса
            // происхоит во время КОМПИЛЯЦИИ
            // исп для разрешения перегруженных методов
            String category = current.category();

            System.out.println("premium : " + premium);
            System.out.println("category : " + category);
        }
    }

    class Insurance{
        public static final int LOW = 100;
        public int premium(){
            return LOW;
        }
        public static String category(){
            return "Insurance";
        }

    }

    class CarInsurance extends Insurance{
        public static final int HIGH = 200;
        public int premium(){
            return HIGH;
        }
        public static String category(){
            return "Car Insurance";
        }

    }

