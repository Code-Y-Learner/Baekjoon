package 스택;

import java.util.*;
import java.io.*;

public class B_1874_스택수열 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int stack_num = stack.peek();
        for (int i = 0; i < num; i++) {
            int input_num = Integer.parseInt(br.readLine());
            while (stack_num < input_num) {
                stack.push(++stack_num);
                sb.append("+\n");
            }
            if (stack.peek() == input_num) {
                stack.pop();
                sb.append("-\n");
            }
            else {
                bw.write("no\n");
                bw.flush();
                bw.close();
                return ;
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
