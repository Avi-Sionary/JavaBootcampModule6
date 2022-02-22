package MonthConverter;

import java.util.Scanner;

public class MonthConverterSwitch {

    public static String monthConverter(int month) {
        // String array of months by name. Index 0 is "MONTHS:" in order to correctly match the rest of the months'
        // indices by number that user inputs. Could have just returned months[month + 1] or months[month - 1], but
        // this makes more sense for me.
        String[] months = {"MONTHS:", "January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};

        // Welcome to the long list of switch cases. Check if user has inputted a valid number (between 1 and 12)
        switch (month) {
            case 1:
                return months[1];
            case 2:
                return months[2];
            case 3:
                return months[3];
            case 4:
                return months[4];
            case 5:
                return months[5];
            case 6:
                return months[6];
            case 7:
                return months[7];
            case 8:
                return months[8];
            case 9:
                return months[9];
            case 10:
                return months[10];
            case 11:
                return months[11];
            case 12:
                return months[12];
            default:
                return "You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number, representing a month, between 1 and 12: ");

        int month;

        // Using a try-catch in case user input cannot be parsed into an integer; if it can't, then we just make
        // the int month equal to 0 and pass it into the function.
        try {
            month = Integer.parseInt(scan.nextLine());
        }
        catch (NumberFormatException e) {
            month = 0;
        }

        System.out.println(monthConverter(month));
    }
}
