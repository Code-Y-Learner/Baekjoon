package 배열;

import java.io.*;
import java.util.*;

//기본적인 버퍼리더를 통한 입출력 방법을 사용
//String을 char배열로 바꿔 아스키 코드 배열을 이용 97 : a
//throws IOException이 필요함
public class B_10808_알파벳개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        int[] answer = new int[26];
        char[] word = temp.toCharArray();
        for (char s:word) {
            answer[s - 97]++;
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
