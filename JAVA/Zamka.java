import java.util.Arrays;
import java.util.Scanner;

public class Zamka {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int match = sc.nextInt();
        for(;sumOfDigits(min) != match;min++);
        for(;sumOfDigits(max) != match;max--);
        System.out.println(min +"\n" + max);
    }
    public static int sumOfDigits(int num){
        return  Arrays.stream(Integer.toString(num).split("")).mapToInt(Integer::parseInt).sum();
    }
}