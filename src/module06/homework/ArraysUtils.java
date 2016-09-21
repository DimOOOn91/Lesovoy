package module06.homework;

public final class ArraysUtils {

    static int sum(int[] array) {
        int sum = 0;
        for (int item : array) {
            sum += item;
        }
        return sum;
    }

    static double sum(double[] array) {
        double sum = 0;
        for (double item : array) {
            sum += item;
        }
        return sum;
    }

    static int min(int[] array) {
        int min = array[0];
        for (int item = 0; item < array.length; item++) {
            if (array[item] < min) min = array[item];
        }
        return min;
    }

    static double min(double[] array) {
        double min = array[0];
        for (double item : array) {
            if (item < min) min = item;
        }
        return min;
    }

    static int max(int[] array) {
        int max = array[0];
        for (int item : array) {
            if (item > max) max = item;
        }
        return max;
    }

    static int maxPositive(int[] array) {
        int maxPositive = array[0];
        for (int item : array) {
            if (item >= 0 && item > maxPositive) {
                maxPositive = item;
            }
        }
        return maxPositive;
    }

    static int multiplication(int[] array) {
        int multiplication = 1;
        for (int item : array) {
            multiplication *= item;
        }
        return multiplication;
    }

    static int modulus(int[] array) {
        return array[0] % array[array.length - 1];
    }

    static int secondLargest(int[] array) {
        int max = max(array);
        int secondLargest = min(array);
        for (int item : array) {
            if (item > secondLargest && item < max) {
                secondLargest = item;
            }
        }
        return secondLargest;
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

        int[] temp = new int[array.length];
        int counter = 0;

        for (int element : array) {
            if (((double) element / 2) - (element / 2) == 0) {
                temp[counter++] = element;
            }
        }

        int[] arrayOfEvenElements = new int[counter];
        System.arraycopy(temp, 0, arrayOfEvenElements, 0, counter);
        return arrayOfEvenElements;
    }


}
