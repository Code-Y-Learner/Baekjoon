package 배열;

import java.io.*;
import java.util.*;

public class B_10807_개수세기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] numbers = new int[201];

        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            numbers[Integer.parseInt(st.nextToken()) + 100]++;
        }
        bw.write(String.valueOf(numbers[Integer.parseInt(br.readLine()) + 100]));
        bw.flush();
        bw.close();
    }
}
