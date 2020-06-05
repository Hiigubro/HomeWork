public class Tema1 {
    public static void main(String[] args) {
        int s = 740000;
        int sec;
        int m;
        int min, h;

        //пример из WorkBook
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        System.out.println(h + " часов " + min + " минуты " + sec + " секунд");
        //Результат   205 часов 33 минуты 20 секунд

        //Расчет суток и недель
        int d, day, w, week;
        d = h % 24;
        day = (h - d) / 24;
        w = day % 7;
        week = (day - w)/7;
        System.out.println(week + " неделя " + w + " сутки " );
        //Результат 1 неделя 1 сутки
    }
}

