import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
class MagicTrick{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Set<Character> set = new HashSet<Character>();
		for(int i=0;i<s.length();i++){
			set.add(s.charAt(i));
		}
		if (s.length() == set.size()) {
			System.out.println(1);
		}else{
			System.out.println(0);
		}
	}
}