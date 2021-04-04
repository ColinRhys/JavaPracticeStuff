package com.company.algorithms;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static double medianOfTwoSortedArrays(int[] nums1, int[] nums2){
        //measurements for merged array
        int arrayOneLength = nums1.length;
        int arrayTwoLength = nums2.length;
        int[] mergedArray = new int[arrayOneLength+arrayTwoLength];
        int mergedArrayCount = 0;

        //Median Num Returned
        double resultDouble = 0;

        //Index of Merged Array Stuff
        double leftNum = 0;
        double rightNum = 0;

        //Add Number Array 1 to Merged Array
        for(int i = 0; i < nums1.length; i++){
            mergedArray[i] = nums1[i];
            mergedArrayCount++;
        }

        //Add Number Array 2 to Merged Array
        for(int j = 0; j < nums2.length; j++){
            mergedArray[mergedArrayCount++] = nums2[j];
        }

        //sort array
        Arrays.sort(mergedArray);

        //Checking numbers
        System.out.println("For Loop Merged Array:");
        for(int k = 0; k < mergedArray.length; k++){
            System.out.println(mergedArray[k]);
        }
        System.out.println("End of for loop number");

        //Even
        if(mergedArray.length % 2 == 0){
            leftNum = mergedArray[(mergedArray.length/2)-1];
            System.out.println("left num is");
            System.out.println(leftNum);
            rightNum = mergedArray[mergedArray.length/2];
            System.out.println("right num is");
            System.out.println(rightNum);
            System.out.println("length of mergedArray is");
            System.out.println(mergedArray.length);
            resultDouble = (leftNum + rightNum) / 2;
        } else { // Odd
            double oddLengthIndex = Math.ceil(mergedArray.length/2);
            resultDouble = mergedArray[(int) oddLengthIndex];
        }

        System.out.println("ResultDouble");
        System.out.println(resultDouble);
        return resultDouble;
    }
}
