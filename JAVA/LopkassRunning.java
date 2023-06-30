import java.util.Scanner;
public class LopkassRunning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        if (k == 1) {
            System.out.println(n-1);
        } else {
            long numComponents = (n-1) / k + ((n-1) % k != 0 ? 1 : 0);
            long shortestPath = (numComponents-1) * (k+1) + (n-1) % k;
            System.out.println(shortestPath);
        }
    }
}
