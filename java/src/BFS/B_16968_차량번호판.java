package BFS;

import java.io.*;
import java.util.*;

public class B_16968_차량번호판 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strformat = br.readLine();
        char prev = ' ';
        int dup = 0;
        int answer = 1;
        for(char c:strformat.toCharArray()) {
            if (prev == c)
                dup = 1;
            else
                dup = 0;
            if (c == 'c')
                answer *= (26 - dup);
            else
                answer *= (10 - dup);
            prev = c;
        }
        System.out.println(answer);
    }
}
