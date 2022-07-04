package com.carlosguemes.lambdas;

interface Addable {
    int add(int a, int b);
}
public class LambdaExample3 {
    public static void main(String[] args) {
//        Addable addable = new Addable() {
//            @Override
//            public int add(int a, int b) {
//                return a + b;
//            }
//        };
//
//        System.out.println(addable.add(10,20));

        Addable addable = (a, b) -> {
            System.out.println(a);
            System.out.println(b);
            return (a + b);
        };
        System.out.println(addable.add(10,20));
    }
}
