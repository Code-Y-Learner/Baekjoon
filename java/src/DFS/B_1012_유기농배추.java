package DFS;

import java.io.*;
import java.util.*;

public class B_1012_유기농배추 {
    static boolean[][] map;
    static boolean[][] visited;
    static int width;
    static int height;
    static int answer;
    static int dx[] = {0, 0, 1, -1};
    static int dy[] = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int iter = Integer.parseInt(br.readLine());
        for (int i = 0; i < iter; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            width = Integer.parseInt(st.nextToken());
            height = Integer.parseInt(st.nextToken());
            map = new boolean[height][width];
            visited = new boolean[height][width];
            int num = Integer.parseInt(st.nextToken());
            answer = 0;
            for (int j = 0; j < num; j++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                int nx = Integer.parseInt(st2.nextToken());
                int ny = Integer.parseInt(st2.nextToken());
                map[ny][nx] = true;
            }
            for (int k = 0; k < height; k++) {
                for (int l = 0; l < width; l++) {
                    if (map[k][l] && !visited[k][l]) {
                        dfs(k, l);
                    }
                }
            }
            System.out.println(answer);
        }
    }

    public static void dfs(int y, int x) {
        visited[y][x] = true;
        answer++;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < width && ny < height) {
                if (map[ny][nx] && !visited[ny][nx]) {
                    answer--;
                    dfs(ny, nx);
                }
            }
        }
    }
}
