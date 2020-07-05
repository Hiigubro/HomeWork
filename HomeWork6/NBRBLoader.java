package HomeWork6;

/**
 * Загрузчик курса с сайта Нац. Банка
 */
public class NBRBLoader extends SiteLoader{

    public static final String CUR_OFFICIAL_RATE = "Cur_OfficialRate";
    public static final char COLON = ':';


    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(SiteLoader.Currency currencyName) {
        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId(), currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, SiteLoader.Currency currencyName) {
        int officialRateIndex = content.indexOf(CUR_OFFICIAL_RATE); //запрос индекс "Cur_OfficialRate"

        String substring = content.substring(officialRateIndex);//вывод данных начиная с "Cur_OfficialRate"
        int i = substring.indexOf(COLON); //запрос индекса ":"

        String value = substring.substring(i + 1, i + 5);
        return Double.parseDouble(value); //вывод валюты (#.##)
    }
}

