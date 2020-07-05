package HomeWork6;

import java.text.DecimalFormat;

public class Test {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");

        NBRBLoader nbrbLoader = new NBRBLoader();
        System.out.println("Курсы валют НБРБ:");
        System.out.println("1 Евро = " + (nbrbLoader.load(SiteLoader.Currency.USD_NBRB)) + " бел.руб");
        System.out.println("1 Российский рубль = " + (nbrbLoader.load(SiteLoader.Currency.RUS_NBRB)) + " бел.руб");
        System.out.println("1 Доллар США = " +(nbrbLoader.load(SiteLoader.Currency.USD_NBRB)) + " бел.руб");
        System.out.println("__ __ __ __ __");

        Alfa_Bank_Loader alfa_bank_loader = new Alfa_Bank_Loader();
        System.out.println("Курсы валют Альфа-Банка:");
        System.out.println("1 Евро = " + (alfa_bank_loader.load(SiteLoader.Currency.EUR_ALFA)) + " бел.руб");
        System.out.println("1 Российский рубль = " + (alfa_bank_loader.load(SiteLoader.Currency.RUS_ALFA)) + " бел.руб");
        System.out.println("1 Доллар США = " +(alfa_bank_loader.load(SiteLoader.Currency.USD_ALFA)) + " бел.руб");
        System.out.println("__ __ __ __ __");

        Belarus_Bank_Loader belarus_bank_loader = new Belarus_Bank_Loader();
        System.out.println("Курсы валют БеларусБанка:");
        System.out.println("1 Евро = " + (belarus_bank_loader.load(SiteLoader.Currency.EUR_BLRB)) + " бел.руб");
        System.out.println("1 Российский рубль = " + (belarus_bank_loader.load(SiteLoader.Currency.RUS_BLRB)) + " бел.руб");
        System.out.println("1 Доллар США = " +(belarus_bank_loader.load(SiteLoader.Currency.USD_BLRB)) + " бел.руб");
        System.out.println("__ __ __ __ __");

    }
}
