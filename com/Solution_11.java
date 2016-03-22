package com;

import java.util.ArrayList;

public class Solution_11 {

    private ArrayList<String> storedStrings = new ArrayList<String>(); // Need to create an object

    public Solution_11() {
        
       // проверка длины стоки на соответсие условия
        
        this.storedStrings.add(0, "something");    // We need to put something in 0 element
        this.breakString(storedStrings.get(0));
    }

    private void breakString(String s) {
        if (s.length() > 9) {
            storedStrings.add(0, s.substring(s.length() - 9, s.length()));
            this.breakString(s.substring(0, s.length() - 9));
        } else {
            this.storedStrings.add(0, s);
        }
    }

    public static void main(String[] args) {
        new Solution_11();
    }
}
