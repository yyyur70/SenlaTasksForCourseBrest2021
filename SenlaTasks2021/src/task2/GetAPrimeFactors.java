package task2;

public class GetAPrimeFactors {
    public static void getAPrimeFactors(int n, int k) {
        if (k > n) return;
        if (n % k == 0) {
            while (n % k == 0) {
                n = n / k;
                System.out.println(k);
            }
        }
        getAPrimeFactors (n, k + 1);
    }
}
