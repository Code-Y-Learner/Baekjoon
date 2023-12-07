package 투포인터;

import java.util.*;
import java.io.*;

public class B_2230_수고르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int iter_num = Integer.parseInt(st.nextToken());
        int minimum = Integer.parseInt(st.nextToken());
        int[] numbers = new int[iter_num];
        int answer = 2000000001;
        for (int i = 0; i < iter_num; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(numbers);
        for (int start = 0; start < iter_num; start++) {
            int end = start + 1;
            while (end < iter_num && numbers[end] - numbers[start] < minimum)
                end++;
            if (end == iter_num)
                break;
            answer = Math.min(numbers[end] - numbers[start], answer);
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
