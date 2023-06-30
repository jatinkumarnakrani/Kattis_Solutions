import java.util.Scanner;
class HarshadNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = n; i>= n; i++) {
			int sumOfDigit = sumOfDigit(i);
			if (i%sumOfDigit ==0) {
				System.out.println(i);
				break;
			}
		}
	}
	private static int sumOfDigit(int number){
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
            number = number / 10;
        }
        return sum;
	}
}