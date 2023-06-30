import java.util.Scanner;
class Javelin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of steel rods
        int sum = 0; // Total length of the steel rods

        // Loop through each steel rod and add its length to the sum
        for (int i = 0; i < n; i++) {
            int length = sc.nextInt();
            sum += length;
        }

        // Calculate the length of the jumbo javelin after all the rods are fused
        int jumboJavelin = sum - (n-1);

        System.out.println(jumboJavelin); // Output the length of the jumbo javelin
    }
}
