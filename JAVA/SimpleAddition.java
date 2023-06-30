import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
public class SimpleAddition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        BigInteger result = new BigInteger(a);
        result = result.add(new BigInteger(b));
        System.out.println(result);
    }
}