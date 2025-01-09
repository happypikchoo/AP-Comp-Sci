public class fraction {
    private int numerator;
    private int denominator;

    public fraction () {
        numerator = 1;
        denominator = 1;
     }

     public fraction (int a, int b) {
         setNum(a);
         setDenom(b);
     }

     public fraction (String a) {
         setNum(Integer.parseInt(a.substring(0,a.indexOf("/"))));
         setDenom(Integer.parseInt(a.substring(a.indexOf("/")+1)));
     }

     public fraction (fraction a) {
        numerator = a.numerator;
        denominator = a.denominator;
     }

     public int getNum() {
        return numerator;
     }

     public int getDenom() {
         return denominator;
     }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public double toDouble() {
         return (double)numerator/denominator;
    }

    public void reduce() {
        //the 2 numbers that will be used for the Euclidean GCF method
        int num1 = Math.abs(numerator);
        int num2 = Math.abs(denominator);

        int GCF = GCF(num1, num2);

        //set the fraction object's numerator and denominator to the reduced terms.
        numerator/=GCF;
        denominator/=GCF;

    }

     private int GCF(int in1, int in2) {
        //GCF while loop
        while (in1 != 0 && in2 != 0) {
            int large = Math.max(in1, in2);
            int small = Math.min(in1, in2);
            in1 = large-small;
            in2 = small;
        }

        //GCF is the non zero value either num1 or num2
        int GCF = Math.max(in1,in2);

        return GCF;
    }

    public void setNum(int a){
            numerator = a;
    }

    public void setDenom(int a){
        if (a == 0) {
            System.out.println("Error. Denominator can not be 0");
        } else {
             denominator = a;
        }
    }

    public static fraction multiply(fraction a, fraction b) {
        fraction multiply = new fraction();
        multiply.setNum(a.getNum()*b.getNum());
        multiply.setDenom(a.getDenom()*b.getDenom());
        multiply.reduce();
        return multiply;
    }

    public static fraction divide(fraction a, fraction b) {
        fraction divide = new fraction();
        divide.setNum(a.getNum()*b.getDenom());
        divide.setDenom(a.getDenom()*b.getNum());
        divide.reduce();
        return divide;
    }

    public static fraction add(fraction a, fraction b) {
        fraction add = new fraction();
        add.setNum(a.getNum()*b.getDenom()+b.getNum()*a.getDenom());
        add.setDenom(a.getDenom()*b.getDenom());
        add.reduce();
        return add;
    }

    public static fraction subtract(fraction a, fraction b) {
        fraction subtract = new fraction();
        subtract.setNum(a.getNum()*b.getDenom()-b.getNum()*a.getDenom());
        subtract.setDenom(a.getDenom()*b.getDenom());
        subtract.reduce();
        return subtract;
    }


}
