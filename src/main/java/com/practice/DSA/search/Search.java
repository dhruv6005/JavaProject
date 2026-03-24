package com.practice.DSA.search;

public class Search {

    public static void main(String[] args) {

        int[] arr = {5, 6, 9, 11, 15, 31};
        int target = 31;

        int indexLS = linearSearch(arr, target);

        if (indexLS == -1)
            System.out.println("Target value does not exist in LS");
        else
            System.out.println("Target found at indexLS: " + indexLS);

        int indexBS = binarySearch(arr, target);

        if (indexBS == -1)
            System.out.println("Target value does not exist in BS");
        else
            System.out.println("Target found at indexBS: " + indexBS);


        int indexBSR = binarySearchRecursive(0, arr.length - 1, arr, target);

        if (indexBSR == -1)
            System.out.println("Target value does not exist in BSR");
        else
            System.out.println("Target found at indexBSR: " + indexBSR);
    }

    public static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target)
                return mid;
            else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static int binarySearchRecursive(int start, int end, int[] arr, int target) {

        if (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target)
                return mid;
            else if (target < arr[mid]) {
                return binarySearchRecursive(start, mid - 1, arr, target);
            } else if (target > arr[mid]) {
                return binarySearchRecursive(mid + 1, end, arr, target);
            }
        }

        return -1;
    }
}
