class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer = answer <= n ? answer + numbers[i] : answer;
        }
        return answer;
    }
}