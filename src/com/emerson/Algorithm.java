package com.emerson;

import java.util.ArrayList;

public class Algorithm {

    //Find the first dupulicate in a list. return -1 if no duplicate
    public static int firstDuplicate(int[] list) {
        ArrayList<Integer> tracker = new ArrayList<>();
        for(int number: list){
            if(tracker.contains(number)){
                return number;
            }
            tracker.add(number);
        }
        return -1;
    }
}
