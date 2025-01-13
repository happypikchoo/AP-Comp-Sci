public class Pi {
    public static void main(String[] args) {
        fraction MILU = new fraction(355, 113);
        fraction est = new fraction();
        final double epsilon = Math.abs(Math.PI-MILU.toDouble());

        //repeat process until our answer is closer than MILU
        while (!(Math.abs(Math.PI-est.toDouble())<epsilon)) {
            if (Math.PI-est.toDouble()>epsilon) {
                est.setNum(est.getNum()+1);
            } else {
                est.setDenom(est.getDenom()+1);
            }

        }
        System.out.println(est);
    }
}
