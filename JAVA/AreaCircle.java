import java.util.Scanner;
class AreaCircle{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        for (int i=0; i<=1000; i++) {
            double r = Double.parseDouble(input.next());
            int m = Integer.parseInt(input.next());
            int c = Integer.parseInt(input.next());

            if (r == 0 && m == 0 && c == 0) {
                break;
            }

            double coa = Math.PI * (r * r);
            double est = (double) c / m * 4 * r * r;

            printAreaOfCircle(coa);
            printEstimation(est);
        }
	}

    public static void printAreaOfCircle(double coa){
        String coastr = Double.toString(Math.abs(coa));
        if (coastr.length() <= 11) {
            System.out.printf("%s ", coa);
        }else{
            int floatCount = 10 - coastr.indexOf('.');
            System.out.printf("%."+floatCount+"f ", coa);
        }
    }
    public static void printEstimation(double est){
        String eststr = Double.toString(Math.abs(est));
        if (eststr.length() <= 11) {
            if((est-(int)est)!=0)
                System.out.printf("%s%n", est);
            else
                System.out.printf("%d%n", (int)est);
        }else{
            int floatCount = 10 - eststr.indexOf('.');
            System.out.printf("%."+floatCount+"f%n", est);
        }
    }
}