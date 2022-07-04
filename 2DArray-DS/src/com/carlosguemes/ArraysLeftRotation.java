package com.carlosguemes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysLeftRotation {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(41,73,89,7,10,1,59,58,84,77,77,97,58,1,86,58,26,10,86,51);
        System.out.println(rotLeft(numbers, 10));

    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {

        List<Integer> myArray = new ArrayList<>(a);


//        a.forEach(s -> {
//
//            int newIndex = (a.indexOf(s) + (a.size() - d)) % a.size();
//
//            myArray.set(newIndex, s);
//        });

        for (int i = 0; i < a.size(); i++) {
            int newIndex = (i + (a.size() - d)) % a.size();

            myArray.set(newIndex, a.get(i));
        }

        return myArray;
    }
}
