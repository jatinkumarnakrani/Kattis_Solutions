import java.util.Scanner;
class HeartRate{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int  b = sc.nextInt();
			double  p = sc.nextDouble();

			double bpm = (60 * b) / p;
			double varience = 60 / p;

			System.out.printf("%.4f", bpm - varience);
			System.out.printf(" %.4f", bpm);
			System.out.printf(" %.4f%n", bpm + varience);
		}
	}
}