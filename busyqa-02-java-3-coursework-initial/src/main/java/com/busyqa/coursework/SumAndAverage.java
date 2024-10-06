package com.busyqa.coursework;

@SuppressWarnings("unused")
public class SumAndAverage {
    public static void main (String[] args) {
        int sum = 0;          // Store the accumulated sum, init to 0
        double average;       // average in double
        int lowerbound = 1;   // The lowerbound to sum
        int upperbound = 100; // The upperbound to sum

        // Use a for-loop to sum from lowerbound to upperbound
        for (int i = lowerbound; i <= upperbound;i++) {
           sum=i+sum;           
         }
        average=sum/100;
        System.out.println("sum:"+sum);
        System.out.println("Average:"+average);
        // Compute average in d+sumouble. Beware that int/int produces int.
        // Print sum and average.
    }
}
