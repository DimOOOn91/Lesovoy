package module11.homework.task1;

import java.io.*;
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
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);

        StringBuilder builder = new StringBuilder();
        String line = br.readLine();
        while (line != null) {
            builder.append(line + System.lineSeparator());
            line = br.readLine();
        }
        br.close();

        String result = builder.toString();
        for (String key : map.keySet()) {
            result = result.replaceAll(key, map.get(key));
        }

        return result;
    }
}
