package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class DataStructureReviews {
    // March 31st 2021
    //Starting with reviewing items at url - https://www.geeksforgeeks.org/data-structures/

    //HashSet (carry over from something else link above next)
//        Notes on HashSet
//        - HashSet Does not maintain any order while LinkedinHashSet maintains insertion order of elements much like List interface and TreeSet maintains sorting order of elements
    public static void dataStructureReviewHashSet(){
        HashSet<String> cats = new HashSet<String>();
        cats.add("cat one");
        cats.add("cat two");
        cats.add("cat three");


        //Print out the Hashset
        System.out.println(cats);


        //Turn HashSet cats into array
        Object[] catsArray = cats.toArray();
        //Print out index of array
        System.out.println("Print index 1 of Hashset turned into array");
        System.out.println(catsArray[1]);

        //Iterator
        System.out.println("Start of Iterator<> stuff");
        Iterator<String> i = cats.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
    //LinkedList
//    Notes
//    - Maintains insertion order
//    - can contain duplicate elements
//    - Java LinkedList class manipulation is fast because there is no shifting that needs to occur
//    - java LinkedList class can be used as a list, stack or queue
    public static void dataStructureReviewLinkedList(){
        //Strings LinkedList
        System.out.println("Start of String LinkedList stuff");
        LinkedList<String> alphaBravo = new LinkedList<String>();

        alphaBravo.add("James");
        alphaBravo.add("Howard");
        alphaBravo.add("Jimmy");

        System.out.println(alphaBravo);

        //Integers LinkedList
        System.out.println("Start of Interger LinkedList stuff");
        LinkedList<Integer> integersLinkedList = new LinkedList<Integer>();

        integersLinkedList.add(12);
        integersLinkedList.add(47);
        integersLinkedList.add(98);

        System.out.println(integersLinkedList);

        //Get specific elements out of integersLinkedList by element
        System.out.println(integersLinkedList.get(1));

        //Iterator Stuff - example of get specific example
        Iterator<Integer> i = integersLinkedList.iterator();
        while(i.hasNext()){
            if((int) i.next() == 47) {
                System.out.println("Found number 47");
            }
        }
    }
}
