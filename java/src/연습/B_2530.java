package 연습;

import java.io.*;
import java.util.*;

public class B_2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int time = 3600 * Integer.parseInt(st.nextToken());
        time += 60 * Integer.parseInt(st.nextToken());
        time += Integer.parseInt(st.nextToken());
        time += Integer.parseInt(br.readLine());
        int hour = (time / 3600) % 24;
        int m = (time / 60) % 60 ;
        int s = (time % 60);
        System.out.println(hour + " " + m + " " + s);
    }
}
