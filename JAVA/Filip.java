import java.util.Scanner;
class Filip{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a != b && !String.valueOf(a).contains("0") && !String.valueOf(a).contains("0")) {
			String strA = "";
			String strB = "";
			while (a > 0) {
			    strA += a % 10;
			    a = a / 10;
			}
			while (b > 0) {
			    strB += b % 10;
			    b = b / 10;
			}
			if (Integer.parseInt(strA) > Integer.parseInt(strB)) {
				System.out.println(strA);
			}else{
				System.out.println(strB);
			}
		}
	}
}