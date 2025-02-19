import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < yearning.length; i++) {
            map.put(name[i],yearning[i]);
        }
        int[] answer = new int[photo.length];
        int index = 0;
        for (String[] row: photo) {
            for (String str: row) {
                //System.out.println("index: " + index +" name " + str);
                if (map.get(str) != null)
                    answer[index] += map.get(str);
            }
            index++;
        }
        return answer;
    }
}