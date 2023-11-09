package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//2577 각 숫자별 카운팅 배열을 만드는 방법을 그대로 사용 9를 6으로 바꿔 저장 배열 크기는 따라서 10 -> 9
//카운팅 배열에서 6 숫자를 재설정해주고 마지막으로 카운팅 배열의 최댓값 출력
public class B_1475_방번호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num_count = new int[9];
        String strnum = br.readLine();
        for(int i = 0; i < strnum.length(); i++) {
            if (strnum.charAt(i) == '6' || strnum.charAt(i) == '9')
                num_count[6]++;
            else
                num_count[strnum.charAt(i) - 48]++;
        }
        num_count[6] = num_count[6] / 2 + num_count[6] % 2;
        System.out.println(Arrays.stream(num_count).max().getAsInt());
    }
}
