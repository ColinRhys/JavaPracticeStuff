package com.company.algorithms.javapuzzlers;

import java.math.BigDecimal;

public class TimeForAChange {
//    from page: 7
//    Puzzle: 2 Time for A Change
//Consider the following word problem: Tom goes to the auto parts store to buy a spark plug that costs $1.10, but all he
// has in his wallet are two-dollar bills. How much change should he get if he pays for the spark plug with a two-dollar bill?
// Here is a program that attempts to solve the word problem. What does it print?

//    public class Change {
//        public void main(String args[]) {
//            System.out.println(2.00 - 1.10);
//        }
//    }
//
//    public static class ChangeFixed {
//        public static void main(String args[]) {
//            System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
//        }
//    }

    // run function blow to see comparison to see why to not use type "ints" when doing dollar calculations as an example

    // Best highlight from the chaper to the book

//    "In summary, avoid float and double where exact answers are required; for monetary calculations, use int, long, or
//    BigDecimal. For language designers, consider providing linguistic support for decimal arithmetic. One approach is
//    to offer limited support for operator overloading, so that arithmetic operators can be made to work with numerical
//    reference types, such as BigDecimal. Another approach is to provide a primitive decimal type, as did COBOL and PL/I."


    public static void compareIntsToBigDecimal() {
        System.out.println("Returning the same calculation 2.00 - 1.10 with different types. Ints not correct as can see");
        System.out.println("ints below");
        System.out.println(2.00 - 1.10);
        System.out.println("Big Decimal below");
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
    }
}
