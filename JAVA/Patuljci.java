import java.util.*;
class Patuljci{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hats[] = new int[9];
		int sum = 0;

		for (int i=0; i<9; i++) {
			hats[i] = sc.nextInt();
			sum += hats[i];
		}

        int targetSum = sum - 100; 
		for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (hats[i] + hats[j] == targetSum) {
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) {
                            System.out.println(hats[k]);
                        }
                    }
                    return;
                }
            }
        }
	}
}