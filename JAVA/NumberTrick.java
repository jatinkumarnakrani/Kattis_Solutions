import java.util.Scanner;
class NumberTrick{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double x = sc.nextDouble();
		String str = String.valueOf(x);
		int gcd = getGCD(Integer.parseInt(str.replace(".", "")), (int)Math.pow(10, str.substring(str.indexOf(".")).length() - 1));
		int a = Integer.parseInt(str.replace(".", "")) / gcd;
		int b = (int)Math.pow(10, str.substring(str.indexOf(".")).length() - 1) / gcd;
		System.out.println("GCD: "+gcd);
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		for (int i=0; i<8; i++) {
			for (int j=1; j<10; j++) {
				int _n = b * j * (int)(Math.pow(10, (i+1)) - 1);
				int _b = (10 * b - a);
				System.out.println(_n);
				System.out.println(_b);
				break;
			}
		};
		
		// for (int i = 10; i<=100000000; i++) {
			// if ((i * x) % 1 == 0) {
			// 	int ans = (int)(i * x);
			// 	String str = String.valueOf(i);
			// 	if (ans == Integer.parseInt(str.substring(1) + str.charAt(0))) {
			// 		System.out.println(i);
			// 	}
			// System.out.println(Math.pow(10, 9));
			// }
		// }
	}
	static int getGCD(int a, int b){   
		if (b == 0){
			return a;
		}
		return getGCD(b, a % b);
	}
}