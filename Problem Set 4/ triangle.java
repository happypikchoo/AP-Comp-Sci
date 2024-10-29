
public class triangle {

    public static void main(String[] arg) {
        StdDraw.setScale(0, 1);

        Formula formula = new Formula();

        StdDraw.setPenRadius(0.005);

        //inital triangle
        OrderedPair point0 = new OrderedPair(0.5,0);
        OrderedPair point1 = new OrderedPair(0,1);
        OrderedPair point2 = new OrderedPair(1,1);

        OrderedPair randompoint = new OrderedPair( Math.random(),  Math.random());

        StdDraw.point(point0.getX(), point0.getY());
        StdDraw.point(point1.getX(), point1.getY());
        StdDraw.point(point2.getX(), point2.getY());

        double midx = 0;
        double midy = 0;

        //choose between the 3 vertices
        int randomvert = (int) Math.random()*3;

       for(int i=0;i<100000;i++){

            randomvert = (int) (Math.random()*3);

            if (randomvert ==0 ) {
                midx = formula.findmidpoint(point0, randompoint).getX();
                midy = formula.findmidpoint(point0, randompoint).getY();
                StdDraw.point(midx, midy);
            } else if (randomvert == 1 ) {
                midx = formula.findmidpoint(point1, randompoint).getX();
                midy = formula.findmidpoint(point1, randompoint).getY();
                StdDraw.point(midx, midy);
            } else if (randomvert ==2 ) {
                midx = formula.findmidpoint(point2, randompoint).getX();
                midy = formula.findmidpoint(point2, randompoint).getY();
                StdDraw.point(midx, midy);
            }

            randompoint.x = midx;
            randompoint.y = midy;


        }





    }


    }




