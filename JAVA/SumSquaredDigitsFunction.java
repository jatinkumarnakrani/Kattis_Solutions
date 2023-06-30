import java.util.Scanner;
class SumSquaredDigitsFunction{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  p = sc.nextInt();
		for (int i=0; i<p; i++) {
			int k = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();

			int ssd = 0;
			while(n > 0){
				ssd += (n % b) * (n % b);
				n = n / b;
			}

			System.out.println(k + " " + ssd);
		}
	}
}