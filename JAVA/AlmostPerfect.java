import java.util.Scanner;
class AlmostPerfect{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<500; i++) {
			int n = sc.nextInt();
		    int sum = 0;
    		for (int j=1; j<= n/2; j++) {
    			if (n % j == 0) {
    				sum += j;
    			}
    		}
    		if (n == sum) {
    			System.out.println(n + " perfect");
    		}else if(sum >= n-2 && sum <= n+2){
    			System.out.println(n + " almost perfect");
    		}else{
    			System.out.println(n + " not perfect");
			}
		}
	}
}