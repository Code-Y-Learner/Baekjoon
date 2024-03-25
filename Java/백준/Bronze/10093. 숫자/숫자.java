import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int m = Math.max(B - A - 1, A - B -1);
        System.out.println(String.valueOf(Math.max(m, 0)));
        for(int i = 0; i < m; i++) {
            System.out.print(String.valueOf(Math.min(A, B) + i + 1)+ " ");
        }
    }
}
