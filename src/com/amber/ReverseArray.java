package com.amber;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {

    public void reverse(int[] arr) {
        byte count = 0;
        int[] newArr = new int[arr.length];
        for(int i=arr.length-1; i >= 0; i--){
            newArr[count] = arr[i];
            count++;
        }
        System.out.println("Original: " + Arrays.toString(arr));
        System.out.println("Reverse: " + Arrays.toString(newArr));
    }
}
