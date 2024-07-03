class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] index = new int[200];
        for (int[] line:lines) {
            for (int i = line[0] + 100; i < line[1] + 100; i++) {
                index[i] += 1;
            }
        }
        for (int num: index) {
            if (num > 1)
                answer++;
        }
        return answer;
    }
}