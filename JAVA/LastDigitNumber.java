import java.util.Scanner;

public class LastDigitNumber {
 
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in) ;
        
        int a=scan.nextInt();
        for (int i=1;i<=a;i++){
            int faktor = 1;
            int b=scan.nextInt();
            for (int j=1;j<=b;j++){
                faktor = j * faktor;
            }
            int c=faktor %10;
            System.out.println(c);
        }    
    }
}