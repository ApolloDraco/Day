/* 
 *  Description: A program that prompts the user to enter an integer for today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6)
 *  Also prompts the user to enter the number of days after today for a future day and displays the future day of the week
*/

import java.util.Scanner;

public class Day {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.print("Enter an integer for today's day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6): ");
        int today = in.nextInt();

        System.out.print("Enter the number of days after today for a future day: ");
        int future = in.nextInt();

        int futureDay = (today + future) % 7;
        String futureDayName = daysOfWeek[futureDay];

        System.out.printf("Today is %s and the future day is %s.\n", daysOfWeek[today], futureDayName);
    }
}
