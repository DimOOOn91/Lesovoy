package module11.homework.task4;

import module11.homework.task1.ReplaceWords;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CheckIfContains {

    public static void main(String[] args) {

        checkWord("a");
    }

    private static int checkWord(String word) {
        String data = "";
        try {
            data = ReplaceWords.replace(null).toLowerCase();
        } catch (IOException e) {
            e.printStackTrace();
        }
        data = data.replaceAll("[,.:;()\\[\\]\"\"]", "");
        List<String> splettedData = Arrays.asList(data.split(" "));
        String wordInLowerCase = word.toLowerCase();
        int count = 0;
        for (String aWord : splettedData) {
            if (aWord.equals(wordInLowerCase)) {
               count++;
            }
        }
        System.out.println(String.format("No of %s in the input is : %s", word, count));
        return count;
    }

}
