import java.util.ArrayList;

public class methods {
    public static ArrayList <Integer> erastosthenes (int n) {
        ArrayList<Integer> prime = new ArrayList();
        int p = 2;

        for (int i = 2; i <= n; i++) {
            prime.add(i);
        }

        while (p<prime.get(prime.size()-1)) {
            for (int i = prime.indexOf(p) + 1; i < prime.size(); i++) {
                if (prime.get(i) % p == 0) {
                    prime.remove(i);
                }
            }
            p = prime.get(prime.indexOf(p)+1);
        }
        return prime;
    }

    public static OrderedPair goldbach (int n) {
       ArrayList<Integer> prime = erastosthenes(n);
       int pair1 = 0;
       int pair2 = 0;

       for (int i = 0; i<prime.size(); i++) {
           int curr = prime.get(i);
           for (int z = i; z<prime.size(); z++) {
               int curr2 = prime.get(z);
               if (curr+curr2 == n) {
                   pair1 = curr;
                   pair2 = curr2;
                   return new OrderedPair(pair1, pair2);
               }
           }
       }
      return new OrderedPair(0, 0);
    }
    public static ArrayList<Integer> bigints() {
        return new ArrayList<>();
    }
}
