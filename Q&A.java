import java.util.Scanner;
//always put this here

public class Problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your favourite course at school? ");
        //string is a variable that stores words, i named the variable "course". the result is read by input.nextLine();
        String course = input.nextLine();

        //string course is printed out
        System.out.println("What is your favourite tv show? ");
        String show = input.nextLine();

        //int stores whole numbers
        System.out.println("How many hours do you spend studying each day?");
        int hours = input.nextInt();

        System.out.println("How many hours do you spend watching shows each day?");
        int hours2 = input.nextInt();

        System.out.println("Your favourite course is " + course);

        System.out.println("Your favourite show is " + show);

        System.out.println("Your favourite course is " + course);

        System.out.println("You spend " + hours + " hours studying every day");

        System.out.println("You spend " + hours2 + " hours watching shows each day");

        input.close();

    }
}