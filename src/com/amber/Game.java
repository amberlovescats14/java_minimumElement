package com.amber;

import java.util.Arrays;
import java.util.Scanner;

public class Game {



    public String readIntegers(int count){
        int[] numArr = new int[count];
        Scanner scan = new Scanner(System.in);
        for(int i=0; i < numArr.length; i++){
            System.out.print("Enter int at " + i + ": ");
            numArr[i] = scan.nextInt();
        }
        return Arrays.toString(numArr);
    }

    public int findMin(int[] arr){
       Arrays.sort(arr);
        return arr[0];
    }
}
