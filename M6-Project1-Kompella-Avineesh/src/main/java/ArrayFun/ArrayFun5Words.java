package ArrayFun;

import java.util.Scanner;
import java.util.Arrays; // Needed for the method Arrays.toString(), which prints the elements of array on 1 line

public class ArrayFun5Words {

    public static String[] getWords() {

        Scanner scan = new Scanner(System.in);

        String[] words = new String[5]; // New empty String array of size 5

        int wordNum = 1; // Word 1, word 2, ...

        for (int i = 1; i <= 5; i++) {
            System.out.println("Please enter word number " + wordNum + ": ");

            words[i - 1] = scan.nextLine(); // Using i - 1 because of zero-based indexing

            wordNum += 1;
        }

        return words;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getWords()));
    }

}
