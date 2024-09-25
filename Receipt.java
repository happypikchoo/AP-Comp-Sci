import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("tell me a price($), tax rate(%), and I will calculate the total price:D");
        System.out.println("name your price:");
        double price = input.nextDouble();
        System.out.println("name your amount:");
        int amount = input.nextInt();
        System.out.println("name your tax rate:");
        double tax = input.nextDouble();

        double totalprice = amount*price+price*amount*tax/100;

        System.out.println("the total price will be: " + totalprice);



    }
}
