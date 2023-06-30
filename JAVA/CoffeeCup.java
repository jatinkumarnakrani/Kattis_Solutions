import java.util.*;

class CoffeeCup{
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);			
			int totlec = sc.nextInt();
			if (totlec < 1 || totlec > 100000) {
				throw new InputMismatchException();
			}
			String machineAvl = sc.next("[0-9]*");

			if (String.valueOf(machineAvl).length() != totlec) {
				throw new InputMismatchException();
			}

			int maxCoffeeCup = 0;
			int maxLec = 0;

			for (int i=0; i < machineAvl.length(); i++) {
				if (machineAvl.charAt(i) == '0' && maxCoffeeCup > 0) {
					maxCoffeeCup--;
					maxLec++;
				}else if(machineAvl.charAt(i) == '1'){
					maxCoffeeCup = 2;
					maxLec++;
				}
			}
			System.out.print(maxLec);

		}catch(InputMismatchException ex){
			System.out.println("Invalid Input.");
		}catch(Exception e){
			System.out.println(e);
		}

	}
}