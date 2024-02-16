package 해시;
import java.util.*;
import java.io.*;

public class B_1620_나는야포켓몬마스터이다솜 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> dogam = new HashMap<>(num1);
        HashMap<String, Integer> dogam2 = new HashMap<>(num1);
        for (int i = 0; i < num1; i++) {
            String pokemon = br.readLine();
            dogam.put(i, pokemon);
            dogam2.put(pokemon, i);
        }
        for (int i = 0; i < num2; i++) {
            String str = br.readLine();
            if (Character.isDigit(str.charAt(0))) {
                sb.append(dogam.get(Integer.parseInt(str) - 1));
                sb.append("\n");
            }
            else {
                sb.append(dogam2.get(str) + 1);
                sb.append("\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
