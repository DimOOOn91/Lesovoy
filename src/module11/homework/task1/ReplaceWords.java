package module11.homework.task1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReplaceWords {

    private static File file = new File("src/module11/homework/module11.txt");

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("read", "wright");
        map.put("o", "A");
        map.put("String", "Integer");
        try {
            System.out.println(replacer(map));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String replacer(Map<String, String> map) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = br.readLine();
        StringBuilder builder = new StringBuilder();

        while (line != null) {
            builder.append(line + System.lineSeparator());
            line = br.readLine();
        }

        br.close();
        String result = builder.toString();

        if (map != null && !map.isEmpty()) {
            for (String key : map.keySet()) {
                result = result.replaceAll(key, map.get(key));
            }
        }

        return result;
    }
}
