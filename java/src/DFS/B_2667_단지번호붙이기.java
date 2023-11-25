package DFS;

import java.io.*;
import java.util.*;

public class B_2667_단지번호붙이기 {
    static boolean[][] visited;
    static boolean[][] map;
    static int size;
    static int apartNum;
    static int[] aparts = new int[25 * 25];
    static int dx[] = {0, 0, 1, -1};
    static int dy[] = {1, -1, 0, 0};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        size = Integer.parseInt(br.readLine());
        map = new boolean[size][size];
        visited = new boolean[size][size];
        for (int i = 0; i < size; i++)  {
            String line = br.readLine();
            for (int j = 0; j < size; j++) {
                map[i][j] = line.charAt(j) == '1';
            }
        }
        for (int i = 0; i < size; i++)  {
            for (int j = 0; j < size; j++) {
                if (map[i][j] && !visited[i][j]) {
                    apartNum++;
                    dfs(i, j);
                }
            }
        }
        Arrays.sort(aparts);
        bw.write(apartNum + "\n");
        bw.flush();
        for (int i = 0; i < aparts.length; i++) {
            if (aparts[i] > 0){
                bw.write(aparts[i] + "\n");
                bw.flush();
            }
        }
        bw.close();
    }

    public static void dfs(int col, int row) {
        visited[col][row] = true;
        aparts[apartNum]++;
        for (int i = 0; i < 4; i++) {
            int nx = col + dx[i];
            int ny = row + dy[i];
            if (nx >= 0 && ny >= 0 && nx < size && ny < size) {
                if (map[nx][ny] && !visited[nx][ny]) {
                    dfs(nx,ny);
                }
            }
        }
    }
}
