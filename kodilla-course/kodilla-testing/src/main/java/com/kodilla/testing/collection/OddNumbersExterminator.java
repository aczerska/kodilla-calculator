package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    private ArrayList<Integer> numbers;

    public OddNumbersExterminator(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenValues = new ArrayList<Integer>();
        int tempValue;
        for(int n = 0; n < numbers.size(); n++) {
            tempValue = numbers.get(n);
            if(tempValue % 2 == 0) {
                evenValues.add(tempValue);
            }
        }
        return evenValues;
    }
}
