import java.util.*;

public class DivisorsWithDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Compute prime factorization of b
        Map<Integer, Integer> factors = new HashMap<>();
        for (int i = 2; i*i <= b; i++) {
            while (b % i == 0) {
                b /= i;
                factors.put(i, factors.getOrDefault(i, 0) + 1);
            }
        }
        if (b > 1) {
            factors.put(b, 1);
        }

        // Count number of divisors of a that have b as a divisor
        int count = 0;
        for (int i = 1; i*i <= a; i++) {
            if (a % i == 0) {
                // Check whether i is a divisor of b
                boolean isDivisor = true;
                for (int factor : factors.keySet()) {
                    if (i % factor != 0) {
                        isDivisor = false;
                        break;
                    }
                }
                if (isDivisor) {
                    count++;
                }

                // Check whether a/i is a divisor of b
                if (i != a/i) {
                    isDivisor = true;
                    for (int factor : factors.keySet()) {
                        if ((a/i) % factor != 0) {
                            isDivisor = false;
                            break;
                        }
                    }
                    if (isDivisor) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
