import java.util.Scanner;

public class EspressoMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int waterLevel = s;

        int refillCounter = 0;

        for (int i = 0; i < n; i++) {
            String orders = scanner.next();
            if (orders.contains("L")) {
                int orderCount = Integer.parseInt(orders.replace("L","")) + 1;
                if (waterLevel >= orderCount) {
                    waterLevel -= orderCount;
                }else{
                    refillCounter++;
                    waterLevel = s - (orderCount);
                }
            }else{
                int orderCount = Integer.parseInt(orders.replace("L",""));
                if (waterLevel >= orderCount) {
                    waterLevel -= orderCount;
                }else{
                    refillCounter++;
                    waterLevel = s - orderCount;
                }
            }
        }

        System.out.println(refillCounter);

        scanner.close();
    }
}
