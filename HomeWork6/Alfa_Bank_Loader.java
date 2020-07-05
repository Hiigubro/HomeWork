package HomeWork6;

/**
 * Загрузчик курса с сайта Альфа Банк
 */
public class Alfa_Bank_Loader extends SiteLoader{
    public static final String RATE = "rate";
    public static final char COLON = ':';

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(Currency currencyName) {
        return load("https://developerhub.alfabank.by:8273/partner/1.0.0/public/nationalRates?currencyCode=" + currencyName.getId(), currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, Currency currencyName) {
        int rateIndex = content.lastIndexOf(RATE); //запрос индекса "rate"

        String substring = content.substring(rateIndex);//возвращает данные начиная с "rate"
        int i = substring.indexOf(COLON); //запрашивает индекс ":"

        String value = substring.substring(i + 1, i + 5); //

        return Double.parseDouble(value); //вывод валюты (#.##)
    }
}

