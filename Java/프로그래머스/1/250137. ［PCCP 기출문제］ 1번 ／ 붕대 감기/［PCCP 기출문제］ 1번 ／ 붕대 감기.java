

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int[] times = new int[attacks.length];
        int index = 0;
        index = 0;
        int index2 = 0;
        for (int i = 0; i < attacks[attacks.length - 1][0] + 1; i++) {
            if (i == attacks[index][0]) {
                answer -= attacks[index][1];
                index++;
                index2 = 0;
            }
            else {
                index2++;
                answer = (answer + bandage[1] > health) ? health : answer + bandage[1];
                if (index2 % bandage[0] == 0) {
                    answer = (answer + bandage[2] > health) ? health : answer + bandage[2];
                    index2 = 0;
                }
            }
            if (answer < 1)
                return -1;
        }
        return answer;
    }
}