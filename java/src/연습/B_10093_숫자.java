package 연습;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class B_10093_숫자 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long m = Math.max(B - A - 1, A - B -1);
        System.out.println(String.valueOf(Math.max(m, 0)));
        for(long i = 0; i < m; i++) {
            System.out.print(String.valueOf(Math.min(A, B) + i + 1)+ " ");
        }
    }
}
