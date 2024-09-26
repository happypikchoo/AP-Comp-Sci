import java.util.Scanner;

public class Driver2 {
  public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        //instantiation
        StringTools sTools = new StringTools();

        PhoneNum number = new PhoneNum();

        middlethree middle = new middlethree();

        swap swaplast2letters = new swap();

        frontagain frontbackcheck = new frontagain();

        System.out.println("I will check if the first n characters are the same as its last n characters");
        System.out.println("Enter a word:");
        String answer5 = input.nextLine();
        System.out.println("Enter an integer to determine how many characters you want to check:");
        int answer6 = input.nextInt();
        System.out.println(frontbackcheck.frontAgain(answer5, answer6));

input.nextLine();
        System.out.println("lastLetter test cases:");
        System.out.println("Enter a word with at least one character: ");
        String answer1 = input.nextLine();
        System.out.println("The last letter is " + sTools.lastletter(answer1));
        System.out.println("---------------------");

        System.out.println("Enter your phone number");
        String answer2 = input.nextLine();
        System.out.println(number.formatPhoneNumber(answer2));

        System.out.println("Enter a word that has an odd number of letters and I will return the middle three");
        String answer3 = input.nextLine();
        System.out.println(middle.middleThree(answer3));

        System.out.println("Enter a word that has at least 2 letters and I will return the last two letters but switched around");
        String answer4 = input.nextLine();
        System.out.println(swaplast2letters.swaplasttwo(answer4));


    }
}
