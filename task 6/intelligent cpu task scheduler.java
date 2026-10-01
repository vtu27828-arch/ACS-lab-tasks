import java.util.*;

public class Main {

    static class Task {
        int start;
        int end;
        int priority;

        Task(int start, int end, int priority) {
            this.start = start;
            this.end = end;
            this.priority = priority;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Task[] tasks = new Task[n];

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int priority = sc.nextInt();

            tasks[i] = new Task(start, end, priority);
        }

        // Sort by ending time
        Arrays.sort(tasks, (a, b) -> a.end - b.end);

        int lastEnd = -1;
        int count = 0;

        System.out.println("Selected Tasks:");

        for (Task task : tasks) {
            if (task.start >= lastEnd) {
                System.out.println(
                    "Start: " + task.start +
                    " End: " + task.end +
                    " Priority: " + task.priorityInput
5
1 3 2
2 5 3
4 6 1
6 8 4
5 7 2

Each task contains:

Start_Time End_Time Priority
Output
Selected Tasks:
Start: 1 End: 3 Priority: 2
Start: 4 End: 6 Priority: 1
Start: 6 End: 8 Priority: 4
Total Tasks Scheduled: 3
                );

                lastEnd = task.end;
                count++;
            }
        }

        System.out.println("Total Tasks Scheduled: " + count);

        sc.close();
    }
}


