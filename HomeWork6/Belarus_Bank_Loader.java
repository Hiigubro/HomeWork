package HomeWork6;

/**
 * Загрузчик курса с сайта Беларусбанка
 */

public class Belarus_Bank_Loader extends SiteLoader {
    public static final char COLON = ':';

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(SiteLoader.Currency currencyName) {
        return load("https://belarusbank.by/api/kursExchange" + currencyName.getId(), currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, SiteLoader.Currency currencyName) {
        int index = content.lastIndexOf(currencyName.getId());

        String substring = content.substring(index);
        int i = substring.indexOf(COLON); //запрос индекса ":"

        String value = substring.substring(i + 2, i + 6);

        return Double.parseDouble(value); //вывод валюты (#.##)
    }
}
