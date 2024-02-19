package 그래프;
import java.io.*;
import java.util.*;

public class B_11724_연결요소의개수 {
    static boolean [] visited;
    static int [][] map;
    static int size;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        size = Integer.parseInt(st.nextToken());
        int line = Integer.parseInt(st.nextToken());
        
        map = new int[size][size];
        visited = new boolean[size];
        
        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken()) - 1;
            int x = Integer.parseInt(st.nextToken()) - 1;
            map[y][x] = 1;
            map[x][y] = 1;
        }
        int answer = 0;
        for (int i = 0; i < size; i++) {
            if (!visited[i]) {
                dfs(i);
                answer++;
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
    
    public static void dfs(int index) {
        if (visited[index])
            return ;
        visited[index] = true;
        for (int i = index + 1; i < size; i++) {
            if (map[index][i] == 1) {
                dfs(i);
            }
        }
    }
}
