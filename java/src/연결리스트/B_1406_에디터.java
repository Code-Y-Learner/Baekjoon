package 연결리스트;

import java.io.*;
import java.util.*;

public class B_1406_에디터 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        Stack<Character> reverse = new Stack<>();
        String str = br.readLine();
        for (char c:str.toCharArray()) {
            left.push(c);
        }
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i< num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String sep = st.nextToken();
            if (sep.equals("P")) {
                left.push(st.nextToken().charAt(0));
            }
            else if (sep.equals("L")) {
                if (!left.isEmpty())
                    right.push(left.pop());
            }
            else if (sep.equals("B")) {
                if (!left.isEmpty())
                    left.pop();
            }
            else {
                if (!right.isEmpty())
                    left.push(right.pop());
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!right.isEmpty()) {
            left.push(right.pop());
        }
        while (!left.isEmpty()) {
            reverse.push(left.pop());
        }
        while (!reverse.isEmpty()) {
            sb.append(reverse.pop());
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
