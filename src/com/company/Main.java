package com.company;

import com.company.algorithms.javapuzzlers.Oddity;
import com.company.algorithms.javapuzzlers.TimeForAChange;

import static com.company.algorithms.javapuzzlers.Oddity.isOdd;
import static com.company.algorithms.javapuzzlers.TimeForAChange.compareIntsToBigDecimal;
import static com.company.algorithms.leetcode.ConvertANumberToHexadecimal.*;

public class Main {

    public static void main(String[] args) {

//        HashMap<String, Integer> happy = new HashMap<String, Integer>();
//        happy.put("a", 10);
//        happy.put("b", 100);
//        happy.put("c", 12);
//
//        System.out.println(happy.values()
//        );
//
        //Reverse
//        char inputArray[]={'t','h','r','e','e', ' ', 't','w','o',' ','o','n','e'};
//        reverseTheWordsInPlace(inputArray);
//        System.out.println(inputArray);

        //medianOfTwoSortedArrays
//        medianOfTwoSortedArrays(new int[]{}, new int[]{});

        //max profit
//        maxProfit(new int[] {7,1,5,3,6,4});

        //Closest Pair
//        closestPair(new int[]{-1, 3, 8, 2, 9, 5}, new int[]{4, 1, 2, 10, 5, 20}, 24);

        //Palindrome
//        System.out.println(isPalindrome(new String("PO")));

//        ----- DataStructureReviews ------

//        dataStructureReviewHashSet();

//        dataStructureReviewLinkedList();

//        System.out.println(toHex(4512));

//        System.out.println(convertANumberToHexadecimal(0));

//        Puzzle: 1
//        System.out.println(isOdd(-2));
        System.out.println(Oddity.isEven(-0));

        compareIntsToBigDecimal();

    }
}
