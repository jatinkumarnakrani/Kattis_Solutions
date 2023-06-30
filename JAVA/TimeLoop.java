import java.util.Scanner;
class TimeLoop{
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			if (n >= 1 && n <= 100) {
				for (int i =  1; i<=n; i++) {
					System.out.println(i + "Abracadabra");
				}
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}