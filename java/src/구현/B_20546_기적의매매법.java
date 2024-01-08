package 구현;

import java.util.*;
import java.io.*;

public class B_20546_기적의매매법 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int all_a = Integer.parseInt(br.readLine());
        int all_b = all_a;
        int conditionB = 0;
        int contA = 0; int contB = 0; int prev =0;
        for (int i = 0; i < 14; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            if (all_a % price > 0) {
                contA += all_a % price;
                all_a -= price * (all_a % price);
            }
            if (price > prev && i != 0) {
                if (conditionB >= 0)
                    conditionB++;
                else
                    conditionB = 0;
            }
            else if (price == prev){
                conditionB = 0;
            }
            else {
                if (conditionB <= 0)
                    conditionB--;
                else
                    conditionB = 0;
            }
            if (conditionB > 1) {
                contB += all_b % price;
                all_b -= price * (all_b % price);
            }
            if (conditionB < -1) {
                all_b += price * (contB % price);
                contB -= all_b % price;
            } 
            prev = price;
        }
    }
}
