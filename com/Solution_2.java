package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_2 {
    public static void main(String[] args) {

        Integer[] arr = new Integer[]{12, 34, 56, 78, 98, 23};

        //List<Integer> aList = Arrays.asList(arr);
        List<Integer> aList = new ArrayList<Integer>(Arrays.asList(arr));

        System.out.println(arr[2]);

        aList.set(2, 22);           // We are using method set() in Arrays, not in ArrayList
        System.out.println(arr[2]);


     /*   I have found this method in Arrays.


        private static class ArrayList<E> extends AbstractList<E>
                implements RandomAccess, java.io.Serializable {
            private static final long serialVersionUID = -2764017481108945198L;
            private final E[] a;

            ArrayList(E[] array) {
                if (array == null)
                    throw new NullPointerException();
                a = array;
            }*/

    }
}








