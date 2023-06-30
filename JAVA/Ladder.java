import java.util.*;
class Ladder{
	public static void main(String[] args) {
		double h;
		double v;

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Scanner sc1 = new Scanner(input);
		h = sc1.nextDouble();
		v = sc1.nextDouble();
		System.out.println((int)(Math.ceil(h/(Math.sin(v*Math.PI/180)))));
	}
}