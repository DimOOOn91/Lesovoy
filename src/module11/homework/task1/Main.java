package module11.homework.task1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static File file = new File("task1.txt");

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
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader br = new BufferedReader(inputStreamReader);

        String line;
        StringBuilder builder = new StringBuilder();
        while ((line = br.readLine()) != null) {
            builder.append(line + System.lineSeparator());
        }

        String result = builder.toString();
        for (String key : map.keySet()) {
            result = result.replaceAll(key, map.get(key));
        }

        return result;
    }
}
