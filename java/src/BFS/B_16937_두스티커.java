package BFS;

import java.util.*;
import java.io.*;

public class B_16937_두스티커 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int iter_num = Integer.parseInt(br.readLine());
        int [][] stickers = new int[iter_num][3];
        for (int i = 0; i < iter_num; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            stickers[i][0] = Integer.parseInt(st2.nextToken());
            stickers[i][1] = Integer.parseInt(st2.nextToken());
            stickers[i][2] = stickers[i][0] * stickers[i][1];
        }
        int answer = 0;

        calcArea(stickers);
    }

    private static void calcArea(int[][] stickers) {
        for (int i = 0; i < stickers.length - 1; i++) {
            for (int j = i + 1; j < stickers.length; j++) {
                
            }
        }
    }
}
