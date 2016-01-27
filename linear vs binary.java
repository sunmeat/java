package com.sunmeat;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        // integer data array
        int ar[] = new int[10000000];

        // fill array by random values
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 10000000);
        }

        // print array
        for (int i = 0; i < ar.length; i++) {
            //System.out.print(i + " - " + ar[i] + ", ");
        }

        // some value to find in array
        int valueToFind = 1547;

        //////////////////////////////////////////////////////////////////
        // linear search
        //////////////////////////////////////////////////////////////////
		
        int linearIterationCount = 0;
        int linearIndex = -1;

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < ar.length; i++) {
            linearIterationCount++;
            if (ar[i] == valueToFind) {
                linearIndex = i;
                break;
            }
        }

        long endTime = System.currentTimeMillis();
        long workTime = endTime - startTime;

        System.out.println("\nValue was find by index: " + linearIndex);
        System.out.println("Linear iteration count: " + linearIterationCount);
        System.out.println("Linear search work time: " + workTime + "ms.");
        System.out.println("\n////////////////////////////////////////");
		
        //////////////////////////////////////////////////////////////////
        // binary search
        //////////////////////////////////////////////////////////////////

        int binaryIterationCount = 0;
        int binaryIndex = -1;

        Arrays.sort(ar); // very important!!!

        // print sorted array
        for (int i = 0; i < ar.length; i++) {
            //System.out.print(i + " - " + ar[i] + ", ");
        }

        startTime = System.currentTimeMillis();

        int L = 0, R = ar.length - 1; // left and right border
        int M; // median element index
        while (true) {
            binaryIterationCount++;
            M = L + (R - L) / 2; // or (L + R) / 2
            if (ar[M] > valueToFind)
                R = M - 1;
            else if (ar[M] < valueToFind)
                L = M + 1;
            else {
                binaryIndex = M;
                break;
            }
            if (L > R)
                break; // oops!
        }

        endTime = System.currentTimeMillis();
        workTime = endTime - startTime;

        System.out.println("\nValue was find by index: " + binaryIndex);
        System.out.println("Binary Iteration count: " + binaryIterationCount);
        System.out.println("Binary search work time: " + workTime + "ms.");

    }
}



