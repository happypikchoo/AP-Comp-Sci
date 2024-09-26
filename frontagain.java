public class frontagain {

    public boolean frontAgain (String str, int n) {
    String front = str.substring(0,n);
            String back = str.substring(str.length()-n);
            return front.equals(back);

    }
}
