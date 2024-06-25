class Solution {
    public String[] solution(String[] quiz) {
        int index = 0;
        int a1 = 0;
        String[] answer = new String[quiz.length];
        for (String qu:quiz) {
            String[] qui = qu.split(" ");
            if (qui[1].equals("+")) {
                a1 = Integer.parseInt(qui[0]) + Integer.parseInt(qui[2]);
            }
            else {
                a1 = Integer.parseInt(qui[0]) - Integer.parseInt(qui[2]);
            }
            if (a1 == Integer.parseInt(qui[4])){
                answer[index++] = "O";
            }
            else {
                answer[index++] = "X";
            }
        }
        return answer;
    }
}