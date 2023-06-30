import java.util.Scanner;
class BuildingPyramids{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0, i = 1, j = 0;
        while(temp < n){
            temp += i * i;
            i += 2;
            j++;
        }
        if (temp > n) {
            j--;
        }
        System.out.println(j);
    }
}