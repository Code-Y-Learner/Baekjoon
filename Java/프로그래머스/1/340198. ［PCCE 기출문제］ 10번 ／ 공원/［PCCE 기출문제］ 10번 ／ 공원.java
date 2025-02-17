import java.util.*;
//import java.math.*;
class Solution {
    public int solution(int[] mats, String[][] park) {
        int n = park.length, m = park[0].length;
        int[][] dp = new int[n][m];

        // 사람이 없는 곳을 1, 사람이 있는 곳을 0으로 변환
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = park[i][j].equals("-1") ? 1 : 0;
            }
        }

        int maxSize = 0;

        // DP 적용하여 최대 정사각형 크기 찾기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dp[i][j] == 1 && i > 0 && j > 0) {
                    dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]) + 1;
                }
                maxSize = Math.max(maxSize, dp[i][j]);
            }
        }

        // 돗자리 크기를 내림차순 정렬 후 가장 큰 값 찾기
        Arrays.sort(mats);
        for (int i = mats.length - 1; i >= 0; i--) {
            if (mats[i] <= maxSize) return mats[i];
        }

        return -1;
    }
}