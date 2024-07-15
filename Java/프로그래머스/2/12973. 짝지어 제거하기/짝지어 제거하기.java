import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> spell = new Stack<>();
        for (char c : s.toCharArray()) {
            if (spell.isEmpty())
                spell.push(c);
            else {
                if (spell.peek() == c) {
                    spell.pop();
                }
                else
                    spell.push(c);
            }
        }
        if (spell.isEmpty())
            answer = 1;
        return answer;
    }
}