package com.company.algorithms.javapuzzlers;

public class LongDivision {
//    from page: 9
//    Puzzle: 3 Long Division

    //This puzzle is called Long Division because it concerns a program that divides two long values. The dividend
    // represents the number of microseconds in a day; the divisor, the number of milliseconds in a day.
    // What does the program print?

//    Further Clarification
//    The number of microseconds per day is
//    (24 hours/day · 60 minutes/hour · 60 seconds/minute · 1,000 milliseconds/second· 1,000 microseconds/millisecond).
//    The number of milliseconds per day differs only in that it is missing the final factor of 1,000.


    //changed method signature to call from main Main
        public static void origionalLongDivision(){
            final long MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000;
            final long MILLIS_PER_DAY = 24L * 60 * 60 * 1000;
            System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
    }

    public static void fixedLongDivision(){
        final long MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24L * 60 * 60 * 1000;
        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
    }
    //need to add "L's" to the beining of the calculations
    //in the above version the numbers being calculated were ending up ints.
        // -> "When you multiply two int values, you get another int value. Java does not have target typing, a language
        //    feature wherein the type of the variable in which a result is to be stored influences the type of the computation.
}
