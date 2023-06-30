import java.util.Scanner;
import java.util.ArrayList;
class Prsteni{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i=0; i<n; i++) {
			list.add(sc.nextInt()); 
		}
		for (int j=1; j<list.size(); j++) {
			int temp = getGCD(list.get(0), list.get(j));
			System.out.println(list.get(0) / temp + "/" + list.get(j) / temp);
		}
	}
	static int getGCD(int a, int b){   
		if (b == 0){
			return a;
		}
		return getGCD(b, a % b);
	}
}