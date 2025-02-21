import java.util.*;

class Solution {
    public int solution(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        int answer = 0;
        String word = "";
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                answer += answer * 9 + c - '0';
            }
            else{
                word += c;
                if (map.get(word) != null){
                    answer += answer * 9 + map.get(word);
                    word = "";
                }
            }
        }
        return answer;
    }
}