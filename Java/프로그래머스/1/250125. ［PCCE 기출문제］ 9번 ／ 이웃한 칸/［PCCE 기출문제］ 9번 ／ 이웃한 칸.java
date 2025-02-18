class Solution {
    public int solution(String[][] board, int h, int w) {
        int n = board[0].length;
        int answer = 0;
        int dx[] = {0, 1, -1, 0};
        int dy[] = {1, 0, 0, -1};
        for (int i = 0; i < 4; i++) {
            int x_check = w + dx[i];
            int y_check = h + dy[i];
            if (x_check >= 0 && x_check < n && y_check >= 0 && y_check <n) {
                if (board[y_check][x_check].equals(board[h][w]))
                    answer++;
            }
        }
        return answer;
    }
}