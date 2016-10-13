package module07.homework.task5;

import java.util.LinkedList;
import java.util.List;

public class MeasureTime {

    private static final int ONE = 100000;

    public static void main(String[] args) {

        List<Integer> integersLL = new LinkedList<>();
        List<Integer> integersAL = new LinkedList<>();
        List<String> stringsLL = new LinkedList<>();
        List<String> stringsAL = new LinkedList<>();

        generateElementsInt(integersLL, ONE);
        generateElementsInt(integersAL, ONE);
        generateElementsStr(stringsLL, ONE);
        generateElementsStr(stringsAL, ONE);

        System.out.println("ADD:");
        System.out.println("--Integers:");
        long startLL = System.nanoTime();
        integersLL.add(1001);
        long finishLL = System.nanoTime();
        long startAL = System.nanoTime();
        integersAL.add(1001);
        long finishAL = System.nanoTime();
        System.out.println("------" + (finishLL - startLL) + "/" + (finishAL - startAL));

        System.out.println("--Strings:");
        startLL = System.nanoTime();
        stringsLL.add("element1001");
        finishLL = System.nanoTime();
        startAL = System.nanoTime();
        stringsLL.add("element1001");
        finishAL = System.nanoTime();
        System.out.println("------" + (finishLL - startLL) + "/" + (finishAL - startAL));

        System.out.println("\nSET:");
        System.out.println("--Integers:");
        startLL = System.nanoTime();
        integersLL.set(500, 1001);
        finishLL = System.nanoTime();
        startAL = System.nanoTime();
        integersAL.set(500, 1001);
        finishAL = System.nanoTime();
        System.out.println("------" + (finishLL - startLL) + "/" + (finishAL - startAL));

        System.out.println("--Strings:");
        startLL = System.nanoTime();
        stringsLL.set(500, "element1001");
        finishLL = System.nanoTime();
        startAL = System.nanoTime();
        stringsAL.set(500, "element1001");
        finishAL = System.nanoTime();
        System.out.println("------" + (finishLL - startLL) + "/" + (finishAL - startAL));

        System.out.println("\nGET:");
        System.out.println("--Integers:");
        startLL = System.nanoTime();
        integersLL.get(500);
        finishLL = System.nanoTime();
        startAL = System.nanoTime();
        integersLL.get(500);
        finishAL = System.nanoTime();
        System.out.println("------" + (finishLL - startLL) + "/" + (finishAL - startAL));

        System.out.println("--Strings:");
        startLL = System.nanoTime();
        stringsLL.get(500);
        finishLL = System.nanoTime();
        startAL = System.nanoTime();
        stringsAL.get(500);
        finishAL = System.nanoTime();
        System.out.println("------" + (finishLL - startLL) + "/" + (finishAL - startAL));

        System.out.println("\nREMOVE:");
        System.out.println("--Integers:");
        startLL = System.nanoTime();
        integersLL.remove((Integer) 1001);
        finishLL = System.nanoTime();
        startAL = System.nanoTime();
        integersAL.remove((Integer) 1001);
        finishAL = System.nanoTime();
        System.out.println("------" + (finishLL - startLL) + "/" + (finishAL - startAL));

        System.out.println("--Strings:");
        startLL = System.nanoTime();
        stringsLL.remove("element1000");
        finishLL = System.nanoTime();
        startAL = System.nanoTime();
        stringsAL.remove("element1000");
        finishAL = System.nanoTime();
        System.out.println("------" + (finishLL - startLL) + "/" + (finishAL - startAL));

    }

    public static void generateElementsInt(List<Integer> list, int numberOfElements) {
        Integer i = 0;
        while (i < numberOfElements) {
            list.add(++i);
        }
    }

    public static void generateElementsStr(List<String> list, int numberOfElements) {
        Integer i = 0;
        while (i < numberOfElements) {
            list.add("element" + ++i);
        }
    }
}
