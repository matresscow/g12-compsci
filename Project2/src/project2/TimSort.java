/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is the default sort used by java. It is a combination of insertion sort
 * and merge sort. Since the sort method is the same for all methods, it will
 * only be commented in this sort. This sort will be used as a comparison for
 * times. Compared to the other sorts in the project, it is almost always the
 * fastest due to its optimization and efficient implementation.
 */
public class TimSort extends Sort {

//    the generic sort method records things such as time taken and prints out the output
    public static ArrayList sort(ArrayList<String> list) {
//        show that something is happening behind the scenes
        System.err.println("working . . .");
//        record the time at the beginning of the sort
        long time = -System.currentTimeMillis();
//        do the sort
        list = theSort(list);
//        get the difference
        time += System.currentTimeMillis();
//        print out the output in red text so you know that it's the output
        for (String string : list) {
            System.err.println(string);
        }
//        display how much time it took
        System.err.println("The sort took " + (time) + " milliseconds to complete.");
//        flush the print stream just in case it mingles with anything
        System.err.flush();
//        make sure it's sorted, or else throw an exception
        if (!isSorted(list)) {
            throw new ArithmeticException();
        }
//        return the list as a formality for usability
        return list;
    }

    public static ArrayList<String> theSort(List<String> list) {
//        make the standard library do all the work
        Collections.sort(list);
        return (ArrayList) list;
    }
}
