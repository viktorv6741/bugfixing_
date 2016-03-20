package com;

public class Solution_5 {

    public static void main(String[] args) {

        Integer[] integers = {1, 6, 4, 3, 2, 21, 1};

        Integer i = binarySearchIterative(integers, 21);

        System.out.println(i); //---6?
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
