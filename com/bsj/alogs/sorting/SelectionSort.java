package com.bsj.alogs.sorting;

import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
    int[] sortedArray;
    int minValue=Integer.MAX_VALUE;
    private int[] sort(int arr[]){
        //List intList=Arrays.asList(arr);
        sortedArray=new int[arr.length];
        int index=0;
        while(arr.length>0){
            int minIndex=-findMin(arr);
            sortedArray[index]=arr[minIndex];
            //Remove element from the minIndex
            index++;
        }
        return sortedArray;
    }

    private int findMin(int[] arr) {
        for(int i=0;i<arr.length;i++)
            if(arr[i]<minValue) minValue=arr[i];
        return minValue;
    }

    public static void main(String[] args) {

    }
}
