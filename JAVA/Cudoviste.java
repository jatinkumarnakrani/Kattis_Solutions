import java.util.Scanner;
import java.util.ArrayList;
class Cudoviste{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		ArrayList<String> rows = new ArrayList<String>();
		for (int i=0; i<r; i++) {
			rows.add(sc.next());
		}
		int c0 = 0;
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;
		for (int j=0; j<c-1; j++) {
			for (int k=0; k<r-1; k++) {
				String newStr = rows.get(k).substring(j,j+2) + rows.get(k+1).substring(j,j+2);
				if (newStr.contains("#")) {
					continue;
				}
				int xCount = 0;
				for (int p=0; p<newStr.length(); p++) {
					if (newStr.charAt(p) == 'X') {
						xCount++;
					}
				}
				if (xCount == 0) {
					c0++;
				}else if (xCount == 1) {
					c1++;
				}else if (xCount == 2) {
					c2++;
				}else if (xCount == 3) {
					c3++;
				}else {
					c4++;
				}
			}
		}
		System.out.println(c0);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}