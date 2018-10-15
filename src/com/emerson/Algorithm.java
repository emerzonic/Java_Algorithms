package com.emerson;

import java.util.ArrayList;

public class Algorithm {

    //Find the first dupulicate in a list. return -1 if no duplicate
    public static int firstDuplicate(int[] a) {
        ArrayList<Integer> tracker = new ArrayList<>();
        for(int number: a){
            if(tracker.contains(number)){
                return number;
            }
            tracker.add(number);
        }
        return -1;
    }
}
