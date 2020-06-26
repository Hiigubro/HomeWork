package полиморфизм;

import наследование_phones.AbstractPhone;

public class Main {
    public static void main(String[] args) {
        User user = new User("Андрей");

        AbstractPhone firstPhone = new ThomasEdisonPhone(1897);
        user.callAnotherUser(224466, firstPhone);
        // Вращайте ручку
        // Сообщите номер абонента, сэр

        AbstractPhone phone = new Phone(1984);
        user.callAnotherUser(224466,phone);
        //Вызываю номер 224466

        AbstractPhone videoPhone = new VideoPhone(2018);
        user.callAnotherUser(224466,videoPhone);
        //Подключаю видеоканал для абонента 224466

    }
}
