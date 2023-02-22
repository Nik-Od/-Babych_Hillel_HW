package HW4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // convert arg string array to integer array

        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }


        // print original array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // sort the array in ascending order
        Arrays.sort(arr);
        System.out.println("Ascending order: " + Arrays.toString(arr));

        // sort the array in descending order
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println("Descending order: " + Arrays.toString(arr));



       // sort the array in the inner pattern

        int[] sortedArray = new int[arr.length];

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;
        boolean isLeft = true;

        for (int i = 0; i < arr.length; i++) {
            if (isLeft) {
                sortedArray[left++] = arr[arr.length - i - 1];
            } else {
                sortedArray[right--] = arr[arr.length - i - 1];
            }
            isLeft = !isLeft;
        }
        System.out.println("Inner pattern: " + Arrays.toString(sortedArray));
    }
}




