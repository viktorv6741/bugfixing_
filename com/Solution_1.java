package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Solution_1 {
    public static void main(String[] args) {

        String[] membersArray = new String[]{"1", "2", "3", "4", "5"};

        //List<String> membersList = Arrays.asList(membersArray);    I think this is not correct. It returns -> Arrays.ArrayList.

        List<String> membersList = new ArrayList<String>(Arrays.asList(membersArray));

        for (String member : membersList) {
            //List<String> seeAlso = null;                    // We created only reference, not object
            List<String> seeAlso = new ArrayList<String>();

            if (!seeAlso.contains(member)) {
                seeAlso.add(member);
            }
        }

        Iterator<String> iterator = membersList.iterator(); // We have got to use iterator instead of for each loop, over here.

        while (iterator.hasNext()) {
            iterator.next();      // next() need to invoke before remove();
            iterator.remove();
        }

        /*for (String m : membersList) {
            membersList.remove(m);
        }*/
    }
}
