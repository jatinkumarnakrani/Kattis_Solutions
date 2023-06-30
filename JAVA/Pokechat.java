import java.util.Scanner;
class Pokechat{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String l = sc.nextLine();
		for (String i : l.split("(?<=\\G...)")) {
			System.out.print(s.substring(Integer.parseInt(i)-1,Integer.parseInt(i)));
		}
	}
}