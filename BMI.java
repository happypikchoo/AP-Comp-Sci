import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your mass in kilograms:");
        double mass = input.nextDouble();

        System.out.println("Enter your height in meters");
        double height = input.nextDouble();

        double BMI = mass/(height*height);

        System.out.println("Your BMI is: " + BMI);



    }
}
