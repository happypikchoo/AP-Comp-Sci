import java.util.Scanner;

public class Guess {
    public static void main(String[] arg) {
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
        Scanner input = new Scanner(System.in);
        int x = 1;
        int number = (int)(Math.random()*100+1);
        int guess = input.nextInt();

        while (!(guess == number)) {
            if (guess<number) {
                System.out.println("Your guess: " + guess);
                System.out.println("Nope, that guess is too low.");
            } else if (guess>number) {
                System.out.println("Your guess: " + guess);
                System.out.println("That guess is too high.");
            }
            x++;
            guess = input.nextInt();
        } System.out.println("You guessed it! It took you " + x +" tries.");

    }
}
