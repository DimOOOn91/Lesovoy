package module11.homework.task3;

import module11.homework.task2.RewriteFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WrightToExistContent {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("text", "image");
        map.put("Text", "Image");

        appendChangedContent(map);
    }

    private static File appendChangedContent(Map<String, String> map) {
        try {
           return RewriteFile.wrightContentToFile(map, true);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
