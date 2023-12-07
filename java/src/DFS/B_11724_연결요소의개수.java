package DFS;

import java.io.*;
import java.util.*;

public class B_11724_연결요소의개수 {
    static boolean[][] maps;
    static boolean[] visited;
    static int size;
    static int answer;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        size = Integer.parseInt(st.nextToken());
        maps = new boolean[size][size];
        visited = new boolean[size];
        int iter = Integer.parseInt(st.nextToken());
        for (int i = 0; i < iter; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st2.nextToken()) - 1;
            int x = Integer.parseInt(st2.nextToken()) - 1;
            maps[y][x] = maps[x][y] = true;
        }
        for (int i = 0; i < size; i++) {
            if (!visited[i])
                dfs(i);
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
    public static void dfs(int start) {
        answer++;
        visited[start] = true;
        for (int i = 0; i < size; i++) {
            if (maps[start][i] && !visited[i]) {
                answer--;
                dfs(i);
            }
        }
    }
}
