
public class Formula {

//need it to be public OrderedPair bc new OrderedPair would not work
    public OrderedPair findQuadraticRoots (double a, double b, double c) {
        double ans1 = (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        double ans2 = (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        //no need for variable
        return new OrderedPair(ans1,ans2);

    }


    public double findSlope (OrderedPair A, OrderedPair B) {
        return (B.getY()-A.getY())/(B.getX()-A.getX());
    }


    public OrderedPair findmidpoint(OrderedPair A, OrderedPair B) {
        double ansX = (A.getX()+B.getX())/2;
        double ansY = (A.getY()+B.getY())/2;

        return new OrderedPair(ansX,ansY);
    }

    public double findArithmeticSeriesSum (double a, double d, int k) {
        return (k/2.0)*(2*a+d*(k-1));

    }

    public double findGeometricSeriesSum (double a, double r, int k) {
        return a*((1-Math.pow(r,k))/(1-r));

    }

    public int rollDie (int sides) {
        return (int)(Math.random()*sides)+1;
    }


}
