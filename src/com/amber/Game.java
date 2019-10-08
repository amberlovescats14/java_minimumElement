package com.amber;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    private int[] arrayOfNums;


    public int readIntegers(int count){
        int[] numArr = new int[count];
        Scanner scan = new Scanner(System.in);
        for(int i=0; i < numArr.length; i++){
            System.out.print("Enter int at " + i + ": ");
            numArr[i] = scan.nextInt();
        }
        this.arrayOfNums = numArr;
        System.out.println(Arrays.toString(arrayOfNums));
        return findMin();
    }

    public int findMin(){
       Arrays.sort(arrayOfNums);
        System.out.println("The lowest number in this array is " + arrayOfNums[0]);
        return arrayOfNums[0];
    }
}
