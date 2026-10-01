import java.util.*;

public class Main {

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] grid = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int startRow = sc.nextInt();
        int startCol = sc.nextInt();

        int meetingRow = sc.nextInt();
        int meetingCol = sc.nextInt();

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];

        queue.offer(new int[]{startRow, startCol, 0});
        visited[startRow][startCol] = true;

        int answer = -1;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            int row = current[0];
            int col = current[1];
            int distance = current[2];

            if (row == meetingRow && col == meetingCol) {
                answer = distance;
                break;
            }

            for (int i = 0; i < 4; i++) {
                int newRow = row + dr[i];
                int newCol = col + dc[i];

                if (newRow >= 0 && newRow < m &&
                    newCol >= 0 && newCol < n &&
                    grid[newRow][newCol] == 0 &&
                    !visited[newRow][newCol]) {

                    visited[newRow][newCol] = true;

                    queue.offer(
                        new int[]{newRow, newCol, distance + 1}
                    );
                }
            }
        }

        if (answer == -1) {
            System.out.println("Meeting point cannot be reached");
        } else {
            System.out.println("Shortest Emergency Route: " + answer);
        }

        sc.close();
    }
}

Input
5 5
0 0 0 0 0
0 1 1 1 0
0 0 0 1 0
0 1 0 0 0
0 0 0 0 0
0 0
4 4

  Output
Shortest Emergency Route: 8
