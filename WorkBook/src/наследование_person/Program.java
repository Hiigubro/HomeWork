package наследование_person;

public class Program {
    public static void main(String[] args) {

        Person tom = new Person("Том");
        tom.display();

        Employee sam = new Employee("Сэм", "Microsoft");
        sam.display();  // Наниматель Сэм работает в Microsoft
        sam.work();     // Сэм работает в Майкрософт

        Person pete = new Employee("Пит", "Oracle");
        pete.display(); // Наниматель Pete работает в Oracle
    }
}

