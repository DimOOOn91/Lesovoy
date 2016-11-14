package module11.homework.task2;

import module11.homework.task1.ReplaceWords;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class RewriteFile {

    private static File file = new File("src/module11/homework/module11.txt");

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("image", "text");
        map.put("Image", "Text");

        overwriteContent(map);
    }

    private static File overwriteContent(Map<String, String> map) {
        try {
            return wrightContentToFile(map, false);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static File wrightContentToFile(Map<String, String> map, Boolean append) throws IOException {
        String result = ReplaceWords.replacer(map);
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, append), "UTF-8"))) {
            writer.append(result);
        }
        return file;
    }

}
