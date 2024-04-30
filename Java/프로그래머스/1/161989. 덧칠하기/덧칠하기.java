class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int j = 0;
        for (int i = 1; i < section.length; i++) {
            if (section[i] > section[j] + m - 1){
                answer++;
                j = i;
            }
        }
        return answer;
    }
}