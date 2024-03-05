package Dynamic;
import java.util.*;
import java.io.*;

public class B_1463_1로만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(recur(num, 0)));
        bw.flush();
        bw.close();
    }
    public static int recur(int num, int index) {
        if (num < 2)
            return index;
        return Math.min(recur(num / 2, index + 1 + (num % 2)) , recur(num / 3 , index + 1 + (num % 3)));
    }
}
