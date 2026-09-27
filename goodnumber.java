import java.util.Scanner;
class goodnumber {
    private static final long MOD = 1_000_000_007L;

    public int countGoodNumbers(long n) {
        long evenIndexes = (n + 1) / 2;
        long oddIndexes = n / 2;

        long evenWays = power(5, evenIndexes);
        long oddWays = power(4, oddIndexes);

        return (int) ((evenWays * oddWays) % MOD);
    }

    private long power(long base, long exponent) {
        if (exponent == 0) {
            return 1;
        }

        long half = power(base, exponent / 2);
        long result = (half * half) % MOD;

        if (exponent % 2 == 1) {
            result = (result * base) % MOD;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        goodnumber sol = new goodnumber();
        System.out.print("Enter the length of the number: ");
        long n = sc.nextLong();
        int result = sol.countGoodNumbers(n);
        System.out.println("Count of good numbers of length " + n + ": " + result);
    }
}