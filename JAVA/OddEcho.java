import java.util.Scanner;
class OddEcho{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			String  str = sc.next();
			if (i % 2 != 0) {
				System.out.println(str);
			}
		}
	}
}