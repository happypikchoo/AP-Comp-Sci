import java.util.Scanner;

public class Driver2 {
  public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        //instantiation
        StringTools sTools = new StringTools();

        PhoneNum number = new PhoneNum();

        middlethree middle = new middlethree();

        swap swaplast2letters = new swap();

        System.out.println("lastLetter test cases:");
        System.out.println("Enter a word with at least one character: ");
        String answer1 = input.nextLine();
        System.out.println("The last letter is " + sTools.lastletter(answer1));
        System.out.println("---------------------");

        System.out.println("Enter your phone number");
        String answer2 = input.nextLine();
        System.out.println(number.formatPhoneNumber(answer2));

        System.out.println("Enter a word that has an odd number of letters and I will return the middle three");
        String middlethree = input.nextLine();
        System.out.println(middle.middleThree(middlethree));

        System.out.println("Enter a word that has at least 2 letters and I will return the last two letters but switched around");
        String swap = input.nextLine();
        System.out.println(swaplast2letters.swaplasttwo(swap));

    }
}
