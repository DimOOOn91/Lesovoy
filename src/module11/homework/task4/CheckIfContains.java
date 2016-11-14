package module11.homework.task4;

import module11.homework.task1.ReplaceWords;

import java.io.File;
import java.io.IOException;

public class CheckIfContains {

    private static File file = new File("src/module11/homework/module11.txt");

    public static void main(String[] args) {

        checkWord("Text");
    }

    private static int checkWord(String word) {
        String content = "";
        try {
            content = ReplaceWords.replacer(null).toLowerCase();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String request = word.toLowerCase();
        int index = content.indexOf(request);
        int count = 0;

        while (index != -1) {
            count++;
            content = content.substring(index + 1);
            index = content.indexOf(request);
        }
        System.out.println("No of " + word + " in the input is : " + count);
        return count;
    }

}
