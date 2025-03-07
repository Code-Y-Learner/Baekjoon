import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][] dp;
    static int[] W;     //weight
    static int[] V;     //value

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        W = new int[N];
        V = new int[N];

        dp = new int[N][K + 1];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            W[i] = Integer.parseInt(st.nextToken());
            V[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(knapsack(N - 1, K));

    }

    static int knapsack(int i, int k) {
        if (i < 0)
            return 0;
        // 탐색하지 않은 위치라면?
        if (dp[i][k] == 0) {
            // 현재 물건(i)을 추가로 못담는 경우 (이전 i값 탐색)
            if(W[i] > k) {
                dp[i][k] = knapsack(i - 1, k);
            }
            // 현재 물건(i)을 담을 수 있는 경우
            else {
                // 이전 i값과 이전 i값에 대한 k-W[i]의 값 + 현재 가치(V[i])중 큰 값을 저장
                dp[i][k] = Math.max(knapsack(i - 1, k), knapsack(i - 1, k - W[i]) + V[i]);
            }
        }
        return dp[i][k];
    }
}
