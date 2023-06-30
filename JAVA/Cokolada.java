import java.util.Scanner;
class Cokolada{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		nextPowerOfTwo(sc.nextInt());
	}

	public static void nextPowerOfTwo(int n){
		int highestOneBit = Integer.highestOneBit(n);
		if (n == highestOneBit) {
		    breakes(n,n);
		}else{
			breakes(highestOneBit << 1,n);
		}
	}

	public static void breakes(int nextPowerOfTwo, int n){
		System.out.print(nextPowerOfTwo + " ");
		int count = 0;
		while(n != nextPowerOfTwo && n > 0){
			nextPowerOfTwo >>= 1;
			if (n > nextPowerOfTwo) {
				n -= nextPowerOfTwo;
			}
			count++;
		}
		System.out.println(count);
	}
}