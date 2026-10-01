import java.util.*;

public class TrafficSignalCongestionAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int low = 0, medium = 0, high = 0;

        for (int i = 0; i < n; i++) {
            int vehicles = sc.nextInt();

            if (vehicles <= 20) {
                low++;
            } else if (vehicles <= 50) {
                medium++;
            } else {
                high++;
            }
        }

        System.out.println("Low: " + low);
        System.out.println("Medium: " + medium);
        System.out.println("High: " + high);

        sc.close();
    }
}

Input
5
15 35 65 20 48
Output
Low: 2
Medium: 2
High: 1
