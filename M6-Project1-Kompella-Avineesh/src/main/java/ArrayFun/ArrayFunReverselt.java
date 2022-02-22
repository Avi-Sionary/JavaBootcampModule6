package ArrayFun;

import java.util.Arrays; // Needed for the method Arrays.toString(), which prints the elements of array on 1 line

public class ArrayFunReverselt {

    public static int[] reverseArr(int[] arr) {
        int[] rev = new int[arr.length]; // Make new array of equal length

        int index = 0; // Starting index for the array rev

        for (int i = arr.length - 1; i >= 0; i--) { // Start from the end of the original array, increment down
            rev[index] = arr[i];

            index += 1; // Go up 1 index in reversed array
        }

        return rev;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original array: " + Arrays.toString(arr));

        System.out.println("Reverse array: " + Arrays.toString(reverseArr(arr)));
    }

}
