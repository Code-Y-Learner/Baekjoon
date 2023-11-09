package DFS;

import java.util.*;
import java.io.*;

public class B_2606_바이러스 {
    static boolean[] visited;
    static int[][] network;
    static int answer;
    static int size;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        size = Integer.parseInt(br.readLine());
        network = new int[size][size];
        visited = new boolean[size];
        int lines = Integer.parseInt(br.readLine());
        for (int i = 0; i < lines; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            network[a][b] = network[b][a] = 1;
        }
        dfs(0);
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    private static void dfs(int i) {
        visited[i] = true;

        for (int j = 0; j < size; j++) {
            if (network[i][j] == 1 && visited[j] == false){
                answer++;
                dfs(j);
            }
        }
    }
}
