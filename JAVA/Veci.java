import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Veci {
    static ArrayList<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        permutation(input);
        Collections.sort(list);
        System.out.println(list);
        boolean idk = false;
        for(int i: list){
            if (i > Integer.parseInt(input)){
                System.out.println(i);
                idk = true;
                break;
            }
        }
        if (!idk)
            System.out.println("0");
    }

    public static void permutation(String input){
        permutation("", input);
    }
    private static void permutation(String perm, String s) {
        if (s.isEmpty())
            list.add(Integer.parseInt(perm + s));
        else {
            for (int i = 0; i < s.length(); i++) {
                permutation(perm + s.charAt(i),                              //add i letter to the perm
                        s.substring(0, i) + s.substring(i + 1, s.length()));    //without the numbers used prior
            }
        }

    }
}