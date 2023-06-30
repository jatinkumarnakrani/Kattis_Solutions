import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class PeaSoap{
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = sc.nextInt();
		String resto = "";
		for (int i = 0; i < n; i++) {
			int k = sc.nextInt();
			ArrayList<String> menu = new ArrayList<String>();
			for (int j= 0; j <= k; j++) {
				menu.add(br.readLine());
			}
			if (menu.contains("pea soup") && menu.contains("pancakes") && resto.isEmpty()) {
				resto = menu.iterator().next();
	        }
		}
		if (resto.isEmpty()) {
			System.out.println("Anywhere is fine I guess");
		}else{
			System.out.println(resto);
		}
	}
}