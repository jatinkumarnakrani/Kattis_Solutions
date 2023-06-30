import java.util.*;
class Goldbach {
    public static ArrayList<Integer> getPrimeNumbers(int n){
        int x, y, flg;
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        for (x = 2; x <= n; x++) {
            flg = 1;
 
            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }
 
            if (flg == 1){
                primeNumbers.add(x);
            }
        }
        return primeNumbers;
    }
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // HashMap<String, ArrayList<String>> linkedHash = new HashMap<String, ArrayList<String>>();
        ArrayList<ArrayList<String>> linkedHash = new ArrayList<ArrayList<String>>();
        ArrayList<Integer> inputs = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            ArrayList<Integer> primeNumbers = getPrimeNumbers(x);
            ArrayList<String> nodeList = new ArrayList<String>();
            for(int j=0; j<primeNumbers.size(); j++){
                for(int k=j; k<primeNumbers.size(); k++){
                    if ((primeNumbers.get(j) + primeNumbers.get(k)) == x) {
                        nodeList.add(primeNumbers.get(j) + "+" + primeNumbers.get(k));
                    }
                }
            }
            if (nodeList.size() > 0) {
                // linkedHash.put(String.valueOf(x),nodeList);
                linkedHash.add(nodeList);
                inputs.add(x);
            }
        }
        for(int p = 0; p<inputs.size(); p++){
            System.out.println(inputs.get(p) + " has "+ linkedHash.get(p).size() +" representation(s)");
            for(String val : linkedHash.get(p)){
                System.out.println(val);
            }
            System.out.println();
        }
    }
}