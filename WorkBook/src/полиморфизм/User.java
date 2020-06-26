package полиморфизм;

import наследование_phones.AbstractPhone;

public class User {
    private String name;
    private AbstractPhone phone;

    public User (String name) {
        this.name = name;
    }

    public void callAnotherUser(int number, AbstractPhone phone ){
        // вот он полиморфизм - использование в коде
        // абстактного типа AbstractPhone!
        phone.call(number);
    }
}
