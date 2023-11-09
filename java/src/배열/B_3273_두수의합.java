package 배열;

import java.util.*;
import java.io.*;

//O(n^2) 버블정렬과 비슷한 알고리즘으로 numbers 배열을 돌면서 목표값과 같은 수를 출력
// 자바의 입출력을 위해서 StringTokenizer를 사용 nextToken()을 통해 값을 입력 받음

public class B_3273_두수의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] numbers = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers);
        int target = Integer.parseInt(br.readLine());
        int answer = 0, start = 0, end = num - 1;
        while (start < end) {
            int sum = numbers[start] + numbers[end];
            if (sum <= target) {
                if (sum == target)
                    answer++;
                start++;
            }
            else
                end--;
        }
        System.out.println(answer);
    }
}