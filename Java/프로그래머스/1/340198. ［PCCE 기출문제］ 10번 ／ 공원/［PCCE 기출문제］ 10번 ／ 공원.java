import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int ly = park.length, lx = park[0].length;
        int dp[][] = new int[ly][lx];
        for (int i = 0; i < ly; i++) {
            for (int j = 0; j < lx; j++) {
                dp[i][j] = park[i][j].equals("-1") ? 1 : 0;
            }
        }
        int answer = 0;
        for (int i = 0; i < ly; i++) {
            for(int j = 0; j < lx; j++) {
                if (dp[i][j] == 1 && i > 0 && j > 0) {
                    dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i][j-1]), dp[i-1][j-1]) + 1;
                }
                answer = Math.max(answer, dp[i][j]);
            }
        }
        Arrays.sort(mats);
        for (int i = mats.length - 1; i >= 0; i--) {
            if (mats[i] <= answer)
                return mats[i];
        }
        
        return -1;
    }
}