
    public class StdDrawExample {
        public static void main (String[] args) {
            StdDraw.setScale(0, 500);

            StdDraw.line(0, 500, 500, 0);
            StdDraw.line(0, 0, 500, 500);
            StdDraw.square(250, 250, 100);
            StdDraw.circle(250, 250, 100);

            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.filledCircle(100, 100, 50);
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.filledCircle(100, 400, 50);
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledCircle(400, 400, 50);

            StdDraw.setPenColor(StdDraw.YELLOW);
            StdDraw.filledCircle(400, 100, 50);
        }
    }

