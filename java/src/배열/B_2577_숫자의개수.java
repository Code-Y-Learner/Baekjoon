package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2577_숫자의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 1;
        for (int i = 0; i < 3; i++) {
            num *= Integer.parseInt(br.readLine());
        }
        int[] answer = new int[10];
        while (num > 0) {
            answer[num % 10]++;
            num /= 10;
        }
        for (int n:answer){
            System.out.println(n);
        }
    }
}
