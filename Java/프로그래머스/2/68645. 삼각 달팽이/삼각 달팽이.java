class Solution {
    public int[] solution(int n) {
        int[][] triangle = new int[n][n];
        int index = 1, x = 0, y = 0;
        while (true) {
            // 아래로 이동
            while (true) {
                triangle[y][x] = index++;
                //아래를 다 채우거나 이미 채워졌을때
                if (y + 1 == n || triangle[y + 1][x] != 0) break;
                y++;
            }
            // 오른쪽 갈 수 있는지 확인
            if (x + 1 == n || triangle[y][x + 1] != 0) break;
            x++;

            // 오른쪽 이동
            while (true) {
                triangle[y][x] = index++;
                //오른쪽 끝에 도달하거나 이미 채워진 경우
                if (x + 1 == n || triangle[y][x + 1] != 0) break;
                x++;
            }
            //왼쪽 위 확인
            if (triangle[y - 1][x - 1] != 0) break;
            x--;
            y--;
            
            //
            while (true) {
                triangle[y][x] = index++;
                //
                if (triangle[y - 1][x - 1] != 0) break;
                y--;
                x--;
            }
            //
            if (y + 1 == n || triangle[y + 1][x] != 0) break;
            y++;
        }
        
        int[] result = new int[index - 1];
        index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                result[index++] = triangle[i][j];
            }
        }
        return result;
    }
}
