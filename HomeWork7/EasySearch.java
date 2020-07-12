package HomeWork7;

public class EasySearch implements ISearchEngine {

    private static final String wordSeparators = "+-,.:;!?\"()";

    @Override
    public int search(String text, String amount) {

        String content = text.toLowerCase().replaceAll("\\p{Punct}", "");

        int counter = 0;
        int index = 0;
        int curInd = 0;

        while ((index = content.indexOf(amount +"", curInd)) != -1){
            counter++;
            curInd = index + amount.length();
        }
        return counter;
    }
}
