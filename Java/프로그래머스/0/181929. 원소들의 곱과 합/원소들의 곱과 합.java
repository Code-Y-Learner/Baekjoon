class Solution {
    public int solution(int[] num_list) {
        int sum = 1;
        int sum2 = 0;
        for (int num:num_list) {
            sum *= num;
            sum2 += num;
        }
        return (sum < sum2 * sum2) ? 1 : 0;
    }
}