import java.util.*;

public class Check {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        System.out.println("Do you want a more positive or negative review? Type True for a positive review and False for a negative review");

        boolean ans = input.nextBoolean();

        System.out.println(Review.fakeReview("/Users/jonathanleung/Downloads/PS4C/review.txt", ans));

        }

}
