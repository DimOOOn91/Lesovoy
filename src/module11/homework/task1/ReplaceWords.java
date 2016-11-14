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
//        map.put("read", "wright");
//        map.put("o", "A");
//        map.put("String", "Integer");
        try {
            System.out.println(replace(map));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String replace(Map<String, String> map) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder builder = new StringBuilder();

        String line ;
        while ((line = br.readLine()) != null) {
            builder.append(line + System.lineSeparator());
        }

        br.close();
        String result = builder.toString();

        if (map != null) {
            for (String key : map.keySet()) {
                result = result.replaceAll(key, map.get(key));
            }
        }

        return result;
    }

}
