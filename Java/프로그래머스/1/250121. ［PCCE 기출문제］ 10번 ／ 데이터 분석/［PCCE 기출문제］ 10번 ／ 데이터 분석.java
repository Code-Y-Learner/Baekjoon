import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> index = new HashMap<>();
        index.put("code" , 0);
        index.put("date", 1);
        index.put("maximum", 2);
        index.put("remain", 3);
        
        int m = data.length;
        List<int[]> filteredList = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            if (data[i][index.get(ext)] < val_ext)
                filteredList.add(data[i]);
        }
        
        filteredList.sort(Comparator.comparingInt(row -> row[index.get(sort_by)] ));
        
        return filteredList.toArray(new int[filteredList.size()][]);
    }
}