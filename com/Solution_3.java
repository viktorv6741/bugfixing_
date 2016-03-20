package com;

import java.util.Collection;
import java.util.Random;
import java.util.HashSet;
import java.util.ArrayList;

public class Solution_3 {

    private final static int TOTAL_ELEMS = 10;
    private final static Random random = new Random();

    public static void main(String[] args) {

        Collection integers = new HashSet();

        for (int i = 0; i < TOTAL_ELEMS; ++i) {
            integers.add(random.nextInt());
        }

        //Collection collection = Collections.unmodifiableCollection(integers);
        Collection collection = new ArrayList<Integer>(integers);

        collection.add(random.nextInt());


        // We can not modify "collection" because of final;


         /* final Collection<? extends E> c;

        UnmodifiableCollection(Collection < ?extends E > c){
            if (c == null)
                throw new NullPointerException();
            this.c = c;
        }*/

    }
}
