package com.company.algorithms;

public class ClosestToTargetNumber {
    // url = https://www.youtube.com/watch?v=GBuHSRDGZBY
    //given two arrays find the pair of numbers that gets closet to the given target number

    public static int[] closestPair(int[] numbs1, int[] numbs2, int targetNum){
        int[] resultPair = new int[2];
        int referenceNum = numbs1[0] - numbs2[0];

        for(int i = 0; i < numbs1.length; i++){
            for(int j = 0; j < numbs2.length; j++){
                if(Math.abs(targetNum - numbs1[i] - numbs2[j]) < Math.abs(referenceNum)){
                    resultPair[0] = numbs1[i];
                    resultPair[1] = numbs2[j];
                    referenceNum = Math.abs(targetNum - (numbs1[i] + numbs2[j]));
                }
            }
        }
        System.out.println("Beginning of for loop");
        for(int k = 0; k < resultPair.length; k++){
            System.out.println(resultPair[k]);
        }
        System.out.println("End of for loop");
        return resultPair;
    }
}
