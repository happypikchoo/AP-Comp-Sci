import java.util.Scanner;

//changing temperatures
public class Math {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("celsius input:");
        double f = input.nextDouble();
        double c;

    c = f*9/5+32;

    System.out.println("Converted to Celsius:" + c);

    }
}
