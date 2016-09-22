package module06.homework;

import java.util.Arrays;

public final class ArraysUtils {

    public static int sum(int[] array) {
        int sum = 0;
        for (int item : array) {
            sum += item;
        }
        return sum;
    }

    public static double sum(double[] array) {
        double sum = 0;
        for (double item : array) {
            sum += item;
        }
        return sum;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int item = 0; item < array.length; item++) {
            if (array[item] < min) min = array[item];
        }
        return min;
    }

    public static double min(double[] array) {
        double min = array[0];
        for (double item : array) {
            if (item < min) min = item;
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int item : array) {
            if (item > max) max = item;
        }
        return max;
    }

    public static int maxPositive(int[] array) {
        int maxPositive = array[0];
        for (int item : array) {
            if (item >= 0 && item > maxPositive) {
                maxPositive = item;
            }
        }
        return maxPositive;
    }

    public static int multiplication(int[] array) {
        int multiplication = 1;
        for (int item : array) {
            multiplication *= item;
        }
        return multiplication;
    }

    public static int modulus(int[] array) {
        return array[0] % array[array.length - 1];
    }

    public static int secondLargest(int[] array) {
        int[] chackArray = {array[0], array[1]};
        for (int item : array) {
            if (item > chackArray[1]) {
                chackArray[0] = chackArray[1];
                chackArray[1] = item;
            }
            else if (item > chackArray[0] && item < chackArray[1] || chackArray[0] == chackArray[1]) {
                chackArray[0] = item;
            }
        }
        return chackArray[0];
    }

    public static int[] reverse(int[] array) {
        int temp;

        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static int[] findEvenElements(int[] array) {

        int[] result = new int[0];
        for (int element : array) {
            if (element % 2 == 0) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = element;
            }
        }
        return result;
    }

}
