package com.company;

public class Palindrome {
    public static boolean isPalindrome(String s){

        String newCompareString = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reverseNewCompareString = new StringBuilder(newCompareString).reverse().toString().toLowerCase();
        //char[] compareCharArray = new char[newCompareString.length()];

        System.out.println("New Compare String");
        System.out.println(newCompareString);
        System.out.println("Reverse Compare String");
        System.out.println(reverseNewCompareString);


        //Integrator for while loop
        int i = 0;

        while(i < newCompareString.length()){
            if(newCompareString.charAt(i) == reverseNewCompareString.charAt(i)){
                i++;
            } else {
              return false;
            }
        }

        return true;
    }
}
