package ArrayFun;

import java.util.Arrays; // Needed for the method Arrays.toString(), which prints the elements of array on 1 line
import java.util.Scanner;

public class ArrayFunUserArray {

    public static String[] splitString() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 5 integer numbers, separated by commas: ");

        String numbers = scan.nextLine();

        // use String.split() to separate the input of numbers by comma, and make an array of Strings based on that
        String[] numsSplit = numbers.split(",");

        // Keep asking the user for proper input if they don't input 5 numbers separated by commas
        while (numsSplit.length != 5) {
            System.out.println("Error: You must enter 5 integer numbers separated by commas. Please try again. ");

            numbers = scan.nextLine();

            numsSplit = numbers.split(",");
        }

        return numsSplit;
    }

    public static int[] makeArray(String[] numbers) {
        // Integer array of 5 nums
        int[] numsArr = new int[5];

        // Loop through each entry in numsSplit, convert it into an integer, and put inside numsArr
        for (int i = 0; i < numbers.length; i++) {
            numsArr[i] = Integer.parseInt(numbers[i]);
        }

        return numsArr;
    }

    public static void main(String[] args) {
        String[] numbers = splitString();

        // Using Arrays.toString() in order to print the elements to the console on one line
        System.out.println(Arrays.toString(makeArray(numbers)));
    }

}
