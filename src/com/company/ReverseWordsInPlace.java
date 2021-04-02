package com.company;

public class ReverseWordsInPlace {

    public static void reverseTheWordsInPlace(char[] inputArray){
        reverseWholeString(inputArray);
        reverseTheWords(inputArray);
    }

    private static void reverseWholeString(char[] inputArray){
        reverseWholeString(inputArray, 0, inputArray.length-1);
    }

    private static void reverseWholeString(char[] inputArray, int f, int t) {
        while (f < t){
            char temp = inputArray[f];
            inputArray[f] = inputArray[t];
            inputArray[t] = temp;
            t--;
            f++;
        }
    }

    private static void reverseTheWords(char[] inputArray) {
        int wf, wt;
        int current = 0;
        while (current < inputArray.length) {
            wf = current;
            wt = indexOf(inputArray, ' ', wf);
            if(-1 == wt){
                reverseWholeString(inputArray, wf, inputArray.length-1);
                current = inputArray.length;
            } else {
                reverseWholeString(inputArray, wf, wt-1);
                current = wt+1;
            }
        }
    }

    private static int indexOf(char[] inputArray, char sentinal, int start){
        for (int i=start; i < inputArray.length; i++){
            if(sentinal == inputArray[i]){
                return i;
            }
        }
        return -1;
    }

}
