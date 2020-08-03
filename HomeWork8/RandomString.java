package HomeWork8;

import java.util.Random;

/**
 * 3. Написать класс с RandomString в котором будет один статический метод String random(int stringLength):
 *  3.1. Параметр метода это количество символов которые должно быть в строке
 *  3.2. Буквы в строке: Латиница, Кирилица, Пробел
 */
public class RandomString {

    //Параметр метода
    private static final String symbols = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя ABCDEFGHIJKLMONPQRSTUVWXYZabcdefghijklmonpqrstuvwxyz";

    /**
     *
     * @param stringLength - парметр метода - количество символов с троке
     * @return
     */
    public static String generateRandom(int stringLength) {

        Random randomSymbols = new Random();
        String result = ""; // инициализация переменной

        /**
         * charAt - возвращает символ, расположенный по указанному индексу строки
         */
        for (int i = 0; i < stringLength; i++) {
            result += symbols.charAt(randomSymbols.nextInt(symbols.length()));
        }

        return result;
    }
}
