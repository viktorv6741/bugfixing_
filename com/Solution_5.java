package com;


public class Solution_5 {

    public static void main(String[] args) {

        Integer[] integers = {1, 6, 4, 3, 2, 21, 1};

        bubbleSort(integers);

        Integer i = binarySearchIterative(integers, 21);

        System.out.println(i); //---6?
    }

    public static <T extends Number> T[] bubbleSort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                if (array[j - 1].doubleValue() > array[j].doubleValue()) {
                    swap2(array, j);
                }
            }
        }
        return array;
    }

   /* Doesn't work (((

    private static <T extends Number> void swap1(T[] array, int j) {
        array[j - 1] = array[j - 1] + array[j];
        array[j] = array[j - 1] - array[j];
        array[j - 1] = array[j - 1] - array[j];
    }*/

    private static <T extends Number> void swap2(T[] array, int j) {
        T temp = array[j - 1];
        array[j - 1] = array[j];
        array[j] = temp;
    }

    public static <T extends Number> int binarySearchIterative(T[] array, T keyElement) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int avg = low + (high - low) / 2;
            if (keyElement == array[avg]) {
                return avg;
            } else if (keyElement.doubleValue() < array[avg].doubleValue()) { //keyElement must be less than array[avg]
                high = avg - 1;
            } else {
                low = avg + 1;
            }
        }
        return -1;
    }
}
