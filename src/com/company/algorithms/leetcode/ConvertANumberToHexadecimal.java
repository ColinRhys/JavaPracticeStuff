package com.company.algorithms.leetcode;


public class ConvertANumberToHexadecimal {
//    From LeetCode.com
//    url = https://leetcode.com/problems/convert-a-number-to-hexadecimal
//    ##### The algorithm I will never get wrong again !!!!!
//
//    Add notes about Hexadecimal numbers
//    - the pattern
//    - the math
//    - add reference articles
//
//    Description:
//
//    Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, two’s complement method is used.
//
//            Note:
//
//    All letters in hexadecimal (a-f) must be in lowercase.
//    The hexadecimal string must not contain extra leading 0s. If the number is zero, it is represented by a single zero character '0'; otherwise, the first character in the hexadecimal string will not be the zero character.
//    The given number is guaranteed to fit within the range of a 32-bit signed integer.
//    You must not use any method provided by the library which converts/formats the number to hex directly.
//    Example 1:
//
//    Input:
//            26
//
//    Output:
//            "1a"
//    Example 2:
//
//    Input:
//            -1
//
//    Output:
//            "ffffffff"

//    FOR 4/2/21 morning. SOLVE
//

    public static String convertANumberToHexadecimal(int num){

        //if num is 10 or less
        if(num < 10 && num > -1){
            return Integer.toString(num);
        }

        //if num is < 0 - per example above of -1.
        if(num < 0){
            return "ffffffff";
        }

        //create new string builder to hold answer we will assemble below
        StringBuilder result = new StringBuilder();

        //the hexadecimal alphabet in order so we can get correct letter/number based on remainder below
        char[] hexNums = new char[]  { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        //temp to hold remainder
        int remainder = 0;

        while (num > 0){
            //calculate the remainder which will be our character
            remainder = num % 16;
            //if the number is 0 and all that was left was the remainder add character to stringbuilder and then break
            if(num == 0){
                result.insert(0, hexNums[remainder]);
                break;
            } else {
                //if not last character
                //add character to string builder we will return
                result.insert(0, hexNums[remainder]);
                //subtract the part we just calculated. would break if we fiddled with the type of the field.
                num = (num/16);
            }
        }

        return result.toString();
    }
}
