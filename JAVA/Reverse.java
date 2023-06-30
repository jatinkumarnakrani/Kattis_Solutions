import java.util.Scanner;
import java.util.ArrayList;
class Reverse{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> values = new ArrayList<Integer>();
		for (int i=0; i<n; i++) {
			values.add(sc.nextInt());
		}
		for (int j=values.size()-1; j>=0; j--) {
			// System.out.println(j);
			System.out.println(values.get(j));
		}
		// System.out.println(values);
	}
}