package com.carlosguemes.lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample5 {

    public static void main(String[] args) {
        List<String> progLangs = new ArrayList<>();
        progLangs.add("C");
        progLangs.add("C++");
        progLangs.add("Java");

        for (String str : progLangs) {
            System.out.println(str);
        }

        progLangs.forEach(element -> System.out.println(element));
    }
}
