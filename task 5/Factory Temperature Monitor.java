import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int safeMin = sc.nextInt();
        int safeMax = sc.nextInt();

        int[] temperature = new int[n];

        for (int i = 0; i < n; i++) {
            temperature[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (temperature[i] < safeMin) {
                System.out.println("Temperature " + temperature[i] + ": LOW");
            } else if (temperature[i] > safeMax) {
                System.out.println("Temperature " + temperature[i] + ": HIGH");
            } else {
                System.out.println("Temperature " + temperature[i] + ": NORMAL");
            }
        }

        sc.close();
    }
}

Input
5
20 30
25 32 18 35 27
  Output
Temperature 25: NORMAL
Temperature 32: HIGH
Temperature 18: LOW
Temperature 35: HIGH
Temperature 27: NORMAL
