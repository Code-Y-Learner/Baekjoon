package 투포인터;

import java.io.*;
import java.util.*;

public class B_1806_부분합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int iter_num = Integer.parseInt(st.nextToken());
        int obj = Integer.parseInt(st.nextToken());
        int[] numbers = new int[iter_num];
        int answer = 100001;
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < iter_num; i++) {
            numbers[i] = Integer.parseInt(st2.nextToken());
        }
        int start = 0, end = 0, sum = 0;
        while (true) {
            if (sum >= obj) {
                sum -= numbers[start];
                answer = Math.min(end - start, answer);
                start++;
            }
            else if (end == iter_num)
                break ;
            else
                sum += numbers[end++];
        }
        if (answer == 100001)
            answer = 0;
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
