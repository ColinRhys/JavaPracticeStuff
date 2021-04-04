package com.company.algorithms.javapuzzlers;

public class Oddity {
//    from page: 5
//    Puzzle: 1 Oddity

    //Puzzle 1: Oddity The following method purports to determine whether its sole argument is an odd number. Does the method work?
//        - if all number were positive this would work
//        - however fails on all negative numbers and so over all does not work

    public static boolean isOdd(int i) {
        return i % 2 == 1;
    }

    //changed 1 to 0
    // - renamed method to to "isEven"
    // - works when statement does not have number that depends on being positive or negative
    public static boolean isEven(int i) {
        return i % 2 == 0;
    }

}
