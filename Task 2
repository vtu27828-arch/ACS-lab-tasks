import java.util.*;

public class WarehouseProductFrequencyManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedHashMap<Integer, Integer> frequency = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            int product = sc.nextInt();

            frequency.put(product, frequency.getOrDefault(product, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        sc.close();
    }
}

Input
8
101 102 101 103 102 101 104 103
Output
101 3
102 2
103 2
104 1
