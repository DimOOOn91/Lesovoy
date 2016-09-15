package module02.homework;

public class Task1 {

    //variables
    static int[] arrayInt = {-1, 8, 665, -99, -15, 555, 774, 23, 45, 320};
    static double[] arrayDouble = {-0.2, 12.45, 65.12, -19.9, -65.65, 355.44, 74.8, -23.0, 145.56, 35.2};

    //int sum method
    static int sum(int[] array) {
        int sum = 0;
        for (int item : array) {
            sum += item;
        }
        return sum;
    }

    //double sum method
    static double sum(double[] array) {
        double sum = 0;
        for (double item : array) {
            sum += item;
        }
        return sum;
    }

    //int min method
    static int min(int[] array) {
        int min = array[0];
        for (int item = 0; item < array.length; item++) {
            if (array[item] < min) min = array[item];
        }
        return min;
    }

    //double min method
    static double min(double[] array) {
        double min = array[0];
        for (double item : array) {
            if (item < min) min = item;
        }
        return min;
    }

    //int max method
    static int max(int[] array) {
        int max = array[0];
        for (int item : array) {
            if (item > max) max = item;
        }
        return max;
    }

    //double max method
    static double max(double[] array) {
        double max = array[0];
        for (int item = 0; item < array.length; item++) {
            if (array[item] > max) max = array[item];
        }
        return max;
    }

    //int maxPositive method
    static int maxPositive(int[] array) {
        int maxPositive = array[0];
        for (int item : array) {
            if (item >= 0 && item > maxPositive) {
                maxPositive = item;
            }
        }
        return maxPositive;
    }

    //double maxPositive method
    static double maxPositive(double[] array) {
        double maxPositive = array[0];
        for (int item = 0; item < array.length; item++) {
            if (array[item] >= 0 && array[item] > maxPositive) {
                maxPositive = array[item];
            }
        }
        return maxPositive;
    }

    //int multiplication method
    static int multiplication(int[] array) {
        int multiplication = 1;
        for (int item : array) {
            multiplication *= item;
        }
        return multiplication;
    }

    //double multiplication method
    static double multiplication(double[] array) {
        double multiplication = 1;
        for (double item : array) {
            multiplication *= item;
        }
        return multiplication;
    }

    //int modulus of first and last item of array
    static int modulus(int[] array) {
        return array[0] % array[array.length - 1];
    }

    //double modulus of first and last item of array
    static double modulus(double[] array) {
        return array[0] % array[array.length - 1];
    }

    //second largest item in int array
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

    //second largest item in double array
    static double secondLargest(double[] array) {
        double max = max(array);
        double secondLargest = min(array);
        for (double item : array) {
            if (item > secondLargest && item < max) {
                secondLargest = item;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        System.out.println("Total sum in the Integer array is: " + sum(arrayInt));
        System.out.println("Total sum in the Double array is: " + sum(arrayDouble));
        System.out.println("Min item in the Integer array is: " + min(arrayInt));
        System.out.println("Min item in the Double array is: " + min(arrayDouble));
        System.out.println("Max item in the Integer array is: " + max(arrayInt));
        System.out.println("Max item in the Double array is: " + max(arrayDouble));
        System.out.println("Max positive item in the Integer array is: " + maxPositive(arrayInt));
        System.out.println("Max positive item in the Double array is: " + maxPositive(arrayDouble));
        System.out.println("Multiplication of all items in the Integer array is: " + multiplication(arrayInt));
        System.out.println("Multiplication of all items in the Double array is: " + multiplication(arrayDouble));
        System.out.println("Modulus of the first and the last item in the Integer array is: " + modulus(arrayInt));
        System.out.println("Modulus of the first and the last item in the Double array is: " + modulus(arrayDouble));
        System.out.println("Second largest item in the Integer array is: " + secondLargest(arrayInt));
        System.out.println("Second largest item in the Double array is: " + secondLargest(arrayDouble));
    }
}
