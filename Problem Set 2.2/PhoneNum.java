public class PhoneNum {

    public String formatPhoneNumber(String str1) {
       String formatnum = "(" + str1.substring(0,3) + ")" + " " + str1.substring(3,6) + "-" + str1.substring(7); //important!! end is exclusive so it doesnt go 0, 1, 2, 3 it excludes 3
       return formatnum;

    }
}
