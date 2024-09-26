import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3 digit number and I will compute the sum of the digits:)");
        int number = input.nextInt();
        int first = number%10;
        int second = number/10;
        int third = number/100;
        int sum = first + second%10 + third%10;
        System.out.println("The sum of the digits of " + number + " is " + sum);



    }
}
