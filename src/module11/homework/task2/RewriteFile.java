package module11.homework.task2;

import module11.homework.task1.ReplaceWords;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class RewriteFile {

    private static File file = new File("src/module11/homework/module11.txt");

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("text", "image");
        map.put("Text", "Image");

        Map<String, String> map2 = new HashMap<>();
        for (String key : map.keySet()) {
            map2.put(map.get(key), key);
        }

        try {
            fileContentReplacer(map2);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static File fileContentReplacer(Map<String, String> map) throws IOException {
        String result = ReplaceWords.replacer(map);
        try (Writer writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(result);
        }
        return file;
    }
}
