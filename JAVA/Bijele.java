import java.util.Scanner;
class Bijele{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();
		int b = sc.nextInt();
		int kn = sc.nextInt();
		int p = sc.nextInt();

		System.out.print(1-k + " ");
		System.out.print(1-q + " ");
		System.out.print(2-r + " ");
		System.out.print(2-b + " ");
		System.out.print(2-kn + " ");
		System.out.println(8-p);
	}
}