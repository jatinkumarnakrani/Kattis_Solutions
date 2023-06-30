import java.util.Scanner;
import java.util.ArrayList;
public class DualDivisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        int counter = 0;
        if (a < 1 && b < 1 && a % b == 0) {
            ArrayList<Long> divisiors = new ArrayList<Long>();
            long multiple = b;
            for (int i=0; multiple<=a; i++) {
                divisiors.add(multiple);
                multiple *= 2;
            }
            if (divisiors.contains(b)) {
                counter = divisiors.size();
            }
        }
        System.out.println(counter);
    }
}
