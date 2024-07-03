class Solution {
    public String solution(String polynomial) {
        int x = 0;
        int y = 0;
        for (String str:polynomial.split(" ")) {
            int len = str.length();
            if ((str.charAt(len - 1)) == 'x'){
                if (str.equals("x"))
                    x += 1;
                else
                    x += Integer.parseInt(str.substring(0, len - 1));
            }
            else if (str.charAt(0) == '+')
                continue;
            else if (str.equals(""))
                continue;
            else
                y += Integer.parseInt(str);
        }
        String answer = "";
        if (x == 0) {
            if (y != 0)
                answer += String.valueOf(y);
        }
        else if (y == 0) {
            if (x != 0) {
                if (x == 1)
                    answer += "x";
                else
                    answer += String.valueOf(x) + "x";
            }
        }
        else if (x !=0 && y != 0) {
            if (x == 1)
                answer += "x + " + String.valueOf(y);
            else
                answer += String.valueOf(x) + "x + " + String.valueOf(y);
        }
        return answer;
    }
}