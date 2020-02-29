package com.bsj.alogs.sorting;


import java.util.LinkedList;

public class MergeSort {
    private int[] inputArray;
    private int[] tempArray;
    int count;

    public MergeSort(int[] input) {
        tempArray = new int[input.length];
        inputArray = input;
    }

    private void mergeSort(int low, int high) {
        if (low >= high) return;

        //Divide the array indices
        int middle = (low + high) / 2;
        mergeSort(low, middle);
        mergeSort(middle + 1, high);
        //Conquer
        merge(low, middle, high);
    }

    private void merge(int low, int middle, int high) {

        for (int index = low; index <= high; index++) {
			count++;
            tempArray[index] = inputArray[index];
        }
        int i = low;
        int j = middle + 1;
        int k = low;

        while (i <= middle && j <= high) {
			count++;
            if (tempArray[i] <= tempArray[j]) {
                inputArray[k] = tempArray[i];
                i++;
            } else {
                inputArray[k] = tempArray[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
			count++;
            inputArray[k] = tempArray[i];
            i++;
            k++;
        }

        while (j <= high) {
			count++;
            inputArray[k] = tempArray[j];
            j++;
            k++;
        }
    }

    private void printArray(int[] nums) {
        LinkedList<String> l=new LinkedList<String>();
        //l.get();

        for (int i = 0; i < nums.length; i++) System.out.print(nums[i] + ",");
    }

    public static void main(String[] args) {



        //int[] nums = {4,5,3,1,2};
		int[] nums = {1,2,3,4,5};
        MergeSort m = new MergeSort(nums);
        System.out.println("To be sorted");
        m.printArray(nums);
        System.out.println();
        m.mergeSort(0, nums.length - 1);
        System.out.println("Sorted");
		m.printArray(nums);
		System.out.println("Count of iteration : "+m.count);
    }

}
