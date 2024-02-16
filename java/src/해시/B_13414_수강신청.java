package 해시;
import java.util.*;
import java.io.*;

public class B_13414_수강신청 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int pass = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        LinkedHashSet<String> studentMap = new LinkedHashSet<>(num);
        for (int i = 0; i < num; i++) {
            String student = br.readLine();
            if (studentMap.contains(student)) {
                studentMap.remove(student);
            }
            studentMap.add(student);
        }
        for (String str : studentMap) {
            if (pass <= 0)
                break;
            bw.write(str + "\n");
            bw.flush();
            pass--;
        }
        bw.close();
    }
}
