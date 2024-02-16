package 스택;

import java.io.*;
import java.util.*;

public class B_28278_스택2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String action = st.nextToken();
            if (action.equals("1")) {
                stack.push(Integer.parseInt(st.nextToken()));
            }
            else if (action.equals("2")) {
                if (!stack.isEmpty()) {
                    bw.write(String.valueOf(stack.peek()) + "\n");
                    bw.flush();
                    stack.pop();
                }
                else {
                    bw.write("-1\n");
                    bw.flush();
                }
            }
            else if (action.equals("3")) {
                bw.write(String.valueOf(stack.size()) + "\n");
                bw.flush();
            }
            else if (action.equals("5")){
                if (!stack.isEmpty()) {
                    bw.write(String.valueOf(stack.peek()) + "\n");
                    bw.flush();
                }
                else {
                    bw.write("-1\n");
                    bw.flush();
                }
            }
            else {
                if (stack.isEmpty()){
                    bw.write("1\n");
                    bw.flush();
                }
                else {
                    bw.write("0\n");
                    bw.flush();
                }
            }
        }
        bw.close();
    }
}
