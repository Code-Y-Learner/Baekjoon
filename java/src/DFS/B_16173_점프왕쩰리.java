package DFS;

import java.io.*;
import java.util.*;

public class B_16173_점프왕쩰리 {

    static int[][] maps;
    static boolean answer;
    static boolean[][] visited;
    static int num;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        num = Integer.parseInt(br.readLine());
        maps = new int[num][num];
        visited = new boolean[num][num];
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < num; j++) {
                maps[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0, 0);
        if (answer) {
            bw.write("HaruHaru\n");
            bw.flush();
        }
        else {
            bw.write("Hing\n");
            bw.flush();
        }
        bw.close();
    }

    public static void dfs(int y, int x) {
        if (maps[y][x] == -1) {
            answer = true;
            return ;
        }
        visited[y][x] = true;
        int[] dx = {0, 1};
        int[] dy = {1, 0};
        for (int k = 0; k < 2; k++) {
            int nx = x + dx[k] * maps[y][x];
            int ny = y + dy[k] * maps[y][x];
            if (nx >= 0 && ny >= 0 && nx < num && ny < num) {
                if (!visited[ny][nx])
                    dfs(ny , nx);
            }
        }
    }
}
