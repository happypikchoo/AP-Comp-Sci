import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number of days:");
        int days = input.nextInt();

        int weeks = days/7;

        int day = days%7;

        System.out.println("there are " + weeks + " weeks " + "and there are " + day + " days in " + days + " days");
    }
}
