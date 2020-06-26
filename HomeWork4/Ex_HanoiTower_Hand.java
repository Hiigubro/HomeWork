package HomeWork4;

import java.util.Scanner;

public class Ex_HanoiTower_Hand {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество дисков, не менее 3: ");
        int discs = scanner.nextInt(); // количество дисков

        int columns = 3; // количество столбцов

        if (discs < 3){ // если кол-во дисков меньше 3
            System.out.println("Дисков должно быть не менее 3");
            return;
        }

        // Объявляем ДВУмерный интовый массив (табличный)
        // discs - количество дисков (ячеек в столбце), columns - количество столбцов
        int[][] gameField = new int[discs][columns];

        // инициализируем первый столбец
        for (int i = 0; i < gameField.length; i++){
            gameField [i][0] = i + 1;
        }

        printMap(gameField);

        while (! checkEndGame(gameField)){
            int operation = getNextOperation();
            if (operation == 7){
                System.out.println("Как жаль, что вы уходите. Ждем снова!");
                break;
            }
            int [] indexs = getIndexForOperation(operation);
            moveElement(indexs[0], indexs[1], gameField);
            printMap(gameField);
        }
    }

    /**
     * Проверяяем закончена ли игра
     * @param gameField карта
     * @return true - закончена, false - нет
     */
    public static boolean checkEndGame(int [][] gameField){
        for (int i = 0; i < gameField.length; i++) {
            if (gameField[i][gameField.length - 1] == 0){
                System.out.println("Победа так близко! Продолжим.");
                return false;
            }
        }
        System.out.println("Поздравляем! Вы выйграли игру. Попробуйте пройти ее с большим количеством дисков");
        return true;
    }

    /**
     * Получить индексы столбцов с которого и на который надо перемещать диски
     * @param operation номер действия пользователя
     * @return массив. 1 элемент откуда премещаем, 2 элемент куда перемещаем
     */
    public static int [] getIndexForOperation (int operation){
        // Мы знаем откуда "from" и куда "to" мы хотим переместить диск
        // Присваиваем им отрицательные значения, чтобы потом понять правильно ли пользователь что то выбрал
        int from = -1, to = -1;

        switch (operation){
            case 1:
                from = 0;
                to = 1;
                break;
            case 2:
                from = 0;
                to = 2;
                break;
            case 3:
                from = 1;
                to = 0;
                break;
            case 4:
                from = 1;
                to = 2;
                break;
            case 5:
                from = 2;
                to = 0;
                break;
            case 6:
                from = 2;
                to = 1;
                break;
        }
        return new int[]{ from, to };
    }

    /**
     * Обращение к пользователю, получить следующее действие
     * @return
     */
    public static int getNextOperation(){
        // если нет void обязательно нужен возврат return
        //Создание нового сканера каждый раз
        Scanner scanner = new Scanner(System.in);

        // Задание для пользователя
        System.out.println("Сделайте свой ход: ");
        System.out.println("1. 1 -> 2");
        System.out.println("2) 1 -> 3");
        System.out.println("3) 2 -> 1");
        System.out.println("4) 2 -> 3");
        System.out.println("5) 3 -> 1");
        System.out.println("6) 3 -> 2");
        System.out.println("7) Покинуть игру");

        // Сохраняем выбор пользователя
        return scanner.nextInt();
    }

    /**
     * Перемещение диска из одного столбца в другой
     * @param from индекс откуда перемещаем диск
     * @param to индекс куда перемещаем диск
     * @param gameField игровое поле, на котором перемещаем
     */
    public static void moveElement (int from, int to, int[][]gameField){

        if (from < 0 || to < 0){
            System.out.println("Вы выбрали неизвестный номер операции");
            return;
        }

        // Итерация ячеек необходимого столбца
        for (int i = 0; i < gameField.length; i++){
            // полученное значение из столбца from записываем в fromValue (выбранный пользователем)
            int fromValue = gameField[i][from];
            if (fromValue != 0){
                for (int j = 0; j < gameField.length; j++){
                    int toValue = gameField[j][to]; // из нашей ячейки опять берем значение
                    //добавляем проверку
                    if (j == 0 && toValue != 0){
                        System.out.println("Столбец " + (to + 1) + " переполнен");
                        continue;
                    } else if (toValue < fromValue && toValue !=0){
                        System.out.println("Из столбца " + (from + 1) + " на столбец " + (to + 1) + " нельзя переместить диск");
                        continue;
                    } else if (toValue > fromValue){
                        gameField [i][from] = 0;
                        gameField [j - 1][to] = fromValue;
                        break;
                    }else if (j + 1 == gameField.length) {
                        gameField [i][from] = 0;
                        gameField [j][to] = fromValue;
                    }
                }
                break;
            }
        }
    }

    /**
    Печать игрового поля в консоль
    @param gameField игровое поле
     */
    public static void printMap(int[][] gameField){
        for (int i = 0; i < gameField.length; i++){
            for (int j = 0; j < gameField[i].length; j++){
                int value = gameField [i][j];
                if (value == 0){
                    System.out.print("* ");
                } else {
                    System.out.print(value + " ");
                }
            }
            System.out.println();
        }
    }
}
