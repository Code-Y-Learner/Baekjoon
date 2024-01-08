package 구현;

import java.util.*;
import java.io.*;

public class B_14467_소가길을건넌이유1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int line = Integer.parseInt(br.readLine());
        int[] cows = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        int answer = 0;
        for (int i = 0; i < line; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int index = Integer.parseInt(st.nextToken()) - 1;
            int cross = Integer.parseInt(st.nextToken());
            if (cows[index] != 2 && cows[index] != cross)
                answer++;
            cows[index] = cross;
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
