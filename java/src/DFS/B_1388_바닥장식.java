package DFS;

import java.util.*;
import java.io.*;

public class B_1388_바닥장식 {
    static boolean[][] visited;
    static int row;
    static int col;
    static char[][] floor;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        col = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());
        visited = new boolean[col][row];
        floor = new char[col][row];
        for (int i = 0; i < col; i++) {
            String row_floor = br.readLine();
            for (int j = 0; j < row; j++) {
                floor[i][j] = row_floor.charAt(j);
            }
        }
        int answer = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (visited[i][j])
                    continue;
                dfs(i, j, floor);
                answer++;
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    private static void dfs(int x, int y, char[][] floor) {
        visited[x][y] = true;
        if (floor[x][y] == '-') {
            y++;
            if (y < row && floor[x][y] == '-')
                dfs(x, y, floor);
        }
        else {
            x++;
            if (x < col && floor[x][y] == '|')
                dfs(x, y, floor);
        }
    }
}
