package 연습;

import java.io.*;
import java.util.*;

//2577 각 숫자별 카운팅 배열을 만드는 방법을 그대로 사용 9를 6으로 바꿔 저장 배열 크기는 따라서 10 -> 9
//카운팅 배열에서 6 숫자를 재설정해주고 마지막으로 카운팅 배열의 최댓값 출력
public class B_3046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        bw.write(String.valueOf(2 * b - a));
        bw.flush();
        bw.close();

    }
}
