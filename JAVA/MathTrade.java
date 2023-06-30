import java.util.*;

public class MathTrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine(); // consume the rest of the line

        Map<String, String> has = new HashMap<>();
        Map<String, String> wants = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] line = input.nextLine().split(" ");
            String name = line[0];
            String itemHas = line[1];
            String itemWants = line[2];
            has.put(name, itemHas);
            wants.put(name, itemWants);
        }

        System.out.println(has);
        System.out.println(wants);
        // Find the start of the chain
        String start = null;
        for (String name : has.keySet()) {
            if (!wants.containsValue(has.get(name))) {
                start = name;
                break;
            }
        }

        // Traverse the chain and count its length
        int length = 0;
        while (start != null) {
            length++;
            start = has.get(wants.get(start));
        }

        if (length > 0) {
            System.out.println(length);
        } else {
            System.out.println("No trades possible");
        }
    }
}
