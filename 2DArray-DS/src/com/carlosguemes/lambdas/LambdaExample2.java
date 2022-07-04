package com.carlosguemes.lambdas;

interface Printable2 {
    void print(String message);
}
public class LambdaExample2 {

    public static void main(String[] args) {
//        Printable printable = new Printable() {
//            @Override
//            public void print(String message) {
//                System.out.println(message);
//            }
//        };
//
//        printable.print("lambda example with single parameter");


        Printable2 printable = (message)-> System.out.println(message);
        printable.print("lambda example with single parameter");
    }
}
