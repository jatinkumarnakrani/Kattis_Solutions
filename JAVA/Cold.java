import java.util.Scanner;
class Cold{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int belowZero = 0;
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (sc.nextInt() < 0) {
				belowZero++;
			}
		}
		System.out.println(belowZero);
	}
}