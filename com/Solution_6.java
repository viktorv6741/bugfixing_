package com;

public class Solution_6 {

    public static void recursivePrint(int num) {

        System.out.println("Number: " + num);

        if (num == 4)
            return;
        else
            recursivePrint(--num);  // Our  if(num == 4) will work, if we decrement num variable :)
}

    public static void main(String[] args) {
        Solution_6.recursivePrint(10);
    }

}
