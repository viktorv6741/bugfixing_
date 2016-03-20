package com;

import java.util.Arrays;

public class Solution_4 {
    public static void main(String[] args) {

        int[] masForCopy = new int[]{1, 3, 4, 5, 6, 7, 8};

        System.out.println("before changes " + masForCopy);


        //Arrays.copyOf(masForCopy, 3);
        masForCopy = Arrays.copyOf(masForCopy, 3);  // If we like to see different hash code, we need to make in this way :)


        System.out.println("after changes " + masForCopy);//is it the same?)))))

    }
}
