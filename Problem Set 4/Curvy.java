public class Curvy {
    public static void main(String[] arg) {
        StdDraw.setScale(0, 500);
        int i = 0;
        while (i<500) {
            StdDraw.line(0,i, i , 500);
            StdDraw.line(i,0, 500 , i);

            i = i+10;
        }
    }
}
