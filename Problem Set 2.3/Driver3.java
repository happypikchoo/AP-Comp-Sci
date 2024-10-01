import java.util.Scanner;

public class Driver3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Formula f = new Formula();

        System.out.println("I can roll a n sided dice, and you get to pick the number of sides:");
        int n = input.nextInt();
        System.out.println("Rolling a"+n+"-sided die... you got a "+f.rollDie(n));

        System.out.println("I can find the sum of a finite geometric sequence, enter the first term a, the common ratio r, and the number of terms k in that order");
        double a1 = input.nextDouble();
        double r = input.nextDouble();
        int k1 = input.nextInt();
        System.out.println("The sum of the first "+ k1 +" terms of a finite series that starts with " +a1+" and has a common ratio by "+r+" is " + f.findGeometricSeriesSum(a1,r,k1));

        System.out.println("I can find the sum of an arithmetic sequence, enter the first term (a), the difference between each term (d), and the number of terms (k) in that order");
        double a2 = input.nextDouble();
        double d2 = input.nextDouble();
        int k2 = input.nextInt();
        System.out.println("The sum of the first "+ k2 +" terms of an arithmetic series that starts with " +a2+" and increases by "+d2+" is " + f.findArithmeticSeriesSum(a2,d2,k2));

        System.out.println("Enter 2 coordinates and I will find the midpoint");
        System.out.println("Enter your first pair of coordinates y1, and x1:");
        double y3 = input.nextDouble();
        double x3 = input.nextDouble();
        OrderedPair OP3 = new OrderedPair(y3, x3);
        System.out.println("Enter your second pair coordinates y2, and x2:");
        double y4 = input.nextDouble();
        double x4 = input.nextDouble();
        OrderedPair OP4 = new OrderedPair(y4, x4);
        System.out.println("The midpoint between the points "+OP3+" "+OP4+" is "+f.findmidpoint(OP3, OP4));

        System.out.println("Enter 2 coordinates and I will find the slope between the two points");
        System.out.println("Enter your first pair of coordinates y1, and x1:");
        double y1 = input.nextDouble();
        double x1 = input.nextDouble();
        OrderedPair OP1 = new OrderedPair(y1, x1);
        System.out.println("Enter your second pair coordinates y2, and x2:");
        double y2 = input.nextDouble();
        double x2 = input.nextDouble();
        OrderedPair OP2 = new OrderedPair(y2, x2);
        System.out.println("The slope between the points "+OP1+" "+OP2+" is "+f.findSlope(OP1, OP2));


        System.out.println("Enter the coefficients of a quadratic equation in the order a, b, c for the form ax^2+bx+c and I will compute zeros");
        double coef1 = input.nextDouble();
        double coef2 = input.nextDouble();
        double coef3 = input.nextDouble();
        System.out.print("The zeros of your quadratic equation "+ coef1+"x^+"+ coef2+"x+"+coef3+" are" + f.findQuadraticRoots(coef1, coef2, coef3));



    }
}
