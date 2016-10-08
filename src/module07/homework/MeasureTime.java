package module07.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MeasureTime {

    public static void main(String[] args) {

        List<Integer> integers1000 = new LinkedList<>();
        List<Integer> integers10000 = new LinkedList<>();

        List<String> strings1000 = new LinkedList<>();
        List<String> strings10000 = new LinkedList<>();

        generateElementsInt(integers1000, 1000);
        generateElementsInt(integers10000, 10000);
        generateElementsStr(strings1000, 1000);
        generateElementsStr(strings10000, 10000);

        System.out.println("ADD:");
        System.out.println("--Integers:");
        System.out.println("----1000:");
        long start = System.currentTimeMillis();
        integers1000.add(1001);
        long finish = System.currentTimeMillis();
        System.out.println("------" + (finish - start));

        System.out.println("----10000:");
        long start1 = System.currentTimeMillis();
        integers10000.add(10001);
        long finish1 = System.currentTimeMillis();
        System.out.println("------" + (finish1 - start1));

        System.out.println("--Strings:");

        System.out.println("----1000:");
        long start2 = System.currentTimeMillis();
        strings1000.add("element1001");
        long finish2 = System.currentTimeMillis();
        System.out.println("------" + (finish2 - start2));

        System.out.println("----10000:");
        long start3 = System.currentTimeMillis();
        strings10000.add("element10001");
        long finish3 = System.currentTimeMillis();
        System.out.println("------" + (finish3 - start3));


        System.out.println("\nSET:");
        System.out.println("--Integers:");
        System.out.println("----1000:");
        long start4 = System.currentTimeMillis();
        integers1000.set(500, 1001);
        long finish4 = System.currentTimeMillis();
        System.out.println("------" + (finish4 - start4));

        System.out.println("----10000:");
        long start5 = System.currentTimeMillis();
        integers10000.set(5000, 10001);
        long finish5 = System.currentTimeMillis();
        System.out.println("------" + (finish5 - start5));

        System.out.println("--Strings:");

        System.out.println("----1000:");
        long start6 = System.currentTimeMillis();
        strings1000.set(500, "element1001");
        long finish6 = System.currentTimeMillis();
        System.out.println("------" + (finish6 - start6));

        System.out.println("----10000:");
        long start7 = System.currentTimeMillis();
        strings10000.set(5000, "element10001");
        long finish7 = System.currentTimeMillis();
        System.out.println("------" + (finish7 - start7));


        System.out.println("\nGET:");
        System.out.println("--Integers:");
        System.out.println("----1000:");
        long start8 = System.currentTimeMillis();
        integers1000.get(500);
        long finish8 = System.currentTimeMillis();
        System.out.println("------" + (finish8 - start8));

        System.out.println("----10000:");
        long start9 = System.currentTimeMillis();
        integers10000.get(5000);
        long finish9 = System.currentTimeMillis();
        System.out.println("------" + (finish9 - start9));

        System.out.println("--Strings:");

        System.out.println("----1000:");
        long start10 = System.currentTimeMillis();
        strings1000.get(500);
        long finish10 = System.currentTimeMillis();
        System.out.println("------" + (finish10 - start10));

        System.out.println("----10000:");
        long start11 = System.currentTimeMillis();
        strings10000.get(5000);
        long finish11 = System.currentTimeMillis();
        System.out.println("------" + (finish11 - start11));


        System.out.println("\nREMOVE:");
        System.out.println("--Integers:");
        System.out.println("----1000:");
        long start12 = System.currentTimeMillis();
        integers1000.remove((Integer) 1001);
        long finish12 = System.currentTimeMillis();
        System.out.println("------" + (finish12 - start12));

        System.out.println("----10000:");
        long start13 = System.currentTimeMillis();
        integers10000.remove((Integer) 10000);
        long finish13 = System.currentTimeMillis();
        System.out.println("------" + (finish13 - start13));

        System.out.println("--Strings:");

        System.out.println("----1000:");
        long start14 = System.currentTimeMillis();
        strings1000.remove("element1000");
        long finish14 = System.currentTimeMillis();
        System.out.println("------" + (finish14 - start14));

        System.out.println("----10000:");
        long start15 = System.currentTimeMillis();
        strings10000.remove("element10000");
        long finish15 = System.currentTimeMillis();
        System.out.println("------" + (finish15 - start15));

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
