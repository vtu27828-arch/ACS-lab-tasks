import java.util.*;

public class Main {

    static Map<Integer, List<Integer>> hierarchy = new HashMap<>();

    static int countEmployees(int manager) {
        int count = 0;

        if (hierarchy.containsKey(manager)) {
            for (int employee : hierarchy.get(manager)) {
                count += 1 + countEmployees(employee);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Input: employee manager
        for (int i = 0; i < n; i++) {
            int employee = sc.nextInt();
            int manager = sc.nextInt();

            hierarchy
                .computeIfAbsent(manager, k -> new ArrayList<>())
                .add(employee);
        }

        System.out.println("Employee Hierarchy:");

        for (int manager : hierarchy.keySet()) {
            int total = countEmployees(manager);

            System.out.println(
                "Manager " + manager +
                " -> " + total + " employees"
            );
        }

        sc.close();
    }
}

Input
6
2 1
3 1
4 2
5 2
6 3
7 3
  Output
Employee Hierarchy:
Manager 1 -> 6 employees
Manager 2 -> 2 employees
Manager 3 -> 2 employees
