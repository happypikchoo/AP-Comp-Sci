public class Circle2 {
    public static void main(String[] arg) {
        StdDraw.setScale(0, 500);
        int i = 500;
        while (i!=0) {
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledCircle(250, 250, i);
            i = i-20;
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledCircle(250, 250, i);
            i = i-20;

        }
    }
}

