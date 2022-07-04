package com.carlosguemes.lambdas.John;

public class Lambdas {
    public static void main(String[] args) {


        Printable lambdaPrintable = (s) -> "Meow" + s;

        printThing(lambdaPrintable);




    }

    static void printThing(Printable thing) {
        thing.print("!");
    }

}
