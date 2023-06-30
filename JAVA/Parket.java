import java.util.Scanner;
import java.lang.Math;
class Parket{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int b = sc.nextInt();
		double _n1 = ((r/2) + 2 + Math.sqrt(Math.pow((r/2)+2, 2) - 4 * (r+b))) / 2;
		double _n2 = (r+b) / _n1;
		System.out.println((int)_n1 + " " + (int)_n2);
	}
}